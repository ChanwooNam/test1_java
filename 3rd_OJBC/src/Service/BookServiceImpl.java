package Service;

import java.util.List;

import dao.BookDAO;
import valueobj.BookVO;

public class BookServiceImpl implements BookService { // 얘도 이름 규칙이 있음
	
	private BookDAO dao;
	
	public BookServiceImpl() {
	super();
}

	public BookServiceImpl(BookDAO dao) {
	super();
	this.dao = dao;
}

	public BookDAO getDao() {
		return dao;
	}

	public void setDao(BookDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<BookVO> booklist() {
		// TODO Auto-generated method stub
		return dao.bookList();
	}

	@Override
	public int addBook(BookVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.addBook(vo);
	}
	
}
