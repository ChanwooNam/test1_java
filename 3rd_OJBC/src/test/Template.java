package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBC_Util;

public class Template {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "";
		
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0; // 변수선언파트
		
		
		try {
			con = JDBC_Util.getConnection();
			st = con.createStatement();
			ps = con.prepareStatement(sql); // ? 세팅작업
			// 실행
			// 결과값 핸들링
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBC_Util.close(con, st, rs);
		}
		
	}

}
