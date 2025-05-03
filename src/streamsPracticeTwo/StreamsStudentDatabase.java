package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsStudentDatabase {
	public static void main(String[] args) {

		List<Student> list = Stream.of(
				new Student(1, "Akash", 28, "Male", "Computer Engineer", "Mumbai", 122,
						Arrays.asList("7767834980", "765027")),
				new Student(2, "Aish", 28, "Female", "Computer Engineer", "Pune", 50,
						Arrays.asList("6789563456", "7767834980")),
				new Student(3, "Sona", 28, "Female", "Pharmacy Engineer", "Nashik", 124,
						Arrays.asList("8945678934", "7767834980")),
				new Student(4, "Asmita", 50, "Female", "Etc Engineer", "Nashik", 130,
						Arrays.asList("78934678", "7767834980")))
				.collect(Collectors.toList());

		// 1. List of students whose rank is in between 50 and 100
		List<Student> std = list.stream().filter(x -> x.getRank() >= 50 && x.getRank() <= 100)
				.collect(Collectors.toList());
		System.out.println("List of students whose rank is in between 50 and 100: " + std);

		// 2. Find the students who stays in Nashik and sort by there by their names
		List<Student> std2 = list.stream().filter(x -> x.getCity().equals("Nashik"))
				.sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder()))
				.collect(Collectors.toList());
		System.out.println("Find the students who stays in Nashik and sort by there by their names: " + std2);

		// 3. Find all the department names
		System.out.println("Department names are: ");
		list.stream().map(Student::getDept).distinct().forEach(System.out::println);
	}
}
