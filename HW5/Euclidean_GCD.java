import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Euclidean_GCD {
	//static [] gcdResult;
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a list of integers to find the GCD of. \n"
				+ "One per line.");
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		while (scnr.hasNextInt()) {
			numList.add((scnr.nextInt()));	
		}
		
		//gcdResult = gcdExtended(numList.get(0), numList.get(1), 1, 1);
		//System.out.println("The GCD of these numbers is: " + gcdResult);
		int[] gcdResult = gcd(numList.get(0), numList.get(1));
		System.out.println("gcd(" + numList.get(0) + ", " + numList.get(1) + ") = " + gcdResult[0]);
	    System.out.println(gcdResult[1] + "(" + numList.get(0) + ") + " + gcdResult[2] + "(" + numList.get(1) + ") = " + gcdResult[0]);
	}
	
	/* Euclid's Algorithm works by first dividing the two numbers. The divisor(b) becomes the dividend(a). 
	 * Then, the remainder becomes the divisor. The process repeats itself until it gets a remainder of 0.
	 * This indicates that it has found the GCD of the numbers requested.
	 */
	
	public static Integer[] gcd(ArrayList<Integer> nums, Integer a, Integer b, Integer x, Integer y) {
		
		
		if (a == 0 && nums.size() > 1) {			
			nums.remove(0);
			return gcd(nums, b, nums.get(0), x, y);
		}
		
		Integer oldX = 1;
		Integer oldY = 1;
		
		
		
		if (a == 0 && nums.size() <= 1) {
			x = oldY - (b/a) * oldX;
	        y = oldX;
			return new Integer[] {b, x, y};
		}
		else {
			x = oldY - (b/a) * oldX;
	        y = oldX;
			return gcd(nums, b%a, a, x, y);
		}
		
		
	}
	
	public static int[] gcd(int x, int y) {
	      if (y == 0)
	         return new int[] { x, 1, 0 };

	      int[] vals = gcd(y, x % y);
	      int a = vals[0];
	      int b = vals[2];
	      int c = vals[1] - (x / y) * vals[2];
	      return new int[] { a, b, c };
	   }
	

}