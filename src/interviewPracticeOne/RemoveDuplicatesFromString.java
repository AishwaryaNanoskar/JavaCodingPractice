package interviewPracticeOne;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		String str = "cat dog fish cat matter lion matter cat";
		String ans[] = removeDuplicates(str);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);

		}

	}

	private static String[] removeDuplicates(String str) {
		// TODO Auto-generated method stub
		String answer[] = new String[100];

		String inpStr[] = str.split(" ");
//		System.out.println("inpStr[i]: "+inpStr.length);

		int k = 0;
		for (int i = 0; i < inpStr.length - 1; i++) {
//			System.out.println("inpStr[i]: "+inpStr[i]);
			for (int j = i + 1; j < inpStr.length; j++) {
//				System.out.println("inpStr[j]: "+inpStr[j]);
				if (inpStr[i].equals(inpStr[j])) {
					for (int d = 0; d < answer.length; d++) {
						if(inpStr[i].equals(answer[d])) {
							break;		
						} else {
							answer[k] = inpStr[i];
							k++;	
						}

					}

				}
			}
		}
		return answer;
	}

}
