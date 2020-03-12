package yi_java3st_1team.productmanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.productmanagement.dao.ClientDeliveryDao;
import yi_java3st_1team.productmanagement.dto.ClientDelivery;
import yi_java3st_1team.productmanagement.dto.Product;

public class ClientDeliveryDaoImpl implements ClientDeliveryDao{
	
	private static final ClientDeliveryDaoImpl instance = new ClientDeliveryDaoImpl();
	
	private  ClientDeliveryDaoImpl() {}
	
	public static ClientDeliveryDaoImpl getInstance() {
		return instance;
	}
	
	//출고번호, 고객상호명, 품목명, 출고수량, 출고일자
	private ClientDelivery getClientDeliveryJoin(ResultSet rs) throws SQLException {
		int cdNo = rs.getInt("cd_no");
		Order cdSno = new Order(rs.getInt("o_no"), new Client(rs.getInt("c_no")),rs.getInt("o_qty"));
		Product pName = new Product(rs.getString("p_name"));
		Date cdDate = rs.getTimestamp("cd_date");
		Client cName = new Client(rs.getString("c_name"));
		return new ClientDelivery(cdNo, cdSno, cName, pName, cdDate);
	}

	//출고이력관리이용
	@Override
	public List<ClientDelivery> selectClientDeliveryByAll() {
		String sql = "select cd_no, c_name, p_name, o_qty, cd_date, c_no, o_no from client_delivery cd "
						+ "left join `order` o on cd.cd_sno = o.o_no "
						+ "left join product p on o.o_pno = p.p_no "
						+ "left join client c on o.o_cno = c.c_no";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			List<ClientDelivery> list = new ArrayList<>();
			while(rs.next()) {
				list.add(getClientDeliveryJoin(rs));
			}
			return list;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}



	@Override
	public ClientDelivery selectClientDeliveryLastNo(ClientDelivery cd) {
		String sql = "";
		return null;
	}

	@Override
	public int insertClientDelivery(ClientDelivery cd) {
		String sql = "";
		return 0;
	}

	@Override
	public int updateClientDelivery(ClientDelivery cd) {
		String sql = "";
		return 0;
	}

	@Override
	public int deliteClientDelivery(ClientDelivery cd) {
		String sql = "";
		return 0;
	}
}
