package yi_java3st_1team.main.dao;

import java.util.List;

import yi_java3st_1team.main.dto.Employee;

public interface EmployeeDao {
	Employee selectEmployeeByNo(Employee emp);
	List<Employee> selectEmployeeByAll();
	
	Employee selectEmployeebyLastNo();
	
	int insertEmployee(Employee emp);
	int updateEmployee(Employee emp);
	int deleteEmployee(Employee emp);

}
