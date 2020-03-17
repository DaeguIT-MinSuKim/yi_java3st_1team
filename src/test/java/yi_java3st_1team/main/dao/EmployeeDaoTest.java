package yi_java3st_1team.main.dao;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import yi_java3st_1team.main.employee.dao.EmployeeDao;
import yi_java3st_1team.main.employee.dao.impl.EmployeeDaoImpl;
import yi_java3st_1team.main.employee.dto.Employee;
import yi_java3st_1team.util.LogUtil;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeDaoTest {
	static EmployeeDao dao;

	@Before
	public void setUp() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = EmployeeDaoImpl.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = null;
	}

	@Test
	public void test01SelectEmployeeByNo() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Employee emp = dao.selectEmployeeByNo(new Employee(1));
		Assert.assertNotNull(emp);
		LogUtil.prnLog(emp);
	}

	@Test
	public void test02SelectEmployeeByAll() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<Employee> list = dao.selectEmployeeByAll();
		Assert.assertNotNull(list);
		for(Employee e : list) {
			LogUtil.prnLog(e);
		}
	}

	@Test
	public void test03InsertEmployee() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
//		int res = dao.insertEmployee(new Employee("정스파이", new Department(4), "인턴", 2, "areumzzing", "1234qwer", "hothihi5@gmail.com"));
//		Assert.assertEquals(1, res);
//		for(Employee e : dao.selectEmployeeByAll()) LogUtil.prnLog(e);
	}

	@Test
	public void test04UpdateEmployee() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
//		Employee emp = new Employee(82,"정스파이제임스", new Department(4), "인턴", 2, "areumzzing", "1234qwer", "hothihi5@gmail.com");
//		int res = dao.updateEmployee(emp);
//		Assert.assertEquals(1, res);
	}

	@Test
	public void test05DeleteEmployee() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
//		Employee emp = new Employee(82);
//		int res = dao.deleteEmployee(emp);
//		Assert.assertEquals(1, res);
	}

}
