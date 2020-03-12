package yi_java3st_1team.viewsmanagement.dao;

import java.sql.Connection;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import yi_java3st_1team.util.LogUtil;
import yi_java3st_1team.viewsmanagement.dto.SWSale;
import yi_java3st_1team.viewsmanagement.impl.SWSaleDaoImpl;

public class SWSaleDaoTest {
	static SWSaleDao dao;
	static Connection con;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = SWSaleDaoImpl.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = SWSaleDaoImpl.getInstance();
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
	public void testSelectSWSaleByAll() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<SWSale> list = dao.selectSWSaleByAll();
		Assert.assertNotNull(list);
		
		for(SWSale sw : list) {
			LogUtil.prnLog(sw);
		}
	}

}
