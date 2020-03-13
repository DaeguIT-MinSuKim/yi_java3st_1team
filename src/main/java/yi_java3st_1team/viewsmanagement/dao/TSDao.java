package yi_java3st_1team.viewsmanagement.dao;

import java.util.List;

import yi_java3st_1team.viewsmanagement.dto.TransactionStatement;

public interface TSDao {
	List<TransactionStatement> selectTSByAll();
}
