package day08_fr;

public class Test02 {

	public static void main(String[] args) {
		
		// Animal a = new Animal();
		// Animal[] animals = new Animal[3];
		Animal[] animals = {
				new Fish("연어"),
				new Dog("시바","진돗"),
		};
		
		for(Animal a: animals) {
			exec(a);
		}
		
	}
	public static void exec(Animal f) {
		f.breath();
		f.print();
	}

}
