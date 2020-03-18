package yi_java3st_1team.main.employee.ui.service;

import java.util.List;

import yi_java3st_1team.main.employee.dao.DepartmentDao;
import yi_java3st_1team.main.employee.dao.EmployeeDao;
import yi_java3st_1team.main.employee.dao.impl.DepartmentDaoImpl;
import yi_java3st_1team.main.employee.dao.impl.EmployeeDaoImpl;
import yi_java3st_1team.main.employee.dto.Department;
import yi_java3st_1team.main.employee.dto.Employee;

public class EmployeeUIService {
	private EmployeeDao empDao;
	private DepartmentDao deptDao;
	
	public EmployeeUIService() {
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
	
	public List<Employee> showEmployeeListByDeptName(Department dept){
		return empDao.selectEmployeeListByDeptName(dept);
	}
	
	public Employee lostID(Employee emp) {
		return empDao.selectEmployeeByID2(emp);
	}
	
	public Employee empMail(Employee emp) {
		return empDao.selectEmployeeByMail(emp);
	}
	
	public void resetEmpPass(Employee emp) {
		empDao.updateEmpPassword(emp);
	}
}