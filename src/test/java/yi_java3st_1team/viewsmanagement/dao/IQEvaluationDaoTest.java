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
import yi_java3st_1team.viewsmanagement.dto.IQEvaluation;
import yi_java3st_1team.viewsmanagement.impl.IQEvaluationDaoImpl;

public class IQEvaluationDaoTest {
	static IQEvaluationDao dao;
	static Connection con;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = IQEvaluationDaoImpl.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = IQEvaluationDaoImpl.getInstance();
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
	public void testSelectIQEvaluationByAll() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<IQEvaluation> list = dao.selectIQEvaluationByAll();
		Assert.assertNotNull(list);
		
		for(IQEvaluation iq : list) {
			LogUtil.prnLog(iq);
		}
	}

}
