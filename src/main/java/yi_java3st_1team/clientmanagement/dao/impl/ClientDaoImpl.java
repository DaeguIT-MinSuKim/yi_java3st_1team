package yi_java3st_1team.clientmanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import yi_java3st_1team.clientmanagement.dao.ClientDao;
import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.util.LogUtil;

public class ClientDaoImpl implements ClientDao {
	private static final ClientDaoImpl Instance = new ClientDaoImpl();
	
	public ClientDaoImpl() {}
	
	public static ClientDaoImpl getInstance() {
		return Instance;
	}
	@Override
	public Client selectClientByNo(Client client) {
		String sql = "select c_no, c_name, c_ceo, c_address, c_tel, c_id, c_mail, c_date, c_salesman from client where c_no=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, client.getcNo());
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getClient(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	private Client getClient(ResultSet rs) throws SQLException {
		int cNo = rs.getInt("c_no");
		String cName = rs.getString("c_name");
		String cCeo = rs.getString("c_ceo");
		String cAddress = rs.getString("c_address");
		String cTel = rs.getString("c_tel");
		String cId = rs.getString("c_id");
		String cMail = rs.getString("c_mail");
		String cDate = rs.getString("c_date");
		int cSalesman = rs.getInt("c_salesman");
		return new Client(cNo, cName, cCeo, cAddress, cTel, cId, cMail, cDate, cSalesman);
	}

	@Override
	public List<Client> selectClientByAll() {
		String sql = "select c_no, c_name, c_ceo, c_address, c_tel, c_id, c_mail, c_date, c_salesman from client";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			List<Client> list = new ArrayList<Client>();
			while(rs.next()) {
				list.add(getClient(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertClient(Client client) {
		String sql = "insert into client values(?,?,?,?,?,?,?,?,?,?)";
		int res = -1;
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, client.getcNo());
			pstmt.setString(2, client.getcName());
			pstmt.setString(3, client.getcCeo());
			pstmt.setString(4, client.getcAddress());
			pstmt.setString(5, client.getcTel());
			pstmt.setString(6, client.getcId());
			pstmt.setString(7, client.getcPw());
			pstmt.setString(8, client.getcMail());
			pstmt.setString(9, realtime());
			pstmt.setInt(10, client.getcSalesman());
			LogUtil.prnLog(pstmt);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	private String realtime() {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		Date time = new Date();
		String realTime = format1.format(time);
		return realTime;
	}

	@Override
	public int updateClient(Client client) {
		String sql = "update client set c_name=?, c_ceo=?, c_address=?, c_tel=?, c_salesman=? where c_no=?";
		int res = -1;
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, client.getcName());
			pstmt.setString(2, client.getcCeo());
			pstmt.setString(3, client.getcAddress());
			pstmt.setString(4, client.getcTel());
			pstmt.setInt(5, client.getcSalesman());
			pstmt.setInt(6, client.getcNo());
			LogUtil.prnLog(pstmt);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int deleteClient(Client client) {
		String sql = "delete from client where c_no=?";
		int res = -1;
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, client.getcNo());
			LogUtil.prnLog(pstmt);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public Client selectClientLastData() {
		String sql = "select c_no from client order by c_no desc limit 1";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getCNo(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Client getCNo(ResultSet rs) throws SQLException {
		int cNo = rs.getInt("c_no");
		return new Client(cNo);
	}

	@Override
	public List<Client> selectClientListByName(Client selectClient) {
		String sql = "select c_no, c_name, c_ceo, c_address, c_tel, c_salesman from client where c_name=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, selectClient.getcName());
			ResultSet rs = pstmt.executeQuery();
			List<Client> list = new ArrayList<Client>();
			while(rs.next()) {
				list.add(getClient1(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Client> selectClientListByCeo(Client selectClient) {
		String sql = "select c_no, c_name, c_ceo, c_address, c_tel, c_salesman from client where c_ceo=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, selectClient.getcCeo());
			ResultSet rs = pstmt.executeQuery();
			List<Client> list = new ArrayList<Client>();
			while(rs.next()) {
				list.add(getClient1(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Client> selectClientListByTel(Client selectClient) {
		String sql = "select c_no, c_name, c_ceo, c_address, c_tel, c_salesman from client where c_tel=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, selectClient.getcTel());
			ResultSet rs = pstmt.executeQuery();
			List<Client> list = new ArrayList<Client>();
			while(rs.next()) {
				list.add(getClient1(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Client> selectClientListBySalesman(Client selectClient) {
		String sql = "select c_no, c_name, c_ceo, c_address, c_tel, c_salesman from client where c_salesman=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, selectClient.getcSalesman());
			ResultSet rs = pstmt.executeQuery();
			List<Client> list = new ArrayList<Client>();
			while(rs.next()) {
				list.add(getClient1(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Client selectClientByName(Client client) {
		String sql = "select c_no, c_name, c_ceo, c_address, c_tel, c_salesman from client where c_name=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, client.getcName());
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getClient1(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Client getClient1(ResultSet rs) throws SQLException {
		int cNo = rs.getInt("c_no");
		String cName = rs.getString("c_name");
		String cCeo = rs.getString("c_ceo");
		String cAddress = rs.getString("c_address");
		String cTel = rs.getString("c_tel");
		int cSalesman = rs.getInt("c_salesman");
		return new Client(cNo, cName, cCeo, cAddress, cTel, cSalesman);
	}

	@Override
	public String selectClientsEmpName(Client client) {
		String sql = "select e_name from employee e left join client c on e.e_no=c.c_salesman where c.c_salesman=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, client.getcSalesman());
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getEmpName(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private String getEmpName(ResultSet rs) throws SQLException {
		String empName = rs.getString("e_name");
		return empName;
	}

	@Override
	public int selectClientsEmpNo(String empName) {
		String sql = "select e_no from employee where e_name=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, empName);
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getEmpNo(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	private int getEmpNo(ResultSet rs) throws SQLException {
		int empNo = rs.getInt("e_no");
		return empNo;
	}

	@Override
	public int selectClientNo(Client client) {
		String sql = "select c_no from client where c_name=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, client.getcName());
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getClientNo(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	private int getClientNo(ResultSet rs) throws SQLException {
		int Cno = rs.getInt("c_no");
		return Cno;
	}

	@Override
	public int selectCsalesman(Client client) {
		String sql = "select c_salesman from client where c_name=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, client.getcName());
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getSalesman(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	private int getSalesman(ResultSet rs) throws SQLException {
		int cSman = rs.getInt("c_salesman"); 
		return cSman;
	}

}
