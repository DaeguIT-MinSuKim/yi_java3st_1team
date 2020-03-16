package yi_java3st_1team.viewsmanagement.dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import yi_java3st_1team.util.LogUtil;
import yi_java3st_1team.viewsmanagement.dao.impl.TotalDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.Total;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
	public void test01SelectTotalSales() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Total total = dao.selectTotalSales();
		Assert.assertNotNull(total);
		LogUtil.prnLog(total);
	}
	
	@Test
	public void test02SelectTotalUncollected() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Total tu = dao.selectTotalUncollected();
		Assert.assertNotNull(tu);
		LogUtil.prnLog(tu);
	}
	
	@Test
	public void test03SelectSalesProfit() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Total da = dao.selectSalesProfit();
		Assert.assertNotNull(da);
		LogUtil.prnLog(da);
	}
	
	@Test
	public void test04SelectDeliveryAmount() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Total da = dao.selectDeliveryAmount();
		Assert.assertNotNull(da);
		LogUtil.prnLog(da);
	}

}
