import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
    private static final String url = "jdbc:oracle:thin:@//localhost:1522/xepdb1";
    private static final String username = "jdbc_user";
    private static final String password = "systemsss";
    
    public static Connection getConnection() throws ClassNotFoundException,SQLException{
    	Class.forName(driver);
    	
    	Connection conn=DriverManager.getConnection(url,username,password);
    	System.out.println("DBに接続しました。");
    	return conn;
    }
    
    public static void close(Connection connection) {
    	if(connection!=null) {
    		try {
				connection.close();
				System.out.println("切断しました。");
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    }
    public static void close(PreparedStatement preparedStatement) {
    	if (preparedStatement!=null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    }
    public static void close(ResultSet resultSet) {
    	if (resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    }
}
