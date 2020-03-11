package yi_java3st_1team.main.ui.service;

import java.util.List;

import yi_java3st_1team.main.dao.DepartmentDao;
import yi_java3st_1team.main.dao.EmployeeDao;
import yi_java3st_1team.main.dao.impl.DepartmentDaoImpl;
import yi_java3st_1team.main.dao.impl.EmployeeDaoImpl;
import yi_java3st_1team.main.dto.Department;
import yi_java3st_1team.main.dto.Employee;

public class EmployeeUiService {
	private EmployeeDao empDao;
	private DepartmentDao deptDao;
	
	public EmployeeUiService() {
		empDao = EmployeeDaoImpl.getInstance();
		deptDao = DepartmentDaoImpl.getInstance();
	}

	public Employee Idcheck(Employee emp) {
		return empDao.selectEmployeeByID(emp);
	}
	public List<Department> showDeptList(){
		return deptDao.selectDepartmentByAll();
	}
	
	public Employee showlastEmpNum() {
		return empDao.selectEmployeebyLastNo();
	}
	
	public Employee showEmpcol(Employee emp) {
		return empDao.selectEmployeeByNo(emp);
	}
	
	public Employee showEmpDeptcol(Employee emp) {
		return empDao.selectEmployeeByDept(emp);
	}
	
	public List<Employee> showEmployeeList(){
		return empDao.selectEmployeeByAll();
	}
	
	
	public void addEmployee(Employee emp) {
		empDao.insertEmployee(emp);
	}
	
	
	public void modifyEmployee(Employee emp) {
		empDao.updateEmployee(emp);
	}
	
	
	public void removeEmployee(Employee emp) {
		empDao.deleteEmployee(emp);
	}
	
	
	public Employee login(Employee emp) {
		return empDao.loginEmployee(emp);
	}
	

	
}
