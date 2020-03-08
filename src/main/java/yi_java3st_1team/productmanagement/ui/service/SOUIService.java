package yi_java3st_1team.productmanagement.ui.service;

import java.util.List;

import yi_java3st_1team.productmanagement.dao.SupplierOrderDao;
import yi_java3st_1team.productmanagement.dao.impl.SupplierOrderDaoImpl;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.dto.SupplierOrder;

public class SOUIService {
	private SupplierOrderDao supplierOrderDao = SupplierOrderDaoImpl.getInstance();
	
	public List<SupplierOrder> showSupplierOrderList(){
		return supplierOrderDao.selectSupplierOrderByAll();
	}
	
	public SupplierOrder lastSO() {
		return supplierOrderDao.selectSupplierOrderLastDate();
	}
	
	public void removeSupplierOrder(SupplierOrder delSO) {
		supplierOrderDao.deleteSupplierOrder(delSO);
	}
	
	public void addSupplierOrder(SupplierOrder newSO) {
		supplierOrderDao.insertSupplierOrder(newSO);
	}
	
	public void modifySupplierOrder(SupplierOrder upSO) {
		supplierOrderDao.updateSupplierOrder(upSO);
	}

	public int selectSupplierOrderPno(Product soPname) {
		return supplierOrderDao.selectSupplierOrderPno(soPname);
	}
}
