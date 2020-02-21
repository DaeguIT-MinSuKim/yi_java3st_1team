package yi_java3st_1team.main.dao;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import yi_java3st_1team.main.dao.impl.DepartmentDaoImpl;
import yi_java3st_1team.main.dto.Department;
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
		//LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		fail("Not yet implemented");
	}

	@Test
	public void test03InsertDepartment() {
		//LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		fail("Not yet implemented");
	}

	@Test
	public void test04UpdateDepartment() {
		//LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		fail("Not yet implemented");
	}

	@Test
	public void test05DeleteDepartment() {
		//LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		fail("Not yet implemented");
	}

}
