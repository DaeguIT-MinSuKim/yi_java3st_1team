package yi_java3st_1team.viewsmanagement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.viewsmanagement.dao.TotalDao;
import yi_java3st_1team.viewsmanagement.dto.Total;

public class TotalDaoImpl implements TotalDao {
private static final TotalDaoImpl Instance = new TotalDaoImpl();
	
	public TotalDaoImpl() {}
	
	public static TotalDaoImpl getInstance() {
		return Instance;
	}
	
	public Total selectTotalSales() {
		String sql = "select SUM(o.o_qty * p.p_price) " + 
				"  from `order` o natural join product p " + 
				" where p.p_no = o.o_pno";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			if(rs.next()) {
				return new Total(rs.getLong(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	@Override
	public Total selectTotalUncollected() {
		String sql = "select SUM(o.o_qty * p.p_price)\r\n" + 
				"  from `order` o natural join product p\r\n" + 
				" where p.p_no = o.o_pno and o.o_dps = '0'";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			if(rs.next()) {
				return new Total(rs.getLong(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Total selectSalesProfit() {
		String sql = "select	SUM(case when (o.o_qty >= 50 and o.o_qty < 100) then o.o_qty*p.p_price*0.9-(o.o_qty*p.p_cost) " + 
				"			  when o.o_qty >= 100 then o.o_qty*p.p_price*0.85-(o.o_qty*p.p_cost) " + 
				"		 else (o.o_qty*p.p_price)-(o.o_qty*p.p_cost)	end) as 판매이윤 " + 
				"  from product p natural join `order` o " + 
				" where p.p_no = o.o_pno";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			if(rs.next()) {
				return new Total(rs.getLong(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Total selectDeliveryAmount() {
		String sql = "select SUM(o.o_qty*p.p_price+o.o_qty*p.p_price*0.1) " + 
				"  from `order` o natural join product p " + 
				" where p.p_no = o.o_pno";
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			if(rs.next()) {
				return new Total(rs.getLong(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
