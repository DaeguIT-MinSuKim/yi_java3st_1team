package yi_java3st_1team.viewsmanagement.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.viewsmanagement.dao.SWSaleDao;
import yi_java3st_1team.viewsmanagement.dto.ClientSale;
import yi_java3st_1team.viewsmanagement.dto.SWSale;

public class SWSaleDaoImpl implements SWSaleDao {
	private static final SWSaleDaoImpl Instance = new SWSaleDaoImpl();
	
	public SWSaleDaoImpl() {}

	public static SWSaleDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public List<SWSale> selectSWSaleByAll() {
		String sql = "select	p.p_name as 품목명, " + 
				"		cate.cate_name as 분류, " + 
				"		s.s_name as 공급회사명, " + 
				"		o.o_qty*p.p_cost as 공급금액, " + 
				"		o.o_qty*p.p_price as 판매금액, " + 
				"		(case when (o.o_qty >= 50 and o.o_qty < 100) then format(o.o_qty*p.p_price*0.1, 0) " + 
				"			  when o.o_qty >= 100 then format(o.o_qty*p.p_price*0.15, 0) " + 
				"		 else '0'	end) as 할인금액, " + 
				"		(case when (o.o_qty >= 50 and o.o_qty < 100) then format(o.o_qty*p.p_price*0.9-(o.o_qty*p.p_cost),0) " + 
				"			  when o.o_qty >= 100 then format(o.o_qty*p.p_price*0.85-(o.o_qty*p.p_cost),0) " + 
				"		 else format((o.o_qty*p.p_price)-(o.o_qty*p.p_cost),0)	end) as 판매이윤 " + 
				"  from product p natural join `order` o natural join supplier s natural join category cate " + 
				" where p.p_no = o.o_pno and cate.cate_no = p.p_cate and s.s_no = p.p_sno;";
		List<SWSale> list = new ArrayList<SWSale>();
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			while(rs.next()) {
				SWSale swSale = new SWSale();
				swSale.setP_name(rs.getString(1));
				swSale.setCate_name(rs.getString(2));
				swSale.setS_name(rs.getString(3));
				swSale.setSupplyAmount(rs.getInt(4));
				swSale.setSalesAmount(rs.getInt(5));
				swSale.setDiscount(rs.getInt(6));
				swSale.setSalesProfit(rs.getInt(7));
				
				list.add(swSale);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
