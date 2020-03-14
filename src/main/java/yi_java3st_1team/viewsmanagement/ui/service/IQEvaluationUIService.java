package yi_java3st_1team.viewsmanagement.ui.service;

import java.sql.SQLException;
import java.util.List;

import yi_java3st_1team.viewsmanagement.dao.IQEvaluationDao;
import yi_java3st_1team.viewsmanagement.dao.impl.IQEvaluationDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.IQEvaluation;

public class IQEvaluationUIService {
	private IQEvaluationDao iqEvaluationDao = IQEvaluationDaoImpl.getInstance();
	
	public List<IQEvaluation> showIQEvalutionList(){
		return iqEvaluationDao.selectIQEvaluationByAll();
	}
	
	public List<IQEvaluation> showIQEvaluationByPName(IQEvaluation iq) throws SQLException{
		return iqEvaluationDao.procedureIQEvaluationByPName(iq);
	}
	
	public List<IQEvaluation> showIQShortageByIQQty(){
		return iqEvaluationDao.selectIQShortageByIQQty();
	}
	
	public List<IQEvaluation> showIQModerateByIQQty(){
		return iqEvaluationDao.selectIQModerateByIQQty();
	}
	
	public List<IQEvaluation> showIQExcessiveByIQQty(){
		return iqEvaluationDao.selectIQExcessiveByIQQty();
	}
}
