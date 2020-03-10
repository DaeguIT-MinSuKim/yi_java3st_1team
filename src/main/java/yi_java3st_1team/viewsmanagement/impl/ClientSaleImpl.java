package yi_java3st_1team.viewsmanagement.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.viewsmanagement.dao.ClientSaleDao;

public class ClientSaleImpl implements ClientSaleDao {
	private static final ClientSaleImpl Instance = new ClientSaleImpl();
	
	public ClientSaleImpl() {}
	
	public static ClientSaleImpl getInstance( ) {
		return Instance;
	}

	@Override
	public List<Order> selectOrderSaleGroupByDno(Connection con, Product prd, Client client) throws SQLException {
		String sql = "select	c.c_name as 고객상호명,\r\n" + 
				"		p.p_name as 품목명,\r\n" + 
				"		o.o_qty as 주문수량,\r\n" + 
				"		(case o.o_dps when '0' then '미입금' when '1' then '완료'	end) as 입금여부,\r\n" + 
				"		p.p_price as 판매가격,\r\n" + 
				"		o.o_qty*p.p_price as 매출금,\r\n" + 
				"		(case o.o_dps when '0' then format(o.o_qty*p.p_price, 0) when '1' then '-' end) as 미수금\r\n" + 
				"  from client c natural join `order` o natural join product p\r\n" + 
				" where c.c_no = o.o_cno and p.p_no = o.o_pno;";
		List<Order> list = new ArrayList<>();
		try(PreparedStatement pstmt = con.prepareStatement(sql);){
			try(ResultSet rs = pstmt.executeQuery()){
				while(rs.next()) {
					list.add(getClientSaleJoin(rs));
				}
			}
		}
		return list;
	}

	private Order getClientSaleJoin(ResultSet rs) throws SQLException {
		Client client = new Client();
		client.setcName(rs.getString("c_name"));
		Product prd1 = new Product(rs.getInt("p_no"));
		prd1.setpName(rs.getString("p_name"));
		int oQty = rs.getInt("o_qty");
		int oDps = rs.getInt("o_dps");
		Product prd2 = new Product();
		prd2.setpPrice(rs.getInt("p_price"));
		int price = oQty*prd2;
		int yet = rs.getInt(price);

		return new Order(client, prd1, oQty, oDps, prd2, price, yet);
	}

}
