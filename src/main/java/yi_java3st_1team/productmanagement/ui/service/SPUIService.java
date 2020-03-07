package yi_java3st_1team.productmanagement.ui.service;

import java.util.List;

import yi_java3st_1team.productmanagement.dao.SupplierPurchaseDao;
import yi_java3st_1team.productmanagement.dao.impl.SupplierPurchaseDaoImpl;
import yi_java3st_1team.productmanagement.dto.SupplierPurchase;

public class SPUIService {
	private SupplierPurchaseDao supplierPurchaseDao = SupplierPurchaseDaoImpl.getInstance();
	
	public List<SupplierPurchase> showSupplierPurchaseList(){
		return supplierPurchaseDao.selectSupplierPurchaseByAll();
	}
	
	public void removeSupplierPurchase(SupplierPurchase delSP) {
		supplierPurchaseDao.deleteSupplierPurchase(delSP);
	}
	
	public void addSupplierPurchase(SupplierPurchase newSP) {
		supplierPurchaseDao.insertSupplierPurchase(newSP);
	}
	
	public void modifySupplierPurchase(SupplierPurchase upSP) {
		supplierPurchaseDao.updateSupplierPurchase(upSP);
	}
}
