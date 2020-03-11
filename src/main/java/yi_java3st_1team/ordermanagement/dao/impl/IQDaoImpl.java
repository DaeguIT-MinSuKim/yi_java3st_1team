package yi_java3st_1team.ordermanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.ordermanagement.dao.IQDao;
import yi_java3st_1team.ordermanagement.dto.InventoryQuantity;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.util.LogUtil;

public class IQDaoImpl implements IQDao {
	private static final IQDaoImpl Instance = new IQDaoImpl();
	
	public IQDaoImpl() {}

	public static IQDaoImpl getInstance() {
		return Instance;
	}
	
	@Override
	public List<InventoryQuantity> selectInventoryQuantityByAll() {
		String sql = "select p.p_name , s.s_name , iq.iq_qty , p.p_price , p.p_cost from inventory_quantity iq "
	               + "left join product p on iq.iq_pno = p.p_no left join supplier s on p.p_sno = s.s_no";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			List<InventoryQuantity> list = new ArrayList<InventoryQuantity>();
			while(rs.next()) {
				list.add(getIQJoin(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private InventoryQuantity getIQJoin(ResultSet rs) throws SQLException {
		Product iqPname = new Product(rs.getString("p_name"), rs.getInt("p_cost"), rs.getInt("p_price"));
		Supplier iqSname = new Supplier(rs.getString("s_name"));
		Product iqPprice = new Product(rs.getString("p_name"), rs.getInt("p_cost"), rs.getInt("p_price"));
		Product iqPcost = new Product(rs.getString("p_name"), rs.getInt("p_cost"), rs.getInt("p_price"));
		int iqQty = rs.getInt("iq_qty");
		return new InventoryQuantity(iqPname, iqSname, iqPprice, iqPcost, iqQty);
	}

	@Override
	public int insertIQ(InventoryQuantity iq) {
		String sql = "insert into inventory_quantity (iq_no, iq_pno, iq_qty) values(?, ?, ?)";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, iq.getIqNo());
			pstmt.setInt(2, iq.getIqPno().getpNo());
			pstmt.setInt(3, iq.getIqQty());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateIQ(InventoryQuantity iq) {
		String sql = "update inventory_quantity set iq_qty=? where iq_pno=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, iq.getIqQty());
			pstmt.setInt(2, iq.getIqPno().getpNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteIQ(InventoryQuantity iq) {
		String sql = "delete from inventory_quantity where iq_no=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, iq.getIqNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int selectIqQtyByPname(Product proSummary) {
		String sql = "select iq_qty from inventory_quantity where iq_pno=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, proSummary.getpNo());
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getIqQty(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	private int getIqQty(ResultSet rs) throws SQLException {
		int qty = rs.getInt("iq_qty");
		return qty;
	}

	@Override
	public void subIqQty(Product subProduct, int sub) {
		String sql = "update inventory_quantity set iq_qty=? where iq_pno=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, sub);
			pstmt.setInt(2, subProduct.getpNo());
			LogUtil.prnLog(pstmt);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public InventoryQuantity selectIQLastDate() {
		String sql = "select iq_no from inventory_quantity order by iq_no desc limit 1";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getNo(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private InventoryQuantity getNo(ResultSet rs) throws SQLException {
		int iqNo = rs.getInt("iq_no");
		return new InventoryQuantity(iqNo);
	}

}
