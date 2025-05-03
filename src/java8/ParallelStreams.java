package java8;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreams {
	public static void main(String[] args) {
		List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Dapis");
		names.parallelStream().filter(name -> name.startsWith("D")).forEach(System.out::println);
		
		names.stream().filter(name -> name.startsWith("D")).forEach(System.out::println);

		long start = 0, end = 0;

		start = System.currentTimeMillis();

		IntStream.range(1, 100).forEach(System.out::println);

		end = System.currentTimeMillis();

		System.out.println("Plain stream took time: " + (end - start));

		System.out.println("============================================");

		start = System.currentTimeMillis();

		IntStream.range(1, 100).parallel().forEach(System.out::println);

		end = System.currentTimeMillis();

		System.out.println("Parallel stream took time: " + (end - start));
	}
}
