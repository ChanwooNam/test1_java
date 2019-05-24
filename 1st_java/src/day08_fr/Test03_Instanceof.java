package day08_fr;

import day08_fr.Person;

public class Test03_Instanceof {

	public static void main(String[] args) {
		Object[] obj = {
				new Fish("연어"),
				new Dog("시바","진돗"),
				new Student("홍길동", 20, 1)
				
		};
		
		for(Object data:obj) {
			exec(data);
		}

	}
	public static void exec(Object obj) {
		if(obj instanceof Person)
		((Person)obj).print();
	}
}
