package day09_tu.Exception;

public class Test03_ThreadJiyon {

	public static void main(String[] args) {
	// throws InterruptedException	{
		System.out.println("start");

		for(int i=0 ; i<10 ; i++) {
			System.out.println("--------------------");
			try { 
				Thread.sleep(1000); // 1초간 실행 지연
			}catch(InterruptedException e) { // 시간 예외...?
				
			}
		}
		System.out.println("end");
		
	}

}
