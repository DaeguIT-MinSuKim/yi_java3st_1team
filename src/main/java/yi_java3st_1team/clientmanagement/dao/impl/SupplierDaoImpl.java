package yi_java3st_1team.clientmanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yi_java3st_1team.clientmanagement.dao.SupplierDao;
import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.util.LogUtil;

public class SupplierDaoImpl implements SupplierDao {
	private static final SupplierDaoImpl Instance = new SupplierDaoImpl();
	
	public SupplierDaoImpl() {}
	
	public static SupplierDaoImpl getInstance() {
		return Instance;
	}
	
	@Override
	public Supplier selectSupplierByName(Supplier supplier) {
		String sql = "select s_no, s_name, s_bln, s_address, s_tel, s_fax from supplier where s_name=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, supplier.getsName());
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getSupplier(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Supplier selectSupplierByNo(Supplier supplier) {
		String sql = "select s_no, s_name, s_bln, s_address, s_tel, s_fax from supplier where s_no=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, supplier.getsNo());
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getSupplier(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Supplier getSupplier(ResultSet rs) throws SQLException {
		int sNo = rs.getInt("s_no");
		String sName = rs.getString("s_name");
		String sBln = rs.getString("s_bln");
		String sAddress = rs.getString("s_address");
		String sTel = rs.getString("s_tel");
		String sFax = rs.getString("s_fax");
		return new Supplier(sNo, sName, sBln, sAddress, sTel, sFax);
	}

	@Override
	public Supplier selectSuppplierLastData() {
		String sql = "select s_no from supplier order by s_no desc limit 1";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getSNo(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Supplier getSNo(ResultSet rs) throws SQLException {
		int sNo = rs.getInt("s_no");
		return new Supplier(sNo);
	}

	@Override
	public List<Supplier> selectSupplierListByName(Supplier selectSupplier) {
		String sql = "select s_no, s_name, s_bln, s_address, s_tel, s_fax from supplier where s_name=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, selectSupplier.getsName());
			ResultSet rs = pstmt.executeQuery();
			List<Supplier> list = new ArrayList<Supplier>();
			while(rs.next()) {
				list.add(getSupplier(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<Supplier> selectSupplierListByBln(Supplier selectSupplier) {
		String sql = "select s_no, s_name, s_bln, s_address, s_tel, s_fax from supplier where s_bln=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, selectSupplier.getsBln());
			ResultSet rs = pstmt.executeQuery();
			List<Supplier> list = new ArrayList<Supplier>();
			while(rs.next()) {
				list.add(getSupplier(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<Supplier> selectSupplierListByTel(Supplier selectSupplier) {
		String sql = "select s_no, s_name, s_bln, s_address, s_tel, s_fax from supplier where s_tel=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, selectSupplier.getsTel());
			ResultSet rs = pstmt.executeQuery();
			List<Supplier> list = new ArrayList<Supplier>();
			while(rs.next()) {
				list.add(getSupplier(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<Supplier> selectSupplierByAll() {
		String sql = "select s_no, s_name, s_bln, s_address, s_tel, s_fax from supplier";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			List<Supplier> list = new ArrayList<Supplier>();
			while(rs.next()) {
				list.add(getSupplier(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertSupplier(Supplier supplier) {
		String sql = "insert into supplier values(?,?,?,?,?,?)";
		int res = -1;
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, supplier.getsNo());
			pstmt.setString(2, supplier.getsName());
			pstmt.setString(3, supplier.getsBln());
			pstmt.setString(4, supplier.getsAddress());
			pstmt.setString(5, supplier.getsTel());
			pstmt.setString(6, supplier.getsFax());
			LogUtil.prnLog(pstmt);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int updateSupplier(Supplier supplier) {
		String sql = "update supplier set s_name=?, s_bln=?, s_address=?, s_tel=?, s_fax=? where s_no=?";
		int res = -1;
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, supplier.getsName());
			pstmt.setString(2, supplier.getsBln());
			pstmt.setString(3, supplier.getsAddress());
			pstmt.setString(4, supplier.getsTel());
			pstmt.setString(5, supplier.getsFax());
			pstmt.setInt(6, supplier.getsNo());
			LogUtil.prnLog(pstmt);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int deleteSupplier(Supplier supplier) {
		String sql = "delete from supplier where s_no = ?";
		int res = -1;
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, supplier.getsNo());
			LogUtil.prnLog(pstmt);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

}
