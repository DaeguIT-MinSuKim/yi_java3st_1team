package yi_java3st_1team.ds;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class MySqlDataSource {
	private static HikariDataSource ds;
	private static int minIdle = 10;
	private static int maxPoolSize = 100;
	
	static {
		try (InputStream is = ClassLoader.getSystemResourceAsStream("application.properties")){
			Properties prop = new Properties();
			prop.load(is);
			HikariConfig cfg = new HikariConfig(prop);
			ds = new HikariDataSource(cfg);
			ds.setMinimumIdle(minIdle);
			ds.setMaximumPoolSize(maxPoolSize);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	private MySqlDataSource() {}
	
	public static Connection getConnection() throws SQLException{
		return ds.getConnection();
	}
}
