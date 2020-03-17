package yi_java3st_1team.main.employee.dao;

import java.util.List;

import yi_java3st_1team.main.employee.dto.Department;

public interface DepartmentDao {
	Department selectDepartmentByNo(Department dept);
	List<Department> selectDepartmentByAll();
	
	int insertDepartment(Department dept);
	int updateDepartment(Department dept);
	int deleteDepartment(Department dept);
}
