package prob;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBC_Util;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select count(e.employee_id) 직속부하직원수, m.employee_id 관리자사번, m.last_name 관리자이름" +
				" from employees m, employees e" + 
				" where e.manager_id=m.employee_id" + 
				" group by m.employee_id,m.last_name" + 
				" having count(m.employee_id)>7" + 
				" order by 1";
		
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
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getInt(2)+" ");
				System.out.print(rs.getString(3)+" ");
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
