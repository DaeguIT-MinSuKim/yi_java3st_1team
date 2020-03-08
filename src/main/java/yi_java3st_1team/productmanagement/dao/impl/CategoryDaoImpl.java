package yi_java3st_1team.productmanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.productmanagement.dao.CategoryDao;
import yi_java3st_1team.productmanagement.dto.Category;

public class CategoryDaoImpl implements CategoryDao {
	private static final CategoryDaoImpl Instance = new CategoryDaoImpl();
	
	public static CategoryDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public List<Category> selectCategoryByAll() {
		String sql = "select cate_no, cate_name from category";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			List<Category> list = new ArrayList<Category>();
			while(rs.next()) {
				list.add(getCategory(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Category getCategory(ResultSet rs) throws SQLException {
		int cateNo = rs.getInt("cate_no");
		String cateName = rs.getString("cate_name");
		return new Category(cateNo, cateName);
	}

}
