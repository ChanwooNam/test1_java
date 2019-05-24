package day09_inner;

import javax.swing.JOptionPane;

interface Command {
	void exec(); // 추상메소드
	// void process(); // 메소드 추가하면 원래는 전부 다시 오버라이딩 해야함
	default public void process() { // 그걸 날먹하는 default 메소드
		System.out.println("process()");
	}
}

public class Test02_CaseExec {

	public static void main(String[] args) {
		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println("delete 수행 ");
			}
		};
		Command update = new Command() {
			
			@Override
			public void exec() {
				System.out.println("update 수행 ");
			}
		};
		Command create = new Command() {
			
			@Override
			public void exec() {
				System.out.println("create 수행 ");
			}
		};
		Command list = new Command() {
			
			@Override
			public void exec() {
				System.out.println("list 수행 ");
			}
		};
		
		String msg = JOptionPane.showInputDialog("수행할 명령을 입력하세요.create,list,delete,update");
		switch(msg.trim().toLowerCase()) { // trim으로 공백 무시, 이후 대문자무시
		case "delete":
			delete.exec();
			break;
		case "update":
			update.exec();
			break;
		case "create":
			create.exec();
			break;
		case "list":
			list.exec();
			break;
		default:
			System.out.println("다시 입력하세요");
		}

	}

}
