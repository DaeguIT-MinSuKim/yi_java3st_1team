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
		String sql = "select e.e_name ,sum(p.p_price* o.o_qty) from `order` o " 
	               + "left join product p on o.o_pno =p.p_no left join employee e " 
				   + "on o.o_eno =e.e_no where DATE(o_date) between ? and ? " 
	               + "and e.e_dept between 4 and 6 group by e.e_name order by sum(p.p_price* o.o_qty) " 
				   + "desc limit 10;";
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
					eChart.setSalesMoney(rs.getInt(2));
					list.add(eChart);
				}
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
