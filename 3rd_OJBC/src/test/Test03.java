package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.JDBC_Util;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// select * from emp where lower(ename) like '%'||'j'||'%';
		// select * from emp where lower(ename) like '%j%';
		// 변수에 ?를 쓰려면 prepard 필요
		
		String sname = JOptionPane.showInputDialog("검색할 사원의 이름은?");
		
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0; // 변수선언파트
		
		
		try {
			String sql = "select * from emp where lower(ename) like ?";
			con = JDBC_Util.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅작업
			ps.setString(1, "%"+sname.toLowerCase()+"%");
			
			// 실행
			
			rs = ps.executeQuery();
			
			// 결과값 핸들링
			while(rs.next()) {
				System.out.print(rs.getString("ename")+" ");
				System.out.print(rs.getString("deptno")+" ");
				System.out.print(rs.getString("job")+" ");
				System.out.print(rs.getDate("hiredate")+" ");
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
