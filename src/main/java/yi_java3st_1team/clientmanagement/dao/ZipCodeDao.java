package yi_java3st_1team.clientmanagement.dao;

import java.util.List;

import yi_java3st_1team.clientmanagement.dto.ZipCode;

public interface ZipCodeDao {
	List<ZipCode> selectZipCodeSearch(ZipCode zipcode);	
	ZipCode selectAddressSearchNumAll(ZipCode zipSearch);
	ZipCode selectAddressSearchNumOne(ZipCode zipSearch);
}
