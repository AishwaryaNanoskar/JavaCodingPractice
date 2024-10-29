package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		List<EmployeeDetailsDto> empDetails = Stream.of(
				new EmployeeDetailsDto("Aishwarya", 26, "Computer Engineer", "Female",
						Arrays.asList("aishwarya@gmail.com", "sona@gmail.com")),
				new EmployeeDetailsDto("Akash", 29, "IT Engineer", "Male",
						Arrays.asList("uttam@gmail.com", "akash@gmail.com")))
				.collect(Collectors.toList());

		List<String> flatMap = empDetails.stream().flatMap(x -> x.getEmailId().stream()).collect(Collectors.toList());
		System.out.println(flatMap);

	}
}
