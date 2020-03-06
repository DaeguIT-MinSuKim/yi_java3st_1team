package yi_java3st_1team.productmanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import yi_java3st_1team.clientmanagement.dao.impl.SupplierDaoImpl;
import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.productmanagement.dao.SupplierPurchaseDao;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.dto.SupplierPurchase;
import yi_java3st_1team.util.LogUtil;

public class SupplierPurchaseDaoImpl implements SupplierPurchaseDao {
	private static final SupplierDaoImpl Instance = new SupplierDaoImpl();
	
	public SupplierPurchaseDaoImpl() {}

	public static SupplierDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public SupplierPurchase selectSupplierPurchaseLastDate() {
		String sql = "select sp_no from supplier_purchase order by p_no desc limit 1";
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
		Product spPname = new Product(rs.getString("p_name"), rs.getInt("p_cost"));
		Supplier spSname = new Supplier(rs.getString("s_name"));
		Product spPcost = new Product(rs.getString("p_name"), rs.getInt("p_cost"));
		Date spDate = rs.getTimestamp("sp_date");
		int spQty = rs.getInt("sp_qty");
		return new SupplierPurchase(spNo, spPname, spSname, spPcost, spQty, spDate);
	}

	@Override
	public int insertSupplierPurchase(SupplierPurchase sp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSupplierPurchase(SupplierPurchase sp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteSupplierPurchase(SupplierPurchase sp) {
		// TODO Auto-generated method stub
		return 0;
	}

}
