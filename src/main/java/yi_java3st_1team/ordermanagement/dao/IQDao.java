package yi_java3st_1team.ordermanagement.dao;

import java.util.List;

import yi_java3st_1team.ordermanagement.dto.InventoryQuantity;
import yi_java3st_1team.productmanagement.dto.Product;

public interface IQDao {
	List<InventoryQuantity> selectInventoryQuantityByAll();
	
	int insertIQ(InventoryQuantity iq);
	int updateIQ(InventoryQuantity iq);
	int deleteIQ(InventoryQuantity iq);

	int selectIqQtyByPname(Product proSummary);
	
	void subIqQty(Product subProduct, int sub);

	InventoryQuantity selectIQLastDate();
}
