package yi_java3st_1team.clientmanagement.ui.service;

import java.util.List;

import yi_java3st_1team.clientmanagement.dao.SupplierDao;
import yi_java3st_1team.clientmanagement.dao.impl.SupplierDaoImpl;
import yi_java3st_1team.clientmanagement.dto.Supplier;

public class SupplierUIService {
	private SupplierDao supplierDao = SupplierDaoImpl.getInstance();
	
	public List<Supplier> showSupplierList(){
		return supplierDao.selectSupplierByAll();
	}
	
	public Supplier OverlapSupplier(Supplier overlapSupplier) {
		return supplierDao.selectSupplierByName(overlapSupplier);
	}
	
	public Supplier lastSupplier() {
		return supplierDao.selectSuppplierLastData();
	}
	
	public void removeSupplier(Supplier delSupplier) {
		supplierDao.deleteSupplier(delSupplier);
	}
	
	public void addSupplier(Supplier newSupplier) {
		supplierDao.insertSupplier(newSupplier);
	}
	
	public void modifySupplier(Supplier upSupplier) {
		supplierDao.updateSupplier(upSupplier);
	}
}
