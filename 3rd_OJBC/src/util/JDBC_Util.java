package util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC_Util {
	public static Connection getConnection() {
		/*
		String driver = "oracle.jdbc.OracleDriver"
		String url = "jdbc:oracle:thin:@127.0.0.1:1521"
		String user = "SCOTT"
		String pw = "TIGER"
		*/
		
		Connection con = null;
	
		try {
			Properties p = new Properties(); // key값과 Value값으로 자원관리하는 객체 Properties
			p.load(new FileInputStream("c://lib/dbinfo.txt")); // 이 파일에서 자원 가져옴
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String pw = p.getProperty("pw");
			String driver = p.getProperty("driver");
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void close(Connection con,Statement st,ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(st != null) st.close();
			if(con != null) con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
