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
import yi_java3st_1team.productmanagement.dao.ProductDao;
import yi_java3st_1team.productmanagement.dto.Category;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.util.LogUtil;

public class ProductDaoImpl implements ProductDao {
	private static final ProductDaoImpl Instance = new ProductDaoImpl();
	
	public ProductDaoImpl() {}

	public static ProductDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public List<Product> selectProductByAll() {
		String sql ="select p_no, c. cate_no, c.cate_name, p_name, p_cost, p_price, s.s_no, s.s_name, p_qty, p_date, p_picpath from product p "
				  + "left join category c on p.p_cate = c.cate_no "
				  + "left join supplier s on p.p_sno = s.s_no";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			List<Product> list = new ArrayList<Product>();
			while(rs.next()) {
				list.add(getProductJoin(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> selectProductListByName(Product product) {
		String sql ="select p_no, c.cate_no, c.cate_name, p_name, p_cost, p_price, s.s_no, s.s_name, p_qty, p_date, p_picpath from product p "
				  + "left join category c on p.p_cate = c.cate_no "
				  + "left join supplier s on p.p_sno = s.s_no where p_name=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, product.getpName());
			ResultSet rs = pstmt.executeQuery();
			List<Product> list = new ArrayList<>();
			while(rs.next()) {
				list.add(getProductJoin(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<Product> selectProductListByCate(Product product) {
		String sql ="select p_no, c.cate_no, c.cate_name, p_name, p_cost, p_price, s.s_no, s.s_name, p_qty, p_date, p_picpath from product p "
				  + "left join category c on p.p_cate = c.cate_no "
				  + "left join supplier s on p.p_sno = s.s_no where cate_no=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, product.getpCate().getCateNo());
			ResultSet rs = pstmt.executeQuery();
			List<Product> list = new ArrayList<>();
			while(rs.next()) {
				list.add(getProductJoin(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<Product> selectProductListBySupp(Product product) {
		String sql ="select p_no, c.cate_no, c.cate_name, p_name, p_cost, p_price, s.s_no, s.s_name, p_qty, p_date, p_picpath from product p "
				  + "left join category c on p.p_cate = c.cate_no "
				  + "left join supplier s on p.p_sno = s.s_no where s_name=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, product.getpSno().getsName());
			ResultSet rs = pstmt.executeQuery();
			List<Product> list = new ArrayList<>();
			while(rs.next()) {
				list.add(getProductJoin(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private Product getProductJoin(ResultSet rs) throws SQLException {
		int pNo = rs.getInt("p_no");
		Category pCate = new Category(rs.getInt("cate_no"), rs.getString("cate_name"));
		String pName = rs.getString("p_name");
		int pCost = rs.getInt("p_cost");
		int pPrice = rs.getInt("p_price");
		Supplier pSno = new Supplier(rs.getInt("s_no"));
		pSno.setsName(rs.getString("s_name"));
		int pQty = rs.getInt("p_qty");
		Date pDate = rs.getTimestamp("p_date");
		String pPicPath = rs.getString("p_picpath");
		return new Product(pNo, pCate, pName, pCost, pPrice, pSno, pQty, pDate, pPicPath);
	}

	@Override
	public int insertProduct(Product product) {
		String sql = "insert into product(p_no, p_cate, p_name, p_cost, p_price, p_sno, p_qty, p_date, p_pic, p_picpath) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, product.getpNo());
			pstmt.setInt(2, product.getpCate().getCateNo());
			pstmt.setString(3, product.getpName());
			pstmt.setInt(4, product.getpCost());
			pstmt.setInt(5, product.getpPrice());
			pstmt.setInt(6, product.getpSno().getsNo()+1);
			pstmt.setInt(7, product.getpQty());
			pstmt.setTimestamp(8, new Timestamp(product.getpDate().getTime()));
			LogUtil.prnLog(pstmt);
			pstmt.setBytes(9, product.getpPic());
			pstmt.setString(10, product.getpPicPath());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateProduct(Product product) {
		StringBuilder sql = new StringBuilder("update product set p_cate=?, p_name=?, p_cost=?, p_price=?, p_sno=?, p_qty=?, p_date=?, ");
		if(product.getpPic()!=null) sql.append("p_pic=?, ");
		if(product.getpPicPath()!=null) sql.append("p_picpath=?, ");
		sql.replace(sql.lastIndexOf(","), sql.length(), " ");
		sql.append("where p_no=?");
		
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql.toString())){
			pstmt.setInt(1, product.getpCate().getCateNo());
			pstmt.setString(2, product.getpName());
			pstmt.setInt(3, product.getpCost());
			pstmt.setInt(4, product.getpPrice());
			pstmt.setInt(5, product.getpSno().getsNo()+1);
			pstmt.setInt(6, product.getpQty());
			pstmt.setTimestamp(7, new Timestamp(product.getpDate().getTime()));
			int argCnt = 8;
			if(product.getpPic()!=null) {
				pstmt.setBytes(argCnt++, product.getpPic());
				pstmt.setString(argCnt++, product.getpPicPath());
			}
			pstmt.setInt(argCnt++, product.getpNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteProduct(Product product) {
		String sql = "delete from product where p_no=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, product.getpNo());
			LogUtil.prnLog(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Product selectProductLastData() {
		String sql = "select p_no from product order by p_no desc limit 1";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getPNo(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Product getPNo(ResultSet rs) throws SQLException {
		int pNo = rs.getInt("p_no");
		return new Product(pNo);
	}

	@Override
	public Product selectProductByName(Product Product) {
		String sql = "select p_no, p_name, p_cost, p_price, p_qty from product where p_name=?";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, Product.getpName());
			LogUtil.prnLog(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getProduct(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Product getProduct(ResultSet rs) throws SQLException {
		int pNo = rs.getInt("p_no");
		String pName = rs.getString("p_name");
		return new Product(pNo, pName);
	}

}
