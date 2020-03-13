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
import yi_java3st_1team.viewsmanagement.dao.IQEvaluationDao;
import yi_java3st_1team.viewsmanagement.dto.IQEvaluation;

public class IQEvaluationDaoImpl implements IQEvaluationDao {
	private static final IQEvaluationDaoImpl Instance = new IQEvaluationDaoImpl();
	
	public IQEvaluationDaoImpl() {}
	
	public static IQEvaluationDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public List<IQEvaluation> selectIQEvaluationByAll() {
		String sql = "select	p.p_name as 품목명, " + 
				"		s.s_name as 공급회사명, " + 
				"		iq.iq_qty as 재고수량, " + 
				"		p.p_price as 판매가격, " + 
				"		p.p_cost as 공급가격, " + 
				"		(case when iq.iq_qty < 50 then '재고부족'	  when iq.iq_qty >= 50 and iq.iq_qty < 150 then '적정재고'	  when iq.iq_qty >= 150 then '재고과다'	end) as 재고평가 " + 
				"  from product p natural join supplier s natural join inventory_quantity iq " + 
				" where s.s_no = p.p_sno and p.p_no = iq.iq_pno;";
		List<IQEvaluation> list = new ArrayList<IQEvaluation>();
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			while(rs.next()) {
				IQEvaluation iqEvaluation = new IQEvaluation();
				iqEvaluation.setP_name(rs.getString(1));
				iqEvaluation.setS_name(rs.getString(2));
				iqEvaluation.setIq_qty(rs.getInt(3));
				iqEvaluation.setP_price(rs.getInt(4));
				iqEvaluation.setP_cost(rs.getInt(5));
				iqEvaluation.setEvaluation(rs.getString(6));
				
				list.add(iqEvaluation);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<IQEvaluation> procedureIQEvaluationByPName(IQEvaluation iq) throws SQLException {
		List<IQEvaluation> list = new ArrayList<IQEvaluation>();
		String sql = "{call iq(?)}";
		Connection con = MySqlDataSource.getConnection();
		try(CallableStatement cstmt = con.prepareCall(sql);){
			cstmt.setString(1, iq.getP_name());
			LogUtil.prnLog(cstmt);
			try(ResultSet rs = cstmt.executeQuery()){
				while(rs.next()) {
					IQEvaluation iqEvaluation = new IQEvaluation();
					iqEvaluation.setP_name(rs.getString(1));
					iqEvaluation.setS_name(rs.getString(2));
					iqEvaluation.setIq_qty(rs.getInt(3));
					iqEvaluation.setP_price(rs.getInt(4));
					iqEvaluation.setP_cost(rs.getInt(5));
					iqEvaluation.setEvaluation(rs.getString(6));
					
					list.add(iqEvaluation);
				}
				
			}
		}
		return list;
	}

	@Override
	public List<IQEvaluation> selectIQShortageByIQQty() {
		String sql = "select	p.p_name as 품목명, " + 
				"		s.s_name as 공급회사명, " + 
				"		iq.iq_qty as 재고수량, " + 
				"		p.p_price as 판매가격, " + 
				"		p.p_cost as 공급가격, " + 
				"		'재고부족' as 재고평가 " + 
				"  from product p natural join supplier s natural join inventory_quantity iq " + 
				" where s.s_no = p.p_sno and p.p_no = iq.iq_pno and iq.iq_qty < '50'";
		List<IQEvaluation> list = new ArrayList<IQEvaluation>();
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			while(rs.next()) {
				IQEvaluation iqEvaluation = new IQEvaluation();
				iqEvaluation.setP_name(rs.getString(1));
				iqEvaluation.setS_name(rs.getString(2));
				iqEvaluation.setIq_qty(rs.getInt(3));
				iqEvaluation.setP_price(rs.getInt(4));
				iqEvaluation.setP_cost(rs.getInt(5));
				iqEvaluation.setEvaluation(rs.getString(6));
				
				list.add(iqEvaluation);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<IQEvaluation> selectIQModerateByIQQty() {
		String sql = "select	p.p_name as 품목명, " + 
				"		s.s_name as 공급회사명, " + 
				"		iq.iq_qty as 재고수량, " + 
				"		p.p_price as 판매가격, " + 
				"		p.p_cost as 공급가격, " + 
				"		'적정재고' as 재고평가 " + 
				"  from product p natural join supplier s natural join inventory_quantity iq " + 
				" where s.s_no = p.p_sno and p.p_no = iq.iq_pno and '50' <= iq.iq_qty and iq.iq_qty < '150'";
		List<IQEvaluation> list = new ArrayList<IQEvaluation>();
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			while(rs.next()) {
				IQEvaluation iqEvaluation = new IQEvaluation();
				iqEvaluation.setP_name(rs.getString(1));
				iqEvaluation.setS_name(rs.getString(2));
				iqEvaluation.setIq_qty(rs.getInt(3));
				iqEvaluation.setP_price(rs.getInt(4));
				iqEvaluation.setP_cost(rs.getInt(5));
				iqEvaluation.setEvaluation(rs.getString(6));
				
				list.add(iqEvaluation);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<IQEvaluation> selectIQExcessiveByIQQty() {
		String sql = "select	p.p_name as 품목명, " + 
				"		s.s_name as 공급회사명, " + 
				"		iq.iq_qty as 재고수량, " + 
				"		p.p_price as 판매가격, " + 
				"		p.p_cost as 공급가격, " + 
				"		'재고과다' as 재고평가 " + 
				"  from product p natural join supplier s natural join inventory_quantity iq " + 
				" where s.s_no = p.p_sno and p.p_no = iq.iq_pno and '150' <= iq.iq_qty";
		List<IQEvaluation> list = new ArrayList<IQEvaluation>();
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			while(rs.next()) {
				IQEvaluation iqEvaluation = new IQEvaluation();
				iqEvaluation.setP_name(rs.getString(1));
				iqEvaluation.setS_name(rs.getString(2));
				iqEvaluation.setIq_qty(rs.getInt(3));
				iqEvaluation.setP_price(rs.getInt(4));
				iqEvaluation.setP_cost(rs.getInt(5));
				iqEvaluation.setEvaluation(rs.getString(6));
				
				list.add(iqEvaluation);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
