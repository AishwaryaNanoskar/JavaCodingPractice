package StringPrograms;

public class RemoveDupsFromString {
	public static void main(String[] args) {
		String str = "Aishwaryazti";

		char a[] = str.replace("\\s", "").toLowerCase().toCharArray();
		
		//Array to store distinct characters
		char c[] = new char[a.length];
		
		//Converting the array with distinct characters to string
		StringBuilder sb = new StringBuilder();
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < c.length; j++) {
				if (a[i] != c[j]) {
					count++;
					continue;
				} else {
					break;
				}					
			}
			//Is the character iterates through the complete array the count will be equal to the
			//length of the array and the element will not be present in the new array
			if(count == a.length) {
				c[k] = a[i];
				sb.append(a[i]);
				k++;
			}
				
		}
		System.out.println(sb.toString());
	}
}
