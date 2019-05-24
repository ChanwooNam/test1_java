package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBC_Util;

public class Test06_Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String sql = "update book set title = ?, price = ? where bookno = ?";
		
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0; // 변수선언파트
		
		
		try {
			con = JDBC_Util.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅작업
			ps.setString(1, "centol");
			ps.setInt(2, 20000);
			ps.setInt(3, 3);
			// 실행
			row = ps.executeUpdate();
			System.out.println("delete row : "+row);
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
