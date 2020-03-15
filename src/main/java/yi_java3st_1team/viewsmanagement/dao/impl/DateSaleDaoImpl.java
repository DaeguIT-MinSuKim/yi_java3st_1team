package yi_java3st_1team.viewsmanagement.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yi_java3st_1team.ds.MySqlDataSource;
import yi_java3st_1team.util.LogUtil;
import yi_java3st_1team.viewsmanagement.dao.DateSaleDao;
import yi_java3st_1team.viewsmanagement.dto.DateSale;

public class DateSaleDaoImpl implements DateSaleDao {
	private static final DateSaleDaoImpl Instance = new DateSaleDaoImpl();
	
	public DateSaleDaoImpl() {}
	
	public static DateSaleDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public List<DateSale> selectDateSaleByAll() {
		String sql = "select	o.o_no as 주문번호, " + 
				"		c.c_name as 고객상호명, " + 
				"		p.p_name as 품목명, " + 
				"		o.o_qty as 주문수량, " + 
				"		(case o.o_dps when '0' then '미입금'  when '1' then '완료'	end) as 입금여부, " + 
				"		o.o_date as 주문일자 " + 
				"  from `order` o natural join client c natural join product p " + 
				" where o.o_cno = c.c_no and p.p_no = o.o_pno";
		List<DateSale> list = new ArrayList<DateSale>();
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			while(rs.next()) {
				DateSale dateSale = new DateSale();
				dateSale.setO_no(rs.getInt(1));
				dateSale.setC_name(rs.getString(2));
				dateSale.setP_name(rs.getString(3));
				dateSale.setO_qty(rs.getInt(4));
				dateSale.setO_dps(rs.getString(5));
				dateSale.setO_date(rs.getDate(6));
				
				list.add(dateSale);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<DateSale> procedureDateSaleByDate(DateSale ds) throws SQLException {
		List<DateSale> list = new ArrayList<DateSale>();
		String sql = "{call dateSale(?, ?)}";
		Connection con = MySqlDataSource.getConnection();
		try(CallableStatement cstmt = con.prepareCall(sql);){
			cstmt.setDate(1, ds.getStart_o_date());
			cstmt.setDate(2, ds.getEnd_o_date());
			LogUtil.prnLog(cstmt);
			try(ResultSet rs = cstmt.executeQuery()){
				while(rs.next()) {
					DateSale dateSale = new DateSale();
					dateSale.setO_no(rs.getInt(1));
					dateSale.setC_name(rs.getString(2));
					dateSale.setP_name(rs.getString(3));
					dateSale.setO_qty(rs.getInt(4));
					dateSale.setO_dps(rs.getString(5));
					dateSale.setO_date(rs.getDate(6));
					
					list.add(dateSale);
				}
			}
		}
		return list;
	}

}
