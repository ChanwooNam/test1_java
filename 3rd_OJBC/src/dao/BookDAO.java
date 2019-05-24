package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBC_Util;
import valueobj.BookVO;

public class BookDAO { // 오라클 연동, JDBC 기법
	
	// select * from book;
	public List<BookVO> bookList(){
		List<BookVO> list = new ArrayList<BookVO>();
		String sql = "select * from book";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = JDBC_Util.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				BookVO book = new BookVO();
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getInt("price"));
				
				list.add(book);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBC_Util.close(con, ps, rs);
		}

		return list;
	}
	
	
	public int addBook(BookVO vo) throws Exception{
		String sql = "insert into book(bookno,title,author,price) " + 
				"values((select nvl(max(bookno),0)+1 from book),?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			con = JDBC_Util.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1,vo.getTitle());
			ps.setString(2,vo.getAuthor());
			ps.setInt(3,vo.getPrice());
			
			row = ps.executeUpdate();
			
		}finally {
			JDBC_Util.close(con, ps, rs);
		}

		return row;
	}



}
