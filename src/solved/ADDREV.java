package solved;

import java.util.Scanner;

public class ADDREV {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		while(n-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(reverse(reverse(a)+reverse(b)));
		}
	}
	
	static int reverse(int n) {
		String s = ""+n;
		
		String result = "";
		
		for(int i = s.length() - 1 ; i >= 0 ; i--)
			result+=s.charAt(i);
		
		return Integer.parseInt(result);
	}

}
