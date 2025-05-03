package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {

		// 1
		Consumer<String> consume = s -> System.out.println(s);
		consume.accept("Aishwarya");

		// 2
		Consumer<List<Integer>> list = li -> {
			for (Integer i : li)
				System.out.println(i * 10);
		};

		list.accept(Arrays.asList(1, 2, 3, 4));
		
		Consumer<String> consumer = s -> System.out.println("Data is: "+s);
		consumer.accept("Aishwarya Nanoskar");
	}
}
