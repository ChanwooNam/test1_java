package day07_th;

public class Test_exam {

	public static void main(String[] args) {
				
		Person[] p = {
				new Student("홍길동",20,200201),
				new Student("길동",20,200202),
				new Student("동",20,200203),
				new Teacher("이순신",30,"JAVA"),
				new Employee("유관순",40,"교무과")
		};
		for(Person data:p) {
			personPrint(data);
		}
		System.out.println("=============학생명단=============");
		for (int i = 0 ; i<p.length ; i++) {
			if(p[i] instanceof Student)	{
				System.out.print("학번 : "+((Student)p[i]).getId()+" ");
				System.out.println(p[i].getName().charAt(0)+"**");
			}
		}
		//for(Person data:p) {
		//	System.out.println(data.getName());
		//}
	}
	
	public static void personPrint(Person e) {
		e.print();
	}
}
