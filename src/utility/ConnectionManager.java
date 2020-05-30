package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager
{
	
	public static Connection getConnection() throws Exception 
	{
		//System.out.println("into get connection");
		Properties p=null;

			p=loadPropertiesFile();

		
		final String driver=p.getProperty("driver");
		final String url=p.getProperty("url");
		final String username=p.getProperty("username");
		final String password=p.getProperty("password");
		//System.out.println(driver+":driver");
		//System.out.println(url+":url");
		//System.out.println(username+":username");
		//System.out.println( password+" :password");
		
		Class.forName(driver);
		Connection con=null;
		con=DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Established");
		else
			System.out.println("check again");
		
		return con;
	}
	 public static Properties loadPropertiesFile() throws Exception 
	 {
		 //System.out.println("into load method");
		 Properties prop = new Properties();
		 //System.out.println("into load method");
		 InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		//System.out.println("after in sttrream");
		 prop.load(in);
		 in.close();
		 return prop;
	} 
}