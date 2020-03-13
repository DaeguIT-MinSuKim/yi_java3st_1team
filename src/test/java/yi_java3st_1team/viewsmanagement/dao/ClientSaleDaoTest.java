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
import yi_java3st_1team.viewsmanagement.dao.impl.ClientSaleDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.ClientSale;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClientSaleDaoTest {
	static ClientSaleDao dao;
	static Connection con;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = ClientSaleDaoImpl.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = ClientSaleDaoImpl.getInstance();
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
	public void test01SelectClientSaleByAll() throws SQLException {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<ClientSale> list = dao.selectClientSaleByAll();
		Assert.assertNotNull(list);
		
		for(ClientSale cs : list) {
			LogUtil.prnLog(cs);
		}
	}
	
	@Test
	public void test02procedureClientSaleByCName() throws SQLException {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<ClientSale> list = dao.procedureClientSaleByCName(new ClientSale("전라북도청"));
		Assert.assertNotNull(list);
		LogUtil.prnLog(list);
	}

}
