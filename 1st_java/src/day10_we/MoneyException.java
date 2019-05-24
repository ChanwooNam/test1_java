package day10_we;

public class MoneyException extends Exception {
	// 익셉션 통과불가
	// 런타임익셉션 아들은 트라이캐치 안해서 다 통과가능
	
	public MoneyException() {
		super("MoneyException : 금액 확인 필요");
	}
	public MoneyException(String msg) {
		super(msg);
	}
}
