package yi_java3st_1team.productmanagement.dao;

import java.util.List;

import yi_java3st_1team.productmanagement.dto.SupplierOrder;

public interface SupplierOrderDao {
	SupplierOrder selectSupplierOrderLastDate();
	
	List<SupplierOrder> selectSupplierOrderByAll();
	
	int insertSupplierOrder(SupplierOrder so);
	int updateSupplierOrder(SupplierOrder so);
	int deleteSupplierOrder(SupplierOrder so);
}
