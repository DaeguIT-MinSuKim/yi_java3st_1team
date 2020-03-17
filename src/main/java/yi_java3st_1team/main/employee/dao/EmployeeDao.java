package yi_java3st_1team.main.employee.dao;

import java.util.List;

import yi_java3st_1team.main.employee.dto.Department;
import yi_java3st_1team.main.employee.dto.Employee;

public interface EmployeeDao {
	Employee selectEmployeeByNo(Employee emp);
	
	Employee selectEmployeeByDept(Employee emp);
	List<Employee> selectEmployeeByAll();
	Employee selectEmployeebyLastNo();
	
	Employee selectEmployeeByID(Employee emp);
	
	int insertEmployee(Employee emp);
	int updateEmployee(Employee emp);
	int deleteEmployee(Employee emp);
	
	Employee loginEmployee(Employee emp);

	List<Employee> selectEmployeeListByDeptName(Department dept);
	
	Employee selectEmployeeByID2(Employee emp);
	


}
