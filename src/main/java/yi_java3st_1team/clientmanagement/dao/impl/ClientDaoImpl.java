package yi_java3st_1team.clientmanagement.dao.impl;

import java.util.List;

import yi_java3st_1team.clientmanagement.dao.ClientDao;
import yi_java3st_1team.main.dto.Client;

public class ClientDaoImpl implements ClientDao {
	private static final ClientDaoImpl instance = new ClientDaoImpl();
	
	private ClientDaoImpl() {}
	
	public static ClientDaoImpl getInstance() {
		return instance;
	}
	@Override
	public Client selectClientByNo(Client client) {
		String sql = "select c_no, c_name, c_ceo, c_address, c_tel, c_id, c_pw, c_mail, c_salesman from client where c_no = ?";
		return null;
	}

	@Override
	public List<Client> selectClientByAll() {
		String sql = "select c_no, c_name, c_ceo, c_address, c_tel, c_id, c_pw, c_mail, c_salesman from client";
		return null;
	}

	@Override
	public int insertClient(Client client) {
		String sql = "insert into client (c_no, c_name, c_ceo, c_address, c_tel, c_id, c_pw, c_mail, c_salesman) value\r\n" + 
				"	(null, ?, ?, ?, ?, ?, ?, ?, ?)";
		return 0;
	}

	@Override
	public int updateClient(Client client) {
		String sql = "update client set c_name = '제임스최고공부방', c_ceo = '제임스', c_address = '대구광역시 달성군 다사읍 대실역북로', c_tel = '053-123-4567', c_id = 'james', c_pw = 'qwer1234', c_mail = 'hothihi5@gmail.com', c_salesman = 46 where c_no = 56";
		return 0;
	}

	@Override
	public int deleteClient(Client client) {
		String sql = "delete from client where c_no = ?";
		return 0;
	}

}
