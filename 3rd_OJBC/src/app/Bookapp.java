package app;

import java.util.List;

import Service.BookService;
import Service.BookServiceImpl;
import dao.BookDAO;
import valueobj.BookVO;

public class Bookapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookDAO dao = new BookDAO();
		BookService service = new BookServiceImpl(dao);
		// 모든개체의 데이터타입은 부모가될수 있다, 오버라이딩 해서 부모 됨
		
		BookVO user = new BookVO("Frostmourne", "Arthus", 777);
		try {
			service.addBook(user);
		} catch (Exception e) {
			System.out.println("등록 데이터 확인 필요");
		}
		
		if(service != null) {
			List<BookVO> list = service.booklist();
			list.forEach(i->System.out.println(i));
			
		}
				
	}

}

// 클래스를 만들면 멤버변수 프라이빗처리, 게터세터생성, 생성자생성
