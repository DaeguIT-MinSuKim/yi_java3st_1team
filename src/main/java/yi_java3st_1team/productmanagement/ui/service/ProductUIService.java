package yi_java3st_1team.productmanagement.ui.service;

import java.util.List;

import yi_java3st_1team.productmanagement.dao.CategoryDao;
import yi_java3st_1team.productmanagement.dao.ProductDao;
import yi_java3st_1team.productmanagement.dao.impl.CategoryDaoImpl;
import yi_java3st_1team.productmanagement.dao.impl.ProductDaoImpl;
import yi_java3st_1team.productmanagement.dto.Category;
import yi_java3st_1team.productmanagement.dto.Product;

public class ProductUIService {
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
}
