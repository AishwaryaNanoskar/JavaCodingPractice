package interviewPracticeFour;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1, num3 =0, limit = 5;
		
		while(limit!=0) {
			num3 = num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			limit--;
					
		}
	}
}
