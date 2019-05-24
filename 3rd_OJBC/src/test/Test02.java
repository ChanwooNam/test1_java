package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBC_Util;

public class Test02 {

	public static void main(String[] args) {
		// emp 부서별 평균 급여와 인원수를 구해서 출력
		System.out.println("JDBC Test2");
		String sql = 
				"select deptno, count(*) zzoksu, round(avg(sal),2) avs " 
				+ " from emp group by deptno"; // 키워드 앞에는 가능하면 블랭크 넣어줄것
		// 이 구문을 잘 가져와야함
		
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try{
			con = JDBC_Util.getConnection(); // 2. DB 연결작업
			st = con.createStatement(); // 3. sql 관리 객체 Statement 생성
			rs = st.executeQuery(sql); // 4. sql구문 실행하여 rs로 결과값 전송
			
			while(rs.next()) {
				/*System.out.print(rs.getString(1)+"  ");
				System.out.print(rs.getString(2)+"  ");
				System.out.print(rs.getString(3)+"  ");*/
				
				System.out.print(rs.getString("deptno")+"  ");
				System.out.print(rs.getString("zzoksu")+"  ");
				System.out.print(rs.getString("avs")+"  ");
				System.out.println();
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally { // 자원반납쓰
			JDBC_Util.close(con,st,rs);
		}
		System.out.println("**end**");
	}

}
