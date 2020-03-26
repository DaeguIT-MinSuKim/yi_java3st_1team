package yi_java3st_1team.main.employee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.main.employee.dao.EmployeeDao;
import yi_java3st_1team.main.employee.dto.Department;
import yi_java3st_1team.main.employee.dto.Employee;
import yi_java3st_1team.util.LogUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	/*** SINGLETON PATTERN *****************************************************************************************/
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
	
	//getEmployeeJoin
	private Employee getEmployeeJoin(ResultSet rs) throws SQLException {
		int empNo = rs.getInt("e_no");
		String empName = rs.getString("e_name");
		Department dNo = new Department(rs.getInt("d_no"), rs.getString("d_name"), rs.getInt("d_floor"));
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
	
	//getEmpID
	private Employee getEmpID(ResultSet rs) throws SQLException {
		String empID = rs.getString("e_id");
		return new Employee(empID);
	}
	
	//getEmp
	private Employee getEmp(ResultSet rs) throws SQLException {
		int empNo = rs.getInt("e_no");
		String empName = rs.getString("e_name");
		String empTitle = rs.getString("e_title");
		int empManager = rs.getInt("e_manager");
		String empMail = rs.getString("e_mail");
		return new Employee(empNo, empName, empTitle, empManager, empMail);
	}


	//getEmpMail
	private Employee getEmpMail(ResultSet rs) throws SQLException {
		int empNo = rs.getInt("e_no");
		String empName = rs.getString("e_name");
		String empId = rs.getString("e_id");
		String empMail = rs.getString("e_mail");
		return new Employee(empNo, empName, empId, empMail);
	}

	//getEmpInfo
	private String getEmpInfo(ResultSet rs) throws SQLException {
		int no = rs.getInt("e_no");
		String empNo = String.format("EE%04d", no);
		Department dNo = new Department(rs.getInt("d_no"), rs.getString("d_name"));
		String dept = String.format("%s", dNo.getDeptName());
		String empTitle = rs.getString("e_title");
		String total = "("+empNo+")-"+dept+"("+empTitle+")";
		return total;
	}

	
	/***QUERY [select] ****************************************************************************************/
	
	
	//검색 : (기본)all
	@Override
	public List<Employee> selectEmployeeByAll() {
		//String sql = "select e_no, e_name, e_dept, e_title, e_manager, e_id, e_pw, e_mail from employee";
		String sql = "select e.e_no, e.e_name,  e.e_title, e.e_dept, d.d_no, d.d_name, d.d_floor, e.e_manager, e.e_id, e.e_pw, e.e_mail from employee e left join department d on e.e_dept  = d.d_no";	
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			List<Employee> list = new ArrayList<>();
			while(rs.next()) {
				list.add(getEmployeeJoin(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	//검색:부서명
	@Override
	public List<Employee> selectEmployeeListByDeptName(Department dept) {
		String sql = "select e.e_no , e.e_name , e.e_title , e.e_manager , e.e_mail from employee e "
	               + "left join department d on e.e_dept = d.d_no where d.d_name =?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, dept.getDeptName());
			ResultSet rs = pstmt.executeQuery();
			List<Employee> list = new ArrayList<Employee>();
			while(rs.next()) {
				list.add(getEmp(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	//검색 : 번호
	@Override
	public Employee selectEmployeeByNo(Employee emp) {
		//String sql = "select e_no, e_name, e_dept, e_title, e_manager, e_id, e_pw, e_mail from employee where e_no = ?";
		String sql = "select e.e_no, e.e_name,  e.e_title, e.e_dept, d.d_no, d.d_name, d.d_floor, e.e_manager, e.e_id, e.e_pw, e.e_mail from employee e left join department d on e.e_dept  = d.d_no where e.e_no = ?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
				pstmt.setInt(1, emp.getEmpNo());
				LogUtil.prnLog(pstmt);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						return getEmployeeJoin(rs);
					}
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//검색 : 부서명
	@Override
	public Employee selectEmployeeByDept(Employee emp) {
		String sql = "select e.e_no, e.e_name,  e.e_title, e.e_dept, d.d_no, d.d_name, d.d_floor, e.e_manager, e.e_id, e.e_pw, e.e_mail from employee e left join department d on e.e_dept  = d.d_no where d.d_name = ?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
				pstmt.setString(1, emp.getdNo().getDeptName());
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
	
	//로그인
	@Override
	public Employee loginEmployee(Employee emp) {
		String sql = "select e.e_no, e.e_name, e.e_title, e.e_dept, d.d_no, d.d_name, d.d_floor, e.e_manager, e.e_id, e.e_pw, e.e_mail from employee e left join department d on e.e_dept  = d.d_no where e.e_id = ? and e.e_pw = ?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, emp.getEmpId());
			pstmt.setString(2, emp.getEmpPass());
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getEmployeeJoin(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	//검색 : 아이디
	@Override
	public Employee selectEmployeeByID(Employee emp) {
		String sql = "select e_id from employee where e_id = ?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
				pstmt.setString(1, emp.getEmpId());
				LogUtil.prnLog(pstmt);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						return getEmpID(rs);
					}
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	
	//검색 : ID찾기
	@Override
	public Employee selectEmployeeByID2(Employee emp) {
		String sql = "select e_id from employee where e_no=? and e_name =?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
				pstmt.setInt(1, emp.getEmpNo());
				pstmt.setString(2, emp.getEmpName());
				LogUtil.prnLog(pstmt);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						return getEmpID(rs);
					}
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	//검색 : 메일일치
	@Override
	public Employee selectEmployeeByMail(Employee emp) {
		String sql = "select e_no, e_name, e_id, e_mail from employee where e_id = ?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
				pstmt.setString(1, emp.getEmpId());
				LogUtil.prnLog(pstmt);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						return getEmpMail(rs);
					}
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//검색 : 이름
	@Override
	public String selectEmployeeName(String name) {
		String sql = "select e.e_no, e.e_title, e.e_dept, d.d_no, d.d_name from employee e left join department d on e.e_dept = d.d_no where e.e_name = ?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, name);
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getEmpInfo(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/***QUERY [insert/update/delete] ****************************************************************************************/
	
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
	
	//update2
	@Override
	public int updateEmpPassword(Employee emp) {
		String sql = "update employee set e_pw = ? where e_no = ? and e_name = ? and e_id = ? and e_mail = ?";
		try(Connection con = MySqlDataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, emp.getEmpPass());
			pstmt.setInt(2, emp.getEmpNo());
			pstmt.setString(3, emp.getEmpName());
			pstmt.setString(4, emp.getEmpId());
			pstmt.setString(5, emp.getEmpMail());
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
