package kpibi;

public class ProgramFourtySeven {

	public static void main(String[] args) {
		int a[] = { 12, 9, 21, 17, 33, 7 };

		int value;

		int j = a.length - 1;
		for (int i = 0; i < a.length / 2; i++) {
			//value to store a[i] as it should not get replaced
			value = a[i];
			a[i] = a[j];
			a[j] = value;
			j--;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(""+a[i]+" ");
		}

	}

}
