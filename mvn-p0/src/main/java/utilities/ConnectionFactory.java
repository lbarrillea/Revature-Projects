package utilities;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	// referance pointer default null
	private static Connection connection;
	
	private ConnectionFactory() {
		
	}
	
		public static Connection getConnection() {
			if(connection == null) {
				
			
			try {
				
				Properties props = new Properties();
				
				//put proper file name when file is proper format and rebuilt
				FileReader connectionProperties = new FileReader("src/main/resources/connection.properties");
				props.load(connectionProperties);
				
				String connectionString ="jdbc:mariadb://"+
						props.getProperty("endpoint")+":"+
						props.getProperty("port")+"/"+
						props.getProperty("dbname")+"?user="+
						props.getProperty("username")+"&password="+
						props.getProperty("password");
				
				connection = DriverManager.getConnection(connectionString);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//todo make me better
			}
		}
			return connection;
	}
}
