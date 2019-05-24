package day09_inner;

import day09_tu.Command;

public class Test03_Lambda { // 람다 ->로 날먹하기
	public static void main(String[] args) {
		Command delete = () -> System.out.println("delete 수행 ");
		Command update = () -> System.out.println("update 수행 ");
		Command create = () -> System.out.println("create 수행 ");
		Command list = () -> System.out.println("list 수행 ");
		
		delete.exec();
		update.exec();
		create.exec();
		list.exec();
	}

}
