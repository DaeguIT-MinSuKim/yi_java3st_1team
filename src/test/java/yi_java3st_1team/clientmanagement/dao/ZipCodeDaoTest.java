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

import yi_java3st_1team.clientmanagement.dao.impl.ZipCodeDaoImpl;
import yi_java3st_1team.clientmanagement.dto.ZipCode;
import yi_java3st_1team.util.LogUtil;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ZipCodeDaoTest {
	static ZipCodeDao dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = ZipCodeDaoImpl.getInstance();
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
	public void test01SelectZipCodeSearch() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<ZipCode> list = dao.selectZipCodeSearch(new ZipCode("대구광역시","태전로", 53, 0));
		Assert.assertNotNull(list);
		
		for(ZipCode z:list) {
			LogUtil.prnLog(z);
		}
	}
	
}
