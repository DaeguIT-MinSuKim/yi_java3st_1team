package yi_java3st_1team.viewsmanagement.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import yi_java3st_1team.util.LogUtil;
import yi_java3st_1team.viewsmanagement.dao.impl.ClientChartDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.ClientChart;
import yi_java3st_1team.viewsmanagement.dto.DateSale;

public class ClientChartDaoTest {
	static ClientChartDao dao;
	static Connection con;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = ClientChartDaoImpl.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = ClientChartDaoImpl.getInstance();
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
	public void test01ProcedureClientChart() throws SQLException {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Date start = Date.valueOf("2019-11-01");
		List<ClientChart> list = dao.procedureClientChart(new ClientChart(start));
		Assert.assertNotNull(list);
		
		for(ClientChart chart : list) {
			LogUtil.prnLog(chart);
		}
	}
	
	//@Test
//	public void test02selectClientChartTest() {
//		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
//		//List<ClientChart> list = dao.selectClientChartTest();
//		Assert.assertNotNull(list);
//		
//		for(ClientChart cc : list) {
//			LogUtil.prnLog(cc);
//		}
//	}

}
