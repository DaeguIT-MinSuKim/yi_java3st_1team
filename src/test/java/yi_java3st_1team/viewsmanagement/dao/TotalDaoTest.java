package yi_java3st_1team.viewsmanagement.dao;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import yi_java3st_1team.util.LogUtil;
import yi_java3st_1team.viewsmanagement.dao.impl.TotalDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.Total;

public class TotalDaoTest {
	static TotalDao dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = TotalDaoImpl.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = TotalDaoImpl.getInstance();
	}

	@Before
	public void setUp() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
	}

	@After
	public void tearDown() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
	}

	@Test
	public void testSelectClientSaleTotalSales() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Total total = dao.selectClientSaleTotalSales();
		Assert.assertNotNull(total);
		LogUtil.prnLog(total);
	}

}
