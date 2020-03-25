package yi_java3st_1team.viewsmanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.util.LogUtil;
import yi_java3st_1team.viewsmanagement.dao.EmployeeChartDao;
import yi_java3st_1team.viewsmanagement.dto.EmployeeChart;

public class EmployeeChartDaoImpl implements EmployeeChartDao {
	private static final EmployeeChartDaoImpl Instance = new EmployeeChartDaoImpl();
	
	public EmployeeChartDaoImpl() {}
	
	public static EmployeeChartDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public List<EmployeeChart> selectEmployeeChart(String startDate, String endDate) {
		String sql = "select  e.e_name, sum(o.o_qty*p.p_price) as 판매금액, o.o_eno " + 
				"  from `order` o natural join employee e natural join product p " + 
				" where o.o_eno = e.e_no and ? <= o.o_date and o.o_date >= ? " + 
				" group by e.e_name " + 
				" order by sum(o.o_qty*p.p_price) desc limit 10";
		List<EmployeeChart> list = new ArrayList<EmployeeChart>();
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, startDate);
			pstmt.setString(2, endDate);
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				while(rs.next()) {
					EmployeeChart eChart = new EmployeeChart();
					eChart.setE_name(rs.getString(1));
					
					list.add(eChart);
				}
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int selectEmployeeTotal(String startDate, String endDate) {
		String sql = "select  e.e_name, sum(o.o_qty*p.p_price) as 판매금액, o.o_eno " + 
				"  from `order` o natural join employee e natural join product p " + 
				" where o.o_eno = e.e_no and ? <= o.o_date and o.o_date >= ? " + 
				" group by e.e_name " + 
				" order by sum(o.o_qty*p.p_price) desc limit 10";
		List<EmployeeChart> list = new ArrayList<EmployeeChart>();
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, startDate);
			pstmt.setString(2, endDate);
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				while(rs.next()) {
					EmployeeChart eChart = new EmployeeChart();
					eChart.setSalesMoney(rs.getInt(1));
					
					list.add(eChart);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	

}
