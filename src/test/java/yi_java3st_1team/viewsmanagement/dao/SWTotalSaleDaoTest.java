package yi_java3st_1team.viewsmanagement.dao;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import yi_java3st_1team.util.LogUtil;
import yi_java3st_1team.viewsmanagement.dao.impl.SWTotalSaleDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.ClientSale;
import yi_java3st_1team.viewsmanagement.dto.SWTotalSale;

public class SWTotalSaleDaoTest {
	static SWTotalSaleDao dao;
	static Connection con;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = SWTotalSaleDaoImpl.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = SWTotalSaleDaoImpl.getInstance();
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
	public void testSelectSWTotalSaleByAll() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<SWTotalSale> list = dao.selectSWTotalSaleByAll();
		Assert.assertNotNull(list);
		
		for(SWTotalSale cs : list) {
			LogUtil.prnLog(cs);
		}
	}

}
