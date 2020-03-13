package yi_java3st_1team.viewsmanagement.dao;

import java.sql.SQLException;
import java.util.List;

import yi_java3st_1team.viewsmanagement.dto.DateSale;

public interface DateSaleDao {
	List<DateSale> selectDateSaleByAll();
	List<DateSale> procedureDateSaleByDate(DateSale ds) throws SQLException;
}
