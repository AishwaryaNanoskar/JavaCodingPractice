package kpibi;

public class ProgramNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1235, sum = 0;

		while (num != 0) {
			int remainder = num % 10;
			sum += remainder;
			num /= 10;
		}
		System.out.println(sum);
	}

}
