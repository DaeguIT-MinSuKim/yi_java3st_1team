package yi_java3st_1team.clientmanagement.dao;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import yi_java3st_1team.clientmanagement.dao.impl.ClientDaoImpl;
import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.util.LogUtil;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClientDaoTest {
	static ClientDao dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = ClientDaoImpl.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = null;
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
	public void test01SelectClientByNo() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Client client = dao.selectClientByNo(new Client(1));
		Assert.assertNotNull(client);
		LogUtil.prnLog(client);
	}

	@Test
	public void test02SelectClientByAll() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<Client> list = dao.selectClientByAll();
		Assert.assertNotNull(list);
		
		for(Client c:list) {
			LogUtil.prnLog(c);
		}
	}

	@Test
	public void test03InsertClient() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Client client = new Client(56, "재승시스템", "현재승", "대구광역시 남구 삼각지6길 12-5", "053-123-4567", "jsonHYUN", "jsonhyun!@", "json@naver.com", null, 56);
		int res = dao.insertClient(client);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test04UpdateClient() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Client client = new Client(56, "재승정보통신", "현재승", "대구광역시", "010-123-4567", 60);
		int res = dao.updateClient(client);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test05DeleteClient() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Client client = new Client(56);
		int res = dao.deleteClient(client);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test06selectClientLastData() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Client client = dao.selectClientLastData();
		Assert.assertNotNull(client);
		LogUtil.prnLog(client);
	}

}
