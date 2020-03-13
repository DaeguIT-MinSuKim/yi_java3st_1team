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
import yi_java3st_1team.viewsmanagement.dao.impl.IQEvaluationDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.IQEvaluation;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
	public void test01SelectIQEvaluationByAll() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<IQEvaluation> list = dao.selectIQEvaluationByAll();
		Assert.assertNotNull(list);
		
		for(IQEvaluation iq : list) {
			LogUtil.prnLog(iq);
		}
	}
	
	@Test
	public void test02procedureIQEvaluationByPName() throws SQLException {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<IQEvaluation> list = dao.procedureIQEvaluationByPName(new IQEvaluation("아르미 Pro"));
		Assert.assertNotNull(list);
		LogUtil.prnLog(list);
	}
	
	@Test
	public void test03selectiqShortageByIQQty() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<IQEvaluation> list = dao.selectIQShortageByIQQty();
		Assert.assertNotNull(list);
		
		for(IQEvaluation iq : list) {
			LogUtil.prnLog(iq);
		}
	}
	
	@Test
	public void test04selectIQModerateByIQQty() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<IQEvaluation> list = dao.selectIQModerateByIQQty();
		Assert.assertNotNull(list);
		
		for(IQEvaluation iq : list) {
			LogUtil.prnLog(iq);
		}
	}
	
	@Test
	public void test05selectIQExcessiveByIQQty() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<IQEvaluation> list = dao.selectIQExcessiveByIQQty();
		Assert.assertNotNull(list);
		
		for(IQEvaluation iq : list) {
			LogUtil.prnLog(iq);
		}
	}

}
