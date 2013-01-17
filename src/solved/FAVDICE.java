package solved;
import java.util.Scanner;

public class FAVDICE {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int number = s.nextInt();
		
		while(number-- > 0) {
			double i = s.nextInt();
			double n = i;
			double expected = 0;
			
			while(n > 0) {
				expected+= i / n;
				n--;
			}
			
			System.out.println(expected);
		}
	}

}
