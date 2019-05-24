package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import util.JDBC_Util;

public class Test04_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "insert into book(bookno,title,price) " + 
				"values((select nvl(max(bookno),0)+1 from book),?,?)";
		
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0; // 변수선언파트
		
		
		try {
			con = JDBC_Util.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅작업
			ps.setString(1, "gg");
			ps.setInt(2,22000);
			
			// 실행
			row = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBC_Util.close(con, ps, rs);
		}
	}

}
