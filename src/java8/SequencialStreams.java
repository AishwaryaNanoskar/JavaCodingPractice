package java8;

import java.util.List;

public class SequencialStreams {
	public static void main(String[] args) {
		List<String> names = List.of("Alice", "Bob", "Charlie");
		names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);

	}
}
