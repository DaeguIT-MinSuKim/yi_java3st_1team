package yi_java3st_1team.main.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.main.dao.EmployeeDao;
import yi_java3st_1team.main.dto.Department;
import yi_java3st_1team.main.dto.Employee;
import yi_java3st_1team.util.LogUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	private static final EmployeeDaoImpl instance = new EmployeeDaoImpl();
	
	private EmployeeDaoImpl() {}
	
	public static EmployeeDaoImpl getInstance() {
		return instance;
	}
	
	/*** GET *****************************************************************************************/
	//getEmployee
	private Employee getEmployee(ResultSet rs) throws SQLException {
		int empNo = rs.getInt("e_no");
		String empName = rs.getString("e_name");
		Department dNo = new Department(rs.getInt("e_dept"));
		String empTitle = rs.getString("e_title");
		int empManager = rs.getInt("e_manager");
		String empId = rs.getString("e_id");
		String empPass = rs.getString("e_pw");
		String empMail = rs.getString("e_mail");
		return new Employee(empNo, empName, dNo, empTitle, empManager, empId, empPass, empMail);
	}
	
	//getEmpNo
	private Employee getEmpNo(ResultSet rs) throws SQLException {
		int empNo = rs.getInt("e_no");
		return new Employee(empNo);
	}
	
	/***QUERY****************************************************************************************/
	
	//검색 : 번호
	@Override
	public Employee selectEmployeeByNo(Employee emp) {
		String sql = "select e_no, e_name, e_dept, e_title, e_manager, e_id, e_pw, e_mail from employee where e_no = ?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
				pstmt.setInt(1, emp.getEmpNo());
				LogUtil.prnLog(pstmt);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						return getEmployee(rs);
					}
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	//검색 : (기본)all
	@Override
	public List<Employee> selectEmployeeByAll() {
		String sql = "select e_no, e_name, e_dept, e_title, e_manager, e_id, e_pw, e_mail from employee";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			List<Employee> list = new ArrayList<>();
			while(rs.next()) {
				list.add(getEmployee(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	//검색 : 마지막번호
	@Override
	public Employee selectEmployeebyLastNo() {
		String sql = "select e_no from employee order by e_no desc limit 1";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getEmpNo(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	//insert
	@Override
	public int insertEmployee(Employee emp) {
		String sql = "insert into employee (e_no, e_name, e_dept, e_title, e_manager, e_id, e_pw, e_mail) value (null,?,?,?,?,?,?,?)";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, emp.getEmpName());
			pstmt.setInt(2, emp.getdNo().getDeptNo());
			pstmt.setString(3, emp.getEmpTitle());
			pstmt.setInt(4, emp.getEmpManager());
			pstmt.setString(5, emp.getEmpId());
			pstmt.setString(6, emp.getEmpPass());
			pstmt.setString(7, emp.getEmpMail());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	//update
	@Override
	public int updateEmployee(Employee emp) {
		String sql = "update employee set e_name = ?, e_dept = ?, e_title = ?, e_manager = ?, e_id = ?, e_pw = ?, e_mail = ? where e_no = ?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, emp.getEmpName());
			pstmt.setInt(2, emp.getdNo().getDeptNo());
			pstmt.setString(3, emp.getEmpTitle());
			pstmt.setInt(4, emp.getEmpManager());
			pstmt.setString(5, emp.getEmpId());
			pstmt.setString(6, emp.getEmpPass());
			pstmt.setString(7, emp.getEmpMail());
			pstmt.setInt(8, emp.getEmpNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	//delete
	@Override
	public int deleteEmployee(Employee emp) {
		String sql = "delete from employee where e_no = ?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, emp.getEmpNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}



}
