package solved;
import java.util.Scanner;

//http://www.spoj.com/problems/MISERMAN/
public class MISERMAN {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		
		int[][] arr = new int[n][m]; 
		
		for(int i = 0 ; i < n ; i++)
			for(int j = 0 ; j < m ; j++)
				arr[i][j] = s.nextInt();
		
		int[] results = new int[m];
		
		for(int i = 0 ; i < m ; i++)
			results[i] = findLowestFare(arr,0,i,0);
		
		System.out.println(findLowestValue(results));		
	}
	
	static int findLowestValue(int[] results) {
		int index = 0;
		
		for(int i = 1 ; i < results.length ; i++)
			if(results[index] > results[i])
				index = i;
		
		return results[index];
	}
	
	static int findLowestFare(int[][] array, int n, int m, int currentFare) {
		
		if(n < array.length - 1) {
			//search on the next row
			int[] results = {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
			for(int i = m-1, count = 0 ; i <= m+1 ; i++, count++)
				if(i >= 0 && i < array[n].length)
					results[count] = findLowestFare(array, n+1, i, currentFare+array[n][m]); 
			
			return findLowestValue(results);
			
		} else {
			return currentFare + array[n][m];
		}
	}

}
