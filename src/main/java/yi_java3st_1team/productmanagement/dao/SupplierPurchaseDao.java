package yi_java3st_1team.productmanagement.dao;

import java.util.List;

import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.dto.SupplierPurchase;

public interface SupplierPurchaseDao {
	SupplierPurchase selectSupplierPurchaseLastDate();
	
	List<SupplierPurchase> selectSupplierPurchaseByAll();
	
	int insertSupplierPurchase(SupplierPurchase sp);
	int updateSupplierPurchase(SupplierPurchase sp);
	int deleteSupplierPurchase(SupplierPurchase sp);

	int selectSupplierPurchasePno(Product sp);
}
