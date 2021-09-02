import java.util.ArrayList;
import java.util.Scanner;

public class Euclidean_GCD {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a list of integers to find the GCD of. \n"
				+ "One per line.");
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		while (scnr.hasNextInt()) {
			numList.add((scnr.nextInt()));
		}
		
		int gcdResult = gcd(numList, numList.get(0), numList.get(1));
		System.out.println("The GCD of these numbers is: " + gcdResult);
	}
	
	/* Euclid's Algorithm works by first dividing the two numbers. The divisor(b) becomes the dividend(a). 
	 * Then, the remainder becomes the divisor. The process repeats itself until it gets a remainder of 0.
	 * This indicates that it has found the GCD of the numbers requested.
	 */
	public static int gcd(ArrayList<Integer> nums, Integer a, Integer b) {
		if (a == 0 && nums.size() > 1) {
			nums.remove(0);
			return gcd(nums, b, nums.get(0));
		}
		
		if (a == 0 && nums.size() <= 1) {
			return b;
		}
		else {
			return gcd(nums, b%a, a);
		}
		
	}

}
