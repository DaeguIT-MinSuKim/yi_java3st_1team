package yi_java3st_1team.main.employee.ui.service;

import java.util.List;

import yi_java3st_1team.main.employee.dao.DepartmentDao;
import yi_java3st_1team.main.employee.dao.EmployeeDao;
import yi_java3st_1team.main.employee.dao.impl.DepartmentDaoImpl;
import yi_java3st_1team.main.employee.dao.impl.EmployeeDaoImpl;
import yi_java3st_1team.main.employee.dto.Department;

public class DepartmentUiService {
	private DepartmentDao deptDao = DepartmentDaoImpl.getInstance();
	private EmployeeDao empDao = EmployeeDaoImpl.getInstance();
	
	public List<Department> showDepartmentList(){
		return deptDao.selectDepartmentByAll();
	}

	public void removeDepartment(Department delDept) {
		deptDao.deleteDepartment(delDept);
	}

	public void addDepartment(Department newDept) {
		deptDao.insertDepartment(newDept);
	}

	public void modifyDepartment(Department newDept) {
		deptDao.updateDepartment(newDept);
	}
}
