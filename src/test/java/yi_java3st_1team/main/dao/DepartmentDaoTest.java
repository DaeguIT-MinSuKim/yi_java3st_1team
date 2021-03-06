package yi_java3st_1team.main.dao;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import yi_java3st_1team.main.employee.dao.DepartmentDao;
import yi_java3st_1team.main.employee.dao.impl.DepartmentDaoImpl;
import yi_java3st_1team.main.employee.dto.Department;
import yi_java3st_1team.util.LogUtil;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentDaoTest {

	static DepartmentDao dao;

	@Before
	public void setUp() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = DepartmentDaoImpl.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = null;
	}

	@Test
	public void test01SelectDepartmentByNo() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Department department = dao.selectDepartmentByNo(new Department(1));
		Assert.assertNotNull(department);
		LogUtil.prnLog(department);
	}

	@Test
	public void test02SelectDepartmentByAll() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<Department> list = dao.selectDepartmentByAll();
		Assert.assertNotNull(list);
		for(Department d : list) {
			LogUtil.prnLog(d);
		}
		
	}

	@Test
	public void test03InsertDepartment() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
//		int res = dao.insertDepartment(new Department("구매부", 100));
//		Assert.assertEquals(1, res);
//		for(Department d : dao.selectDepartmentByAll()) LogUtil.prnLog(d);

	}

	@Test
	public void test04UpdateDepartment() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
//		Department dept = new Department(11,"구매부1", 100);
//		int res = dao.updateDepartment(dept);
//		Assert.assertEquals(1, res);

	}

	@Test
	public void test05DeleteDepartment() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
//		Department dept = new Department(18);
//		int res = dao.deleteDepartment(dept);
//		Assert.assertEquals(1, res);
	}

}
