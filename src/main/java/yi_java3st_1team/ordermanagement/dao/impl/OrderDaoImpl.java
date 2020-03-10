package yi_java3st_1team.ordermanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.main.dto.Employee;
import yi_java3st_1team.ordermanagement.dao.OrderDao;
import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.util.LogUtil;

public class OrderDaoImpl implements OrderDao {
	private static final OrderDaoImpl Instance = new OrderDaoImpl();
	
	public OrderDaoImpl() {}

	public static OrderDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public Order selectOrderLastDate() {
		String sql = "select o_no from `order` order by o_no desc limit 1";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getONo(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Order getONo(ResultSet rs) throws SQLException {
		int oNo = rs.getInt("o_no");
		return new Order(oNo);
	}

	@Override
	public List<Order> selectOrderByAll() {
		String sql = "select o_no, o_date, c.c_name, p.p_name, o_qty, o_memo, o_dps, o_ok, e.e_name, e.e_no from `order` o "
				   + "left join client c on o.o_cno = c.c_no left join product p on o.o_pno = p.p_no "
				   + "left join employee e on o.o_eno = e.e_no";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			List<Order> list = new ArrayList<Order>();
			while(rs.next()) {
				list.add(getOrderJoin(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Order getOrderJoin(ResultSet rs) throws SQLException {
		int oNo = rs.getInt("o_no");
		Date oDate = rs.getTimestamp("o_date");
		Client oCname = new Client(rs.getString("c_name"), null, null);
		Product oPname = new Product();
		oPname.setpName(rs.getString("p_name"));
		int oQty = rs.getInt("o_qty");
		String oMemo = rs.getString("o_memo");
		int oDps = rs.getInt("o_dps");
		int oOk = rs.getInt("o_ok");
		Employee oEname = new Employee();
		oEname.setEmpName(rs.getString("e_name"));
		return new Order(oNo, oDate, oCname, oPname, oQty, oMemo, oDps, oOk, oEname);
	}

	@Override
	public int insertOrder(Order order) {
		String sql = "insert into `order` (o_no, o_date, o_cno, o_pno, o_qty, o_memo, o_dps, o_ok, o_eno) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, order.getoNo());
			pstmt.setTimestamp(2, new Timestamp(order.getoDate().getTime()));
			pstmt.setInt(3, order.getoCname().getcNo());
			pstmt.setInt(4, order.getoPname().getpNo());
			pstmt.setInt(5, order.getoQty());
			pstmt.setString(6, order.getoMemo());
			pstmt.setInt(7, order.getoDps());
			pstmt.setInt(8, order.getoOk());
			pstmt.setInt(9, order.getoEname().getEmpNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateOrder(Order order) {
		String sql = "update `order` set o_date=?, o_cno=?, o_pno=?, o_qty=?, o_memo=?, o_dps=?, o_ok=?, o_eno=? where o_no=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setTimestamp(1, new Timestamp(order.getoDate().getTime()));
			pstmt.setInt(2, order.getoCname().getcNo()+1);
			pstmt.setInt(3, order.getoPname().getpNo()+1);
			pstmt.setInt(4, order.getoQty());
			pstmt.setString(5, order.getoMemo());
			pstmt.setInt(6, order.getoDps());
			pstmt.setInt(7, order.getoOk());
			pstmt.setInt(8, order.getoEname().getEmpNo()+1);
			pstmt.setInt(9, order.getoNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteOrder(Order order) {
		String sql = "delete from `order` where o_no=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, order.getoNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
