package prob;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.JDBC_Util;

public class EmpManager {

	public void printEmployee(String[] jobs) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0; // 변수선언파트
		
		String sql = "select e.employee_id, e.first_name, e.salary" + 
				" from employees e, jobs j" + 
				" where e.job_id=j.job_id and (j.job_title=? or j.job_title=?)";
				
		try {
			con = JDBC_Util.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅작업
			ps.setString(1, jobs[0]);
			ps.setString(2, jobs[1]);
			rs = ps.executeQuery();
			
			// 실행
			while(rs.next()) {
				System.out.print(rs.getInt("employee_id")+" ");
				System.out.print(rs.getString("first_name")+" ");
				System.out.print(rs.getInt("salary")+" ");
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
