package suheng;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBC_Util;

public class DeptManager {
		public List<DeptVO> getDept(){
			List<DeptVO> list = new ArrayList<DeptVO>();
			String sql = "select * from dept";
			
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			try {
				con = JDBC_Util.getConnection();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()) {
					DeptVO dept = new DeptVO();
					dept.setDeptno(rs.getInt("deptno"));
					dept.setDname(rs.getString("dname"));
					dept.setLoc(rs.getString("loc"));
					
					list.add(dept);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				JDBC_Util.close(con, ps, rs);
			}

			return list;
		}
		
}
