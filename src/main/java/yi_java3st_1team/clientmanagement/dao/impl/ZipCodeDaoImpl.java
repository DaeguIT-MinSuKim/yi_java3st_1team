package yi_java3st_1team.clientmanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yi_java3st_1team.clientmanagement.dao.ZipCodeDao;
import yi_java3st_1team.clientmanagement.dto.ZipCode;
import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.util.LogUtil;

public class ZipCodeDaoImpl implements ZipCodeDao {
	private static final ZipCodeDaoImpl Instance = new ZipCodeDaoImpl();
	
	public ZipCodeDaoImpl() {}
	
	public static ZipCodeDaoImpl getInstance() {
		return Instance;
	}
	
	@Override
	public List<ZipCode> selectZipCodeSearch(ZipCode zipcode) {
		String sql = "select * from zip_code where z_doro=? and z_num1 = ? and z_num2= ? ;";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, zipcode.getzDoro());
			pstmt.setInt(2, zipcode.getzNum1());
			pstmt.setInt(3, zipcode.getzNum2());
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				List<ZipCode> list = new ArrayList<ZipCode>();
				while(rs.next()) {
					list.add(getZipCode(rs));
				}
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private ZipCode getZipCode(ResultSet rs) throws SQLException {
		String zCode = rs.getString("z_code");
		String zSido = rs.getString("z_sido");
		String zSigungu = rs.getString("z_sigungu");
		String zDoro = rs.getString("z_doro");
		int zNum1 = rs.getInt("z_num1");
		int zNum2 = rs.getInt("z_num2");
		return new ZipCode(zCode, zSido, zSigungu, zDoro, zNum1, zNum2);
	}
	
}	