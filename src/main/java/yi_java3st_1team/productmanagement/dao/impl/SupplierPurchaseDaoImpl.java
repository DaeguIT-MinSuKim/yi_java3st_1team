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
import yi_java3st_1team.productmanagement.dao.SupplierPurchaseDao;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.dto.SupplierPurchase;
import yi_java3st_1team.util.LogUtil;

public class SupplierPurchaseDaoImpl implements SupplierPurchaseDao {
	private static final SupplierPurchaseDaoImpl Instance = new SupplierPurchaseDaoImpl();
	
	public SupplierPurchaseDaoImpl() {}

	public static SupplierPurchaseDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public SupplierPurchase selectSupplierPurchaseLastDate() {
		String sql = "select sp_no from supplier_purchase order by sp_no desc limit 1";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getSPNo(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private SupplierPurchase getSPNo(ResultSet rs) throws SQLException {
		int spNo = rs.getInt("sp_no");
		return new SupplierPurchase(spNo);
	}

	@Override
	public List<SupplierPurchase> selectSupplierPurchaseByAll() {
		String sql = "select sp_no, sp_pno, p.p_name, s.s_name, p.p_cost, sp_qty, sp_date from supplier_purchase sp "
				   + "left join product p on sp.sp_pno = p.p_no left join supplier s on p.p_sno = s.s_no";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			List<SupplierPurchase> list = new ArrayList<>();
			while(rs.next()) {
				list.add(getSPJoin(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private SupplierPurchase getSPJoin(ResultSet rs) throws SQLException {
		int spNo = rs.getInt("sp_no");
		Product spPno = new Product(rs.getInt("sp_pno"));
		Product spPname = new Product(rs.getString("p_name"), rs.getInt("p_cost"));
		Supplier spSname = new Supplier(rs.getString("s_name"));
		Product spPcost = new Product(rs.getString("p_name"), rs.getInt("p_cost"));
		Date spDate = rs.getTimestamp("sp_date");
		int spQty = rs.getInt("sp_qty");
		return new SupplierPurchase(spNo, spPno, spPname, spSname, spPcost, spQty, spDate);
	}

	@Override
	public int insertSupplierPurchase(SupplierPurchase sp) {
		String sql = "insert into supplier_purchase(sp_no, sp_pno, sp_qty, sp_date) values(?, ?, ?, ?)";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, sp.getSpNo());
			pstmt.setInt(2, sp.getSpPno().getpNo());
			pstmt.setInt(3, sp.getSpQty());
			pstmt.setTimestamp(4, new Timestamp(sp.getSpDate().getTime()));
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateSupplierPurchase(SupplierPurchase sp) {
		String sql = "update supplier_purchase set sp_pno=?, sp_qty=?, sp_date=? where sp_no=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, sp.getSpPno().getpNo());
			pstmt.setInt(2, sp.getSpQty());
			pstmt.setTimestamp(3, new Timestamp(sp.getSpDate().getTime()));
			pstmt.setInt(4, sp.getSpNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteSupplierPurchase(SupplierPurchase sp) {
		String sql = "delete from supplier_purchase where sp_no=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, sp.getSpNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
