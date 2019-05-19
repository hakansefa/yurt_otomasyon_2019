package yurtotomasyon;

import java.sql.Connection;
import java.sql.DriverManager;


public class connection {

	
	public static void main(String[] args) throws Exception{
		
           getConnection();
	}
public static Connection getConnection() throws Exception{
	try {
		String driver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/yurtdb";
		String user="root";
		String pass ="15741520";
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.print("Connected");
		return conn;
		
	}
	
	catch(Exception e) {System.out.print(e);}
	return null;
}
	

}
