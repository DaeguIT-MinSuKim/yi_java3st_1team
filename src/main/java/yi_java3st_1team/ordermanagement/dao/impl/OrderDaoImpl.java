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
import yi_java3st_1team.main.client.chart.OrderRanking;
import yi_java3st_1team.main.employee.chart.MajorClient;
import yi_java3st_1team.main.employee.dto.Employee;
import yi_java3st_1team.ordermanagement.dao.OrderDao;
import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.util.LogUtil;

public class OrderDaoImpl implements OrderDao {
	private static final OrderDaoImpl Instance = new OrderDaoImpl();

	public OrderDaoImpl() {
	}

	public static OrderDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public Order selectOrderLastDate() {
		String sql = "select o_no from `order` order by o_no desc limit 1";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			LogUtil.prnLog(pstmt);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
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
		String sql = "select o_no, o_date, c.c_name, p.p_name, o_qty, o_memo, o_dps, o_ok, o_eno, e.e_name, e.e_no from `order` o "
				+ "left join client c on o.o_cno = c.c_no left join product p on o.o_pno = p.p_no "
				+ "left join employee e on o.o_eno = e.e_no";
		try (Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			List<Order> list = new ArrayList<Order>();
			while (rs.next()) {
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
		Employee oEno = new Employee(rs.getInt("e_no"));
		return new Order(oNo, oDate, oCname, oPname, oQty, oMemo, oDps, oOk, oEname, oEno);
	}

	@Override
	public int insertOrder(Order order) {
		String sql = "insert into `order` (o_no, o_date, o_cno, o_pno, o_qty, o_memo, o_dps, o_ok, o_eno) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
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
		String sql = "update `order` set o_date=?, o_cno=?, o_pno=?, o_qty=?, o_memo=? where o_no=?";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setTimestamp(1, new Timestamp(order.getoDate().getTime()));
			pstmt.setInt(2, order.getoCname().getcNo());
			pstmt.setInt(3, order.getoPname().getpNo());
			pstmt.setInt(4, order.getoQty());
			pstmt.setString(5, order.getoMemo());
			pstmt.setInt(6, order.getoNo());
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
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, order.getoNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Order> selectClientOrderList(Client info) {
		String sql = "select o_no, o_date, o_cno, p.p_name, p.p_cost, p.p_price, o_qty, o_memo, o_dps, o_ok, o_eno from `order` o "
				+ "left join product p on o.o_pno =p.p_no where o_cno = ?";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, info.getcNo());
			ResultSet rs = pstmt.executeQuery();
			List<Order> list = new ArrayList<Order>();
			while (rs.next()) {
				list.add(getOrder(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Order getOrder(ResultSet rs) throws SQLException {
		int oNo = rs.getInt("o_no");
		Date oDate = rs.getTimestamp("o_date");
		Client oCname = new Client(rs.getInt("o_cno"));
		Product oPname = new Product(rs.getString("p_name"), rs.getInt("p_cost"), rs.getInt("p_price"));
		int oQty = rs.getInt("o_qty");
		String oMemo = rs.getString("o_memo");
		int oDps = rs.getInt("o_dps");
		int oOk = rs.getInt("o_ok");
		Employee oEname = new Employee(rs.getInt("o_eno"));
		return new Order(oNo, oDate, oCname, oPname, oQty, oMemo, oDps, oOk, oEname);
	}

	@Override
	public List<Order> selectOrderListByCal(String startDate, String endDate, Client info) {
		String sql = "select o_no, o_date, o_cno, p.p_name, p.p_cost, p.p_price, o_qty, o_memo, o_dps, o_ok, o_eno from `order` o "
				   + "left join product p on o.o_pno =p.p_no left join client c on o.o_cno = c.c_no where DATE(o_date) " 
				   + "between ? and ? and  c.c_no = ?";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, startDate);
			pstmt.setString(2, endDate);
			pstmt.setInt(3, info.getcNo());
			ResultSet rs = pstmt.executeQuery();
			List<Order> list = new ArrayList<Order>();
			while (rs.next()) {
				list.add(getOrder(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Order selectOrderByNo(int i) {
		String sql = "select o_no, o_date, o_cno, p.p_name, p.p_price, p.p_cost, o_qty, o_memo, o_dps, o_ok, o_eno from `order` o "
				+ "left join product p on o.o_pno =p.p_no where o_no = ?";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, i);
			LogUtil.prnLog(pstmt);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return getOrder2(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private Order getOrder2(ResultSet rs) throws SQLException {
		int oNo = rs.getInt("o_no");
		Date oDate = rs.getTimestamp("o_date");
		Client oCname = new Client(rs.getInt("o_cno"));
		Product oPname = new Product(rs.getString("p_name"), rs.getInt("p_cost"), rs.getInt("p_price"));
		int oQty = rs.getInt("o_qty");
		String oMemo = rs.getString("o_memo");
		return new Order(oNo, oDate, oCname, oPname, oQty, oMemo);
	}

	@Override
	public void updateOrderDps1(Order order) {
		String sql = "update `order` set o_dps=1, o_ok=1 where o_no=?";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, order.getoNo());
			LogUtil.prnLog(pstmt);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateOrderDps0(Order order) {
		String sql = "update `order` set o_dps=0, o_ok=0 where o_no=?";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, order.getoNo());
			LogUtil.prnLog(pstmt);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int selectSalesMoney(String startDate, String endDate, int dept) {
		String sql = "select sum(p.p_price * o.o_qty) from `order` o join product p on o.o_pno = p.p_no "
				   + "join employee e on o.o_eno = e.e_no where o.o_date between ? and ? and e.e_dept = ?";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, startDate);
			pstmt.setString(2, endDate);
			pstmt.setInt(3, dept);
			LogUtil.prnLog(pstmt);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return rs.getInt("sum(p.p_price * o.o_qty)");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int selectOrderTotalMoney(String firstDate, String lastDate, Client info) {
		String sql = "select sum(p.p_price * o.o_qty) from `order` o left join product p on o.o_pno =p.p_no " 
				   + "left join client c on o.o_cno = c.c_no where DATE(o_date) between ? and ? " 
				   + "and c.c_no = ? order by p.p_price * o.o_qty desc limit 5;";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, firstDate);
			pstmt.setString(2, lastDate);
			pstmt.setInt(3, info.getcNo());
			LogUtil.prnLog(pstmt);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return rs.getInt("sum(p.p_price * o.o_qty)");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}
	
	@Override
	public List<OrderRanking> selectOrderMoney(String firstDate, String lastDate, Client info) {
		String sql = "select o.o_no, p.p_name, (p.p_price * o_qty) from `order` o left join product p on o.o_pno =p.p_no "
				   + "left join client c on o.o_cno = c.c_no where DATE(o_date) between ? and ? "
				   + "and c.c_no = ? order by p.p_price * o.o_qty desc limit 5;";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, firstDate);
			pstmt.setString(2, lastDate);
			pstmt.setInt(3, info.getcNo());
			ResultSet rs = pstmt.executeQuery();
			List<OrderRanking> list = new ArrayList<OrderRanking>();
			while (rs.next()) {
				list.add(getMoney(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private OrderRanking getMoney(ResultSet rs) throws SQLException {
		int orNo = rs.getInt("o_no");
		String orName = rs.getString("p_name");
		int orMoney = rs.getInt("(p.p_price * o_qty)");
		return new OrderRanking(orNo, orName, orMoney);
	}

	@Override
	public List<MajorClient> selectMajorClientList() {
		String sql = "select c.c_name, p.p_price * o.o_qty from `order` o "
				   + "join product p on o.o_pno = p.p_no join employee e on o.o_eno = e.e_no "
				   + "join client c on o.o_cno = c.c_no order by p.p_price * o.o_qty desc";
		try (Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			List<MajorClient> list = new ArrayList<MajorClient>();
			while (rs.next()) {
				list.add(getMajorClient(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private MajorClient getMajorClient(ResultSet rs) throws SQLException {
		Client oCname = new Client(rs.getString("c_name"));
		int totalMoney = rs.getInt("p.p_price * o.o_qty");
		return new MajorClient(oCname, totalMoney);
	}
}
