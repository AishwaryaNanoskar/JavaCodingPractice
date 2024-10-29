package kpibi;

import java.util.Scanner;

public class ProgramTwentySix {

	public static Integer reverseNum(Integer num) {
		
		int reverse = 0;
        
        int rem = 0;
		
		while(num!=0) {
			rem = num % 10;
            
            reverse = (reverse*10) + rem;
             
            num = num/10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		reverseNum(num);

	}

}
