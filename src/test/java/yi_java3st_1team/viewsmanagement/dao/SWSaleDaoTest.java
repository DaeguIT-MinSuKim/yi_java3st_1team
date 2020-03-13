package yi_java3st_1team.viewsmanagement.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import yi_java3st_1team.util.LogUtil;
import yi_java3st_1team.viewsmanagement.dao.impl.SWSaleDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.SWSale;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
	public void test01SelectSWSaleByAll() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<SWSale> list = dao.selectSWSaleByAll();
		Assert.assertNotNull(list);
		
		for(SWSale sw : list) {
			LogUtil.prnLog(sw);
		}
	}

	@Test
	public void test02procedureSWSaleByPName() throws SQLException {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<SWSale> list = dao.procedureSWSaleByPName(new SWSale("한글 2020"));
		Assert.assertNotNull(list);
		LogUtil.prnLog(list);
	}
}
