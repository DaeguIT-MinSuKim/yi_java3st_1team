package yi_java3st_1team.clientmanagement.ui.service;

import yi_java3st_1team.clientmanagement.dao.ZipCodeDao;
import yi_java3st_1team.clientmanagement.dao.impl.ZipCodeDaoImpl;
import yi_java3st_1team.clientmanagement.dto.ZipCode;

public class ZipCodeUIService {
	private ZipCodeDao zipcodeDao = ZipCodeDaoImpl.getInstance();
	
	public ZipCode searchAddressNumAll(ZipCode zipSearch) {
		return zipcodeDao.selectAddressSearchNumAll(zipSearch);
	}

	public Object searchAddressNumOne(ZipCode zipNumOne) {
		return zipcodeDao.selectAddressSearchNumOne(zipNumOne);
	}
}
