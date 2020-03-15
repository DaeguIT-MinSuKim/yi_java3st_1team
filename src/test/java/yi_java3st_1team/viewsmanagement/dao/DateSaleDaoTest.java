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
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import yi_java3st_1team.util.LogUtil;
import yi_java3st_1team.viewsmanagement.dao.impl.DateSaleDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.DateSale;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateSaleDaoTest {
	static DateSaleDao dao;
	static Connection con;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = DateSaleDaoImpl.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = DateSaleDaoImpl.getInstance();
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
	public void test01selectDateSaleByAll() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<DateSale> list = dao.selectDateSaleByAll();
		Assert.assertNotNull(list);
		
		for(DateSale ds : list) {
			LogUtil.prnLog(ds);
		}
	}
	
	@Test
	public void test02procedureDateSaleByDate() throws SQLException {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Date start = Date.valueOf("2019-03-01");
		Date end = Date.valueOf("2019-03-01");
		List<DateSale> list = dao.procedureDateSaleByDate(new DateSale(start, end));
		Assert.assertNotNull(list);
		LogUtil.prnLog(list);
	}

}
