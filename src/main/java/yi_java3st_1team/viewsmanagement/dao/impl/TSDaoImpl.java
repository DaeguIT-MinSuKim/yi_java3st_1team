package yi_java3st_1team.viewsmanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.viewsmanagement.dao.TSDao;
import yi_java3st_1team.viewsmanagement.dto.TransactionStatement;

public class TSDaoImpl implements TSDao {
	private static final TSDaoImpl Instance = new TSDaoImpl();
	
	public TSDaoImpl() {}
	
	public static TSDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public List<TransactionStatement> selectTSByAll() {
		String sql = "select	s.s_name as 공급회사명, " + 
				"		o.o_date as 주문일자, " + 
				"		c.c_name as 고객상호, " + 
				"		p.p_name as 품목, " + 
				"		o.o_qty as 수량, " + 
				"		p.p_price as 단가, " + 
				"		o.o_qty*p.p_price as 금액, " + 
				"		o.o_qty*p.p_price*0.1 as 세금, " + 
				"		o.o_qty*p.p_price+o.o_qty*p.p_price*0.1 as 총납품금액 " + 
				"  from supplier s natural join client c natural join product p natural join `order` o " + 
				" where s.s_no = p.p_sno and p.p_no = o.o_pno and c.c_no = o.o_cno " + 
				" group by 공급회사명, 주문일자";
		List<TransactionStatement> list = new ArrayList<TransactionStatement>();
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			while(rs.next()) {
				TransactionStatement ts = new TransactionStatement();
				ts.setS_name(rs.getString(1));
				ts.setO_date(rs.getDate(2));
				ts.setC_name(rs.getString(3));
				ts.setP_name(rs.getString(4));
				ts.setO_qty(rs.getInt(5));
				ts.setP_price(rs.getInt(6));
				ts.setSalesAmount(rs.getInt(7));
				ts.setTax(rs.getInt(8));
				ts.setTotalDA(rs.getInt(9));
				
				list.add(ts);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
