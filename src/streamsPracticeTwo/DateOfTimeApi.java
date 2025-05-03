package streamsPracticeTwo;

public class DateOfTimeApi {
	public static void main(String[] args) {

		// Used LocalDate API to get the date
		System.out.println("Current local date: " + java.time.LocalDate.now());

		// Used LocalTime API to get the time
		System.out.println("Current local time: " + java.time.LocalTime.now());

		// Used LocalDateTime API to get both date and time
		System.out.println("Current local date time: " + java.time.LocalDateTime.now());
	}
}
