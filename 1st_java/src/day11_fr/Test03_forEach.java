package day11_fr;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test03_forEach {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(77);
		list.add(97);
		list.add(76);
		list.add(87);
		list.add(50);
		for(Integer data:list) {
			System.out.print(data+" ");
		}
		System.out.println("\n----------------------------");
		
		list.forEach(new Consumer<Integer>() { // forEach에는 Consumer 타입이 옴
			@Override
			public void accept(Integer t) {
				System.out.print(t+" ");
			}
		});
		// forEach는 변수 내부에 있는 것을 모두 돌아가며 수행하는 콜백함수(자동호출)
		System.out.println("\n----------------------------");
		list.forEach((Integer t) -> System.out.print(t+" "));
		System.out.println("\n----------------------------");
		list.forEach(t -> System.out.print(t+" "));
		
		System.out.println("\n----------------------------");
		list.removeIf(i -> i%2 == 0);
		list.forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		System.out.println("\n----------------------------");
		list.replaceAll(i -> i*10);
		list.forEach(i -> System.out.print(i+" "));
		
		
	}

}
