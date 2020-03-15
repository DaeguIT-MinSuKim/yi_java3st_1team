package yi_java3st_1team.viewsmanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.viewsmanagement.dao.TotalDao;
import yi_java3st_1team.viewsmanagement.dto.Total;

public class TotalDaoImpl implements TotalDao {
private static final TotalDaoImpl Instance = new TotalDaoImpl();
	
	public TotalDaoImpl() {}
	
	public static TotalDaoImpl getInstance() {
		return Instance;
	}
	
	public Total selectClientSaleTotalSales() {
		String sql = "select SUM(o.o_qty * p.p_price) " + 
				"  from `order` o natural join product p " + 
				" where p.p_no = o.o_pno";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			if(rs.next()) {
				return new Total(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
