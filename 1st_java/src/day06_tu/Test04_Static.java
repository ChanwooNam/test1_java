package day06_tu;
import day06_tu.BlockTest;
public class Test04_Static {

	public static void main(String[] args) {
		System.out.println("start ...");
		// BlockTest b = new BlockTest();
		System.out.println("-------------------------------------");
	//	BlockTest c = new BlockTest();
		
		System.out.println("end ...");

	}

}

class BlockTest{
	static
	{
		System.out.println("초기화 static {   }");
	}
	{
		System.out.println("초기화 {   }");
	}
	public BlockTest() {
		System.out.println("BlockTest() 생성자 ..");
	}
	
}