package solved;

import java.math.BigInteger;
import java.util.Scanner;

public class JULKA {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext()) {
			
			BigInteger total = s.nextBigInteger();
			BigInteger difference = s.nextBigInteger();
			
			BigInteger natalia = total.subtract(difference).divide(BigInteger.valueOf(2));
			
			BigInteger klaudia = total.subtract(natalia);
			
			System.out.println(klaudia);
			System.out.println(natalia);
		}
	}

}
