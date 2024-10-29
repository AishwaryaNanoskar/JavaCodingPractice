package kpibi;

public class ProgramFourteenLongestCommonPrefix {

	public static void main(String[] args) {

//		String strs[] = { "flower", "flow", "flight" };
		
		String strs[] = { "dog","racecar","car"};


		char c[] = new char[10];

		int k = 0;
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < strs[i].length(); j++) {
//				System.out.println(strs[i].length());
//				System.out.println("strs[i].charAt(j): " + strs[i].charAt(j));
//				System.out.println("strs[i + 1].charAt(j): " + strs[i + 1].charAt(j));
//				System.out.println("strs[i + 2].charAt(j): " + strs[i + 2].charAt(j));

				if (strs[i].charAt(j) == strs[i + 1].charAt(j) && strs[i].charAt(j) == strs[i + 2].charAt(j)) {
					c[k] = strs[i].charAt(j);
					k++;
				} else {
					break;
				}
			}
			break;
		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

	}

}
