package day06_tu;
/**
*
*@author student
*@since 190430
*@version v1.0
*
*/
public class Account {

	private String accno;
	private int money;
	
	public Account() { // 생성자; Account 클래스의 메모리 로딩 이후, 초기화 작업 수행
		// System.out.println("Account() 생성자 수행");
		// this.setAccno("000");
		// this.setMoney(10);
		this("000",10); // this는 생성자 스스로의 또다른 생성자 함수 - 반드시 첫번째 문장으로 할 것!
		
	}
	
	public Account(String accno, int money) {
		this.setAccno(accno);
		this.setMoney(money);		
	}

	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		if(money >= 0)
		this.money = money;
	}
	
	public void input(int money) { // 입금
		if(money >= 0) {
			this.money += money;
		}
	}
	
	public int output(int money) { // 출금
		if(this.money >= money) {
			this.money -= money;
			return money;
		}
		System.out.println("잔고가 부족합니다");
		return 0;
	}
	//계좌이체
	/**
	 * 
	 * @param from  보내는계좌
	 * @param to    받는계좌
	 * @param money 이체금액
	 * 
	 */
	public static void wire(Account from, Account to, int money) {
		to.input(from.output(money));
	}
	
	public void print() { // 통장정보
		System.out.printf("Account[통장번호 : %20s, 잔고 %d 원]%n",accno,money);
	}

}
