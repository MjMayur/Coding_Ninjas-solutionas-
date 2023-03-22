import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		//Your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
			int a = 1;
					int b='A'+n-1;
					
					while (a <= n) {
						int j =1;
						char pth1 = (char)(b);
						while (j<=a) {
							System.out.print(pth1);
							j++;
						pth1++;
						}
						System.out.println();
						a = a + 1;
						b--;
					}
				
	}
}
