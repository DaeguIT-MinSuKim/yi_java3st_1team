package yi_java3st_1team.productmanagement.ui.service;

import java.util.List;

import yi_java3st_1team.productmanagement.dao.CategoryDao;
import yi_java3st_1team.productmanagement.dao.ProductDao;
import yi_java3st_1team.productmanagement.dao.impl.CategoryDaoImpl;
import yi_java3st_1team.productmanagement.dao.impl.ProductDaoImpl;
import yi_java3st_1team.productmanagement.dto.Category;
import yi_java3st_1team.productmanagement.dto.Product;

public class SWUIService {
	private ProductDao productDao = ProductDaoImpl.getInstance();
	private CategoryDao categoryDao = CategoryDaoImpl.getInstance();
	
	public List<Product> showProductList(){
		return productDao.selectProductByAll();
	}
	
	public void removeProduct(Product delProduct) {
		productDao.deleteProduct(delProduct);
	}
	
	public void addProduct(Product newProduct) {
		productDao.insertProduct(newProduct);
	}
	
	public void modifyProduct(Product upProduct) {
		productDao.updateProduct(upProduct);
	}
	
	public Product lastProduct() {
		return productDao.selectProductLastData();
	}
	
	public List<Category> showCategoryList(){
		return categoryDao.selectCategoryByAll();
	}
	
	public String showSupplierName(Product supProduct) {
		return productDao.selectSupplierByPName(supProduct);
	}
	
	public Product overlapProduct(Product overlapProduct) {
		return productDao.selectProductByName(overlapProduct);
	}

	public List<Product> showProductListByName(Product product) {
		return productDao.selectProductListByName(product);
	}

	public List<Product> showProductListByCate(Product product) {
		return productDao.selectProductListByCate(product);
	}

	public List<Product> showProductListBySupp(Product product) {
		return productDao.selectProductListBySupp(product);
	}

	public int showProductCost(Product product) {
		return productDao.selectProductCost(product);
	}

	public int selectOrderPno(Product product) {
		return productDao.selectProductNo(product);
	}

	public byte[] selectProductPic(Product product) {
		return productDao.selectProductPic(product);
	}

	public Product selectProductSummary(Product product) {
		return productDao.selectProductSummary(product);
	}
}
