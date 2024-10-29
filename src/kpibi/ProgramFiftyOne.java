package kpibi;

public class ProgramFiftyOne {

	public static void main(String[] args) {
		
		int a[] = { 4, 3, 2, 4, 9, 2 };

		int b[] = new int[a.length];

		int j = 0,count=0;
		for (int data : a) {
			for (int i = 0; i < b.length; i++) {
				if (data == b[i]) {
					break;
				} else {
					count++;
					b[j] = data;
					j++;
					break;
				}
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.print(b[i]);
			if(i!=count-1) {
				System.out.print(", ");
			}
		}
	}

}
