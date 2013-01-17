package unsolved;

public class GNYR09F {
	
	public static void main(String[] args) {
		System.out.println(AdjBC("011101101") == 3);
		System.out.println(AdjBC("111101101") == 4);
		System.out.println(AdjBC("010101010") == 0);
	}
	
	static int AdjBC(String s) {
		
		int adj = 0;
		
		for(int i = 0 ; i < s.length() - 1 ; i++)
			if(s.charAt(i) == '1' && s.charAt(i+1) == '1')
				adj++;
		
		return adj;
	}
	
	static String generateAdjString(int nBits, int nAdj) {
		
		int combinations = nBits - 1;
		
		return "";
	}
	
	//5 2 = 6
	//20 8 = 63426
}
