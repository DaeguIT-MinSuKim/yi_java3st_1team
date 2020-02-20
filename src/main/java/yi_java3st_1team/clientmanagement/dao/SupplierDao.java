package yi_java3st_1team.clientmanagement.dao;

import java.util.List;

import yi_java3st_1team.clientmanagement.dto.Supplier;

public interface SupplierDao {
	Supplier selectSupplierByNo(Supplier supplier);
	Supplier selectSuppplierLastData();
	List<Supplier> selectSupplierByAll();
	
	int insertSupplier(Supplier supplier);
	int updateSupplier(Supplier supplier);
	int deleteSupplier(Supplier supplier);
	
}
