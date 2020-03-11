package yi_java3st_1team.ordermanagement.ui.service;

import java.util.List;

import yi_java3st_1team.ordermanagement.dao.IQDao;
import yi_java3st_1team.ordermanagement.dao.impl.IQDaoImpl;
import yi_java3st_1team.ordermanagement.dto.InventoryQuantity;
import yi_java3st_1team.productmanagement.dto.Product;

public class IQUIService {
	private IQDao iqDao = IQDaoImpl.getInstance();
	
	public List<InventoryQuantity> showInventoryQuantityList(){
		return iqDao.selectInventoryQuantityByAll();
	}
	
	public void removeIQ(InventoryQuantity delIQ) {
		iqDao.deleteIQ(delIQ);
	}
	
	public void addIQ(InventoryQuantity newIQ) {
		iqDao.insertIQ(newIQ);
	}
	
	public void motifyIQ(InventoryQuantity upIQ) {
		iqDao.updateIQ(upIQ);
	}

	public int showQty(Product proSummary) {
		return iqDao.selectIqQtyByPname(proSummary);
	}
	
	public void SubProductQty(Product subProduct, int sub) {
		iqDao.subIqQty(subProduct, sub);
	}
	
	public InventoryQuantity lastIQ() {
		return iqDao.selectIQLastDate();
	}
}
