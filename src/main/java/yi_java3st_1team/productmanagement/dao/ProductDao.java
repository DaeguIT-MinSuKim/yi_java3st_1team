package yi_java3st_1team.productmanagement.dao;

import java.util.List;

import yi_java3st_1team.productmanagement.dto.Product;

public interface ProductDao {
	Product selectProductLastData();
	
	List<Product> selectProductByAll();
	
	int insertProduct(Product product);
	int updateProduct(Product product);
	int deleteProduct(Product product);

	Product selectProductByName(Product overlapProduct);

	List<Product> selectProductListByName(Product product);
	List<Product> selectProductListByCate(Product product);
	List<Product> selectProductListBySupp(Product product);
}
