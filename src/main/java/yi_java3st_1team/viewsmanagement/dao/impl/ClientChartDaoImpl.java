package yi_java3st_1team.viewsmanagement.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.util.LogUtil;
import yi_java3st_1team.viewsmanagement.dao.ClientChartDao;
import yi_java3st_1team.viewsmanagement.dto.ClientChart;
import yi_java3st_1team.viewsmanagement.dto.DateSale;

public class ClientChartDaoImpl implements ClientChartDao {
	private static final ClientChartDaoImpl Instance = new ClientChartDaoImpl();
	
	public ClientChartDaoImpl() {}
	
	public static ClientChartDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public List<ClientChart> procedureClientChart(ClientChart cChart) throws SQLException {
		List<ClientChart> list = new ArrayList<ClientChart>();
		String sql = "{call clientChart(?)}";
		Connection con = MySqlDataSource.getConnection();
		try(CallableStatement cstmt = con.prepareCall(sql);){
			cstmt.setDate(1, (Date) cChart.getO_date());
			LogUtil.prnLog(cstmt);
			try(ResultSet rs = cstmt.executeQuery()){
				while(rs.next()) {
					ClientChart chart = new ClientChart();
					chart.setC_name(rs.getString(1));
					chart.setP_price(rs.getInt(2));
					chart.setO_date(rs.getDate(3));
					
					list.add(chart);
				}
			}
		}
		return list;
	}

//	@Override
//	public int selectClientChartTest(String startDate, String endDate) {
//		String sql = "select  c.c_name, o.o_qty*p.p_price as 판매금액, o.o_date " + 
//				"  from `order` o natural join client c natural join product p " + 
//				" where o.o_cno = c.c_no and p.p_no = o.o_pno and o.o_date between ? and ? and  " + 
//				" order by o.o_qty*p.p_price desc limit 10";
//		List<ClientChart> list = new ArrayList<ClientChart>();
//		try(Connection con = MySqlDataSource.getConnection();
//				PreparedStatement pstmt = con.prepareStatement(sql);){
//			pstmt.setString(1, startDate);
//			pstmt.setString(2, endDate);
//			LogUtil.prnLog(pstmt);
//			try (ResultSet rs = pstmt.executeQuery()){
//				
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return 0;
//	}
	
	@Override
	public List<ClientChart> selectClientChartTest(String start, String end) {
		String sql = "select  c.c_name, o.o_qty*p.p_price as 판매금액, o.o_date " + 
				"  from `order` o natural join client c natural join product p " + 
				" where o.o_cno = c.c_no and p.p_no = o.o_pno and ? <= o.o_date and o.o_date <= ?" + 
				" order by o.o_qty*p.p_price desc limit 10";
		List<ClientChart> list = new ArrayList<ClientChart>();
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, start);
			pstmt.setString(2, end);
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				while(rs.next()) {
					ClientChart cChart = new ClientChart();
					cChart.setC_name(rs.getString(1));
					cChart.setP_price(rs.getInt(2));
	
					list.add(cChart);
				}
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
