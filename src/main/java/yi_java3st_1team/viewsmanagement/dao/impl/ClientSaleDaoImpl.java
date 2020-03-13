package yi_java3st_1team.viewsmanagement.dao.impl;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.util.LogUtil;
import yi_java3st_1team.viewsmanagement.dao.ClientSaleDao;
import yi_java3st_1team.viewsmanagement.dto.ClientSale;

public class ClientSaleDaoImpl implements ClientSaleDao {
	private static final ClientSaleDaoImpl Instance = new ClientSaleDaoImpl();
	
	public ClientSaleDaoImpl() {}
	
	public static ClientSaleDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public List<ClientSale> selectClientSaleByAll() {
		String sql = "select	c.c_name as 고객상호명, " + 
				"		p.p_name as 품목명, " + 
				"		o.o_qty as 주문수량, " + 
				"		(case o.o_dps when '0' then '미입금' when '1' then '완료'	end) as 입금여부, " + 
				"		p.p_price as 판매가격, " + 
				"		o.o_qty*p.p_price as 매출금, " + 
				"		(case o.o_dps when '0' then o.o_qty*p.p_price when '1' then '0' end) as 미수금 " + 
				"  from client c natural join `order` o natural join product p " + 
				" where c.c_no = o.o_cno and p.p_no = o.o_pno";
		List<ClientSale> list = new ArrayList<ClientSale>();
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			while(rs.next()) {
				ClientSale clientSale = new ClientSale();
				clientSale.setC_name(rs.getString(1));
				clientSale.setP_name(rs.getString(2));
				clientSale.setO_qty(rs.getInt(3));
				clientSale.setO_dps(rs.getString(4));
				clientSale.setP_price(rs.getInt(5));
				clientSale.setSalesMoney(rs.getInt(6));
				clientSale.setUncollected(rs.getInt(7));
				
				list.add(clientSale);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public List<ClientSale> procedureClientSaleByCName(ClientSale cs) throws SQLException {
		List<ClientSale> list = new ArrayList<ClientSale>();
		String sql = "{call clientSale(?)}";
		Connection con = MySqlDataSource.getConnection();
		try(CallableStatement cstmt = con.prepareCall(sql);){
			cstmt.setString(1, cs.getC_name());
			LogUtil.prnLog(cstmt);
			try(ResultSet rs = cstmt.executeQuery()){
				while(rs.next()) {
					ClientSale clientSale = new ClientSale();
					clientSale.setC_name(rs.getString(1));
					clientSale.setP_name(rs.getString(2));
					clientSale.setO_qty(rs.getInt(3));
					clientSale.setO_dps(rs.getString(4));
					clientSale.setP_price(rs.getInt(5));
					clientSale.setSalesMoney(rs.getInt(6));
					clientSale.setUncollected(rs.getInt(7));
					
					list.add(clientSale);
//					list.add(getClientSale(rs));
				}
			}
		}
		return list;
	}

//	private ClientSale getClientSale(ResultSet rs) throws SQLException {
//		String c_name = rs.getString("c_name");
//		String p_name = rs.getString("p_name");
//		int o_qty = rs.getInt("o_qty");
//		String o_dps = rs.getString("o_dps");
//		int p_price = rs.getInt("p_price");
//		int salesMoney = rs.getInt("salesMoney");
//		int uncollected = rs.getInt("uncollected");
//		return new ClientSale(c_name, p_name, o_qty, o_dps, p_price, salesMoney, uncollected);
//	}

}
