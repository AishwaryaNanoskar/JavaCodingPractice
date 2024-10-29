package interviewPracticeFour;

public class LargestElementInAnArray {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9}; 
		int largestNum = arr[0];
		for(int num: arr) {
			if(num > largestNum)
				largestNum = num;
		}
		System.out.println(largestNum);
	}
}
