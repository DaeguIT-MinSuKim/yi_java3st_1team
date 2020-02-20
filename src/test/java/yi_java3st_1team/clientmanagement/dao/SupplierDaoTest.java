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

import yi_java3st_1team.clientmanagement.dao.impl.SupplierDaoImpl;
import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.util.LogUtil;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SupplierDaoTest {
	static SupplierDao dao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = SupplierDaoImpl.getInstance();
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
	public void test01SelectSupplierByNo() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Supplier supplier = dao.selectSupplierByNo(new Supplier(1));
		Assert.assertNotNull(supplier);
		LogUtil.prnLog(supplier);
	}

	@Test
	public void test02SelectSuppplierLastData() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Supplier supplier = dao.selectSuppplierLastData();
		Assert.assertNotNull(supplier);
		LogUtil.prnLog(supplier);
	}

	@Test
	public void test03SelectSupplierByAll() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<Supplier> list = dao.selectSupplierByAll();
		Assert.assertNotNull(list);
		
		for(Supplier s:list) {
			LogUtil.prnLog(s);
		}
	}

	@Test
	public void test04InsertSupplier() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Supplier supplier = new Supplier(47, "재승시스템", "215-456-9875", "대구광역시 남구 삼각지 6길 12-3", "053-123-4567", "053-123-7894");
		int res = dao.insertSupplier(supplier);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test05UpdateSupplier() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Supplier supplier = new Supplier(47, "아름정보통신", "215-456-9875", "대구광역시 남구 삼각지 6길 12-3", "053-123-4567", "053-123-7894");
		int res = dao.updateSupplier(supplier);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test06DeleteSupplier() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Supplier supplier = new Supplier(47);
		int res = dao.deleteSupplier(supplier);
		Assert.assertEquals(1, res);
	}

}
