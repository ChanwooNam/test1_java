package day11_fr;

import java.util.HashMap;
import java.util.Map;

public class Test01_Map {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("java01","1234");
		map.put("java02","0101");
		map.put("java03","3232");
		map.put("user01","4545");
		map.put("user02","1234");
		// map.put("java01","0000");
		
		/*
		System.out.println(map); // 출력결과 중복이 허용되지 않게 최신 값 출력
		
		Set<String> key = map.keySet(); // Set 구조로 key값 배열
		
		Iterator<String> it = key.iterator(); // Iterator로 it변수에 key값을 정렬 저장
		while (it.hasNext()) { // it에 hasnext함수로 다음 값이 없을때까지 while 루프
			System.out.println(it.hasNext());
			String keyname = (String) it.next(); // keyname 변수로 itㄷrator 내 key값 출력
			System.out.println(keyname+"/"+map.get(keyname));
		}
		
		System.out.println(map.get("java01"));
		*/
		/*
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("ID와 PW를 입력하세요");
			System.out.println("ID : __________");
			String id = input.nextLine().trim();
			System.out.println("PW : __________");
			String pw = input.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 ID를 찾을 수 없습니다...");
				continue;
			}else {
				if(!pw.equals(map.get(id))) {
					System.out.println("잘못된 패스워드입니다");
				}else {
					System.out.println("로그인 완료");
				}
			}
			
		}*/
		/*
		map.forEach(new BiConsumer<String, String>(){
			public void accept(String t, String u) {
				System.out.println(t+" "+u);
			};
		});
		*/
		map.forEach((t,u)->System.out.println(t+" "+u));
		
	}

}
