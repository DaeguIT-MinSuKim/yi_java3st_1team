package yi_java3st_1team.productmanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.productmanagement.dao.SupplierOrderDao;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.dto.SupplierOrder;
import yi_java3st_1team.util.LogUtil;

public class SupplierOrderDaoImpl implements SupplierOrderDao {
	private static final SupplierOrderDaoImpl Instance = new SupplierOrderDaoImpl();

	public SupplierOrderDaoImpl() {
	}

	public static SupplierOrderDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public SupplierOrder selectSupplierOrderLastDate() {
		String sql = "select so_no from supplier_order order by so_no desc limit 1";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			LogUtil.prnLog(pstmt);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return getSONo(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private SupplierOrder getSONo(ResultSet rs) throws SQLException {
		int soNo = rs.getInt("so_no");
		return new SupplierOrder(soNo);
	}

	@Override
	public List<SupplierOrder> selectSupplierOrderByAll() {
		String sql = "select so_no, so_pno, p.p_name, s.s_name, p.p_cost, so_qty, so_date from supplier_order so "
				+ "left join product p on so.so_pno = p.p_no left join supplier s on p.p_sno = s.s_no";
		try (Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			List<SupplierOrder> list = new ArrayList<>();
			while (rs.next()) {
				list.add(getSOJoin(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private SupplierOrder getSOJoin(ResultSet rs) throws SQLException {
		int soNo = rs.getInt("so_no");
		Product soPno = new Product(rs.getInt("so_pno"));
		Product soPname = new Product(rs.getString("p_name"), rs.getInt("p_cost"));
		Supplier soSname = new Supplier(rs.getString("s_name"));
		Product soPcost = new Product(rs.getString("p_name"), rs.getInt("p_cost"));
		Date soDate = rs.getTimestamp("so_date");
		int soQty = rs.getInt("so_qty");
		return new SupplierOrder(soNo, soPno, soPname, soSname, soPcost, soQty, soDate);
	}

	@Override
	public int insertSupplierOrder(SupplierOrder so) {
		String sql = "insert into supplier_order(so_no, so_pno, so_qty, so_date) values(?, ?, ?, ?)";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, so.getSoNo());
			pstmt.setInt(2, so.getSoPno().getpNo());
			pstmt.setInt(3, so.getSoQty());
			pstmt.setTimestamp(4, new Timestamp(so.getSoDate().getTime()));
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateSupplierOrder(SupplierOrder so) {
		String sql = "update supplier_order set so_pno=?, so_qty=?, so_date=? where so_no=?";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, so.getSoPno().getpNo());
			pstmt.setInt(2, so.getSoQty());
			pstmt.setTimestamp(3, new Timestamp(so.getSoDate().getTime()));
			pstmt.setInt(4, so.getSoNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteSupplierOrder(SupplierOrder so) {
		String sql = "delete from supplier_order where so_no=?";
		try (Connection con = MySqlDataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, so.getSoNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
