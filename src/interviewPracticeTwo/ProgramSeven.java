package interviewPracticeTwo;

public class ProgramSeven {
	public static void main(String[] args) {
		int num = 153, sum = 0;
		int rep = num;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem * rem * rem;
			num = num / 10;
		}
		if (rep == sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
	}
}
