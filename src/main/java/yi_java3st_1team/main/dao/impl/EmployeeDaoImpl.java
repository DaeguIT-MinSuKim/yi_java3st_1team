package yi_java3st_1team.main.dao.impl;

import java.util.List;

import yi_java3st_1team.main.dao.EmployeeDao;
import yi_java3st_1team.main.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static final EmployeeDaoImpl instance = new EmployeeDaoImpl();
	
	private EmployeeDaoImpl() {}
	
	public static EmployeeDaoImpl getInstance() {
		return instance;
	}

	@Override
	public Employee selectEmployeeByNo(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> selectEmployeeByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

}
