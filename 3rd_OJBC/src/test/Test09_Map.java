package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.JDBC_Util;
import valueobj.BookVO;

public class Test09_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String sql = "select * from book";
		
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0; // 변수선언파트
		List<BookVO> books = new ArrayList<BookVO>(); // 배열선언 
		Map<Integer, BookVO> map = new HashMap<Integer, BookVO>();
		
		try {
			con = JDBC_Util.getConnection();
			st = con.prepareStatement(sql);
			ps = con.prepareStatement(sql);
			// ? 세팅작업
			
			rs = ps.executeQuery();
			
			// 실행
			while(rs.next()) {
				/*System.out.print(rs.getString("title")+" ");
				System.out.print(rs.getInt("price")+" ");
				System.out.print(rs.getDate("pubdate")+" ");
				System.out.println();*/
				BookVO book = new BookVO();
				book.setPrice(rs.getInt("price"));
				book.setBookno(rs.getInt("bookno"));
				book.setTitle(rs.getString("title"));
				book.setPubdate(rs.getDate("pubdate").toString());
				// System.out.println(book);
				books.add(book); // 주소 모음
				map.put(book.getBookno(), book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBC_Util.close(con, ps, rs);
		}
		System.out.println("Book List");
		for(BookVO d:books) {
			System.out.println(d);
		}
		System.out.println("----------------------------------");
		books.forEach(book->System.out.println(book));
		System.out.println("----------------------------------");
		map.forEach((k,v)->System.out.println(v));
	}

}
