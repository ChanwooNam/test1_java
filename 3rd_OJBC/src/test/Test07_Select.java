package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBC_Util;

public class Test07_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String sql = "select * from book";
		
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0; // 변수선언파트
		
		
		try {
			con = JDBC_Util.getConnection();
			st = con.prepareStatement(sql);
			ps = con.prepareStatement(sql);
			// ? 세팅작업
			
			rs = ps.executeQuery();
			
			// 실행
			while(rs.next()) {
				System.out.print(rs.getString("title")+" ");
				System.out.print(rs.getInt("price")+" ");
				System.out.print(rs.getDate("pubdate")+" ");
				System.out.println();
			}
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
