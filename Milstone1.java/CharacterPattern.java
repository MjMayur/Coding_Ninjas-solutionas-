import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/int k11 = 1;
		int y = 65;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (k11 <= n) {
			int j = 1;
			char pth1 = (char) (y);
			while (j <= k11) {

				System.out.print(pth1);
				j = j + 1;
				pth1++;
			}
			System.out.println();
			k11 = k11 + 1;
			y++;
		}

	}

}
