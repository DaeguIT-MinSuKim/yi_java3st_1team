package yi_java3st_1team.clientmanagement.ui.service;

import java.util.List;

import yi_java3st_1team.clientmanagement.dao.ClientDao;
import yi_java3st_1team.clientmanagement.dao.impl.ClientDaoImpl;
import yi_java3st_1team.clientmanagement.dto.Client;

public class ClientUIService {
	private ClientDao clientDao = ClientDaoImpl.getInstance();
	
	public List<Client> showClientList(){
		return clientDao.selectClientByAll();
	}
}
