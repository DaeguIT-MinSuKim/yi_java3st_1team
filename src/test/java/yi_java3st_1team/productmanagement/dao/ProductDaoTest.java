package yi_java3st_1team.productmanagement.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.productmanagement.dao.impl.ProductDaoImpl;
import yi_java3st_1team.productmanagement.dto.Category;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.util.LogUtil;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductDaoTest {
	static ProductDao dao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		dao = ProductDaoImpl.getInstance();
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
	public void test01SelectProductByAll() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<Product> list = dao.selectProductByAll();
		Assert.assertNotNull(list);
		
		for(Product p:list) {
			LogUtil.prnLog(p);
		}
	}

	@Test
	public void test02InsertProduct() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		String pDate = format1.format(now);
		
		Product product = new Product(85, new Category(1), "재승프로그램", 200000, 220000, new Supplier(1), 150, pDate);
		product.setpPic(getImg("windows10.jpg"));
		LogUtil.prnLog(product);
		int res = dao.insertProduct(product);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test03UpdateProduct() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		String pDate = format1.format(now);
		Product product = new Product(85, new Category(2), "재승오피스", 220000, 240000, new Supplier(2), 100, pDate, getImg("한글오피스2020.jpg"));
		int res = dao.updateProduct(product);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test04DeleteProduct() {
		LogUtil.prnLog(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Product product = new Product(85);
		int res = dao.deleteProduct(product);
		Assert.assertEquals(1, res);
	}
	
	private byte[] getImg(String imgName) {
		byte[] pic = null;
		File file = new File(System.getProperty("user.dir")+File.separator+"images/productImg", imgName);
		try(InputStream is = new FileInputStream(file)){
			pic = new byte[is.available()];
			is.read(pic);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pic;
	}

}
