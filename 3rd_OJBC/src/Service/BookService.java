package Service;

import java.util.List;

import valueobj.BookVO;

public interface BookService { // 반드시 뒤에 서비스라는 용어를 붙이는게 암묵적인 인터페이스 명명 규칙!
	List<BookVO> booklist();
	int addBook(BookVO vo) throws Exception;
	
}
