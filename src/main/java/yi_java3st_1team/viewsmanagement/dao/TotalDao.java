package yi_java3st_1team.viewsmanagement.dao;

import yi_java3st_1team.viewsmanagement.dto.Total;

public interface TotalDao {
	Total selectTotalSales();
	Total selectTotalUncollected();
	Total selectSalesProfit();
	Total selectDeliveryAmount();
}
