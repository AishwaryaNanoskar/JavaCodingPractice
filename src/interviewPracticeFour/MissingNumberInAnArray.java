package interviewPracticeFour;

public class MissingNumberInAnArray {
	public static void main(String[] args) {
		int a[] = {1,2,4,5,6,7};
		
		System.out.println("Missing numbers are: ");
		for(int i=1;i<a.length;i++) {
			int count = 0;
			for(int j=0;j<a.length;j++) {
				if(i != a[j]) {
					count++;
					continue;
				}
			}
			if(count == a.length)
				System.out.println(i);
		}
	}
}
