package yi_java3st_1team.main.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.main.dao.DepartmentDao;
import yi_java3st_1team.main.dto.Department;
import yi_java3st_1team.util.LogUtil;

public class DepartmentDaoImpl implements DepartmentDao {
	private static final DepartmentDaoImpl instance = new DepartmentDaoImpl();
	
	private DepartmentDaoImpl() {}
	
	public static DepartmentDaoImpl getInstance() {
		return instance;
	}
	
	//getDepartment
	private Department getDepartment(ResultSet rs) throws SQLException {
		int deptNo = rs.getInt("d_no");
		String deptName = rs.getString("d_name");
		int floor = rs.getInt("d_floor");
		return new Department(deptNo, deptName, floor);
	}

	@Override
	public Department selectDepartmentByNo(Department dept) {
		String sql = "select d_no, d_name, d_floor from department where d_no = ?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
				pstmt.setInt(1, dept.getDeptNo());
				LogUtil.prnLog(pstmt);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						return getDepartment(rs);
					}
				}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}



	@Override
	public List<Department> selectDepartmentByAll() {
		String sql = "select d_no, d_name, d_floor from department";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			List<Department> list = new ArrayList<>();
			LogUtil.prnLog(pstmt);
			while(rs.next()) {
				list.add(getDepartment(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertDepartment(Department dept) {
		String sql = "insert into department (d_no, d_name, d_floor) value (null, ?,?)";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, dept.getDeptName());
			pstmt.setInt(2, dept.getFloor());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateDepartment(Department dept) {
		String sql = "update department set d_name = ?, d_floor = ? where d_no = ?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, dept.getDeptName());
			pstmt.setInt(2, dept.getFloor());
			pstmt.setInt(3, dept.getDeptNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteDepartment(Department dept) {
		String sql = "delete from department where d_no = ?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, dept.getDeptNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return 0;
	}

}
