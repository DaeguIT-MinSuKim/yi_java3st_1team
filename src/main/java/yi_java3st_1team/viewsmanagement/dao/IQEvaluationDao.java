package yi_java3st_1team.viewsmanagement.dao;

import java.sql.SQLException;
import java.util.List;

import yi_java3st_1team.viewsmanagement.dto.IQEvaluation;

public interface IQEvaluationDao {
	List<IQEvaluation> selectIQEvaluationByAll();
	List<IQEvaluation> procedureIQEvaluationByPName(IQEvaluation iq) throws SQLException;
	
	List<IQEvaluation> selectIQShortageByIQQty();
	List<IQEvaluation> selectIQModerateByIQQty();
	List<IQEvaluation> selectIQExcessiveByIQQty();
	
}
