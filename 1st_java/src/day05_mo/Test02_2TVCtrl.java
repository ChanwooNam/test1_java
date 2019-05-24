package day05_mo;

public class Test02_2TVCtrl {

	public static void main(String[] args) {
		TV tv1 = new TV(); // 패키지 내에 TV라는 클래스를 만들면 오류가 풀림
		tv1.color = "black";
		tv1.power();
		tv1.channelUp();
		// tv1.print(); // 각각 값이 입력되거나 수정됨
		
		TV tv2 = new TV();
		tv2.color = "red";
		// tv2.print();
		
		System.out.println("------------------------------------");
		/*TV[] tvs = new TV[5];
		tvs[0] = tv1;
		tvs[1] = tv2;*/
		
		TV[] tvs = null;
		tvs = new TV[] {tv1, tv2, null, null, null};
		
		for(int i=0 ; i<tvs.length ; i++) {
			if(tvs[i] != null) tvs[i].print();
		}
		
	}

}
