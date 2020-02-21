package yi_java3st_1team.main.dao.impl;

import java.util.List;

import yi_java3st_1team.main.dao.ClientDao;
import yi_java3st_1team.main.dto.Client;

public class ClientDaoImpl implements ClientDao {
	private static final ClientDaoImpl instance = new ClientDaoImpl();
	
	private ClientDaoImpl() {}
	
	public static ClientDaoImpl getInstance() {
		return instance;
	}
	@Override
	public Client selectClientByNo(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> selectClientByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertClient(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateClient(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteClient(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

}
