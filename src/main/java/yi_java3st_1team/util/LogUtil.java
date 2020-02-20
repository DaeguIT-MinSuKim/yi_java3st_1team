package yi_java3st_1team.util;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtil {
	   static final Logger LOG = LogManager.getLogger();

	   public static void prnLog(PreparedStatement pstmt) {
	      String str = pstmt.toString().substring(pstmt.toString().lastIndexOf(": ") + 2);
	      str = str.replace("]", "");
	      LOG.trace("pstmt - "+str);
	   }

	   public static void prnLog(Object obj) {
	      LOG.trace(String.format("%s", obj));
	   }

	   public static void prnLog(SQLException e) {
	      LOG.trace(String.format("errorCode %s errorMessage %s", e.getErrorCode(), e.getMessage()));
	   }

}
