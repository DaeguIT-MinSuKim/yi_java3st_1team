package yi_java3st_1team.viewsmanagement.dao;

import java.sql.SQLException;
import java.util.List;

import yi_java3st_1team.viewsmanagement.dto.SWSale;

public interface SWSaleDao {
	List<SWSale> selectSWSaleByAll();
	List<SWSale> procedureSWSaleByPName(SWSale sw) throws SQLException;
}