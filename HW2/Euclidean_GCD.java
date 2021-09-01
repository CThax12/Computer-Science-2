import java.util.Scanner;

public class Euclidean_GCD {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter two integers to find the GCD of. \n");
		
		int firstNum = scnr.nextInt();
		int secondNum = scnr.nextInt();
		
		int gcdResult = gcd(firstNum, secondNum);
		System.out.println(gcdResult);
	}
	
	/* Euclid's Algorithm works by first dividing the two numbers. The divisor becomes the dividend. 
	 * Then, the remainder becomes the divisor. The process repeats itself until it gets a remainder of 0.
	 * This indicates that it has found the GCD of the two numbers requested.
	 */
	public static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
			return gcd(b%a, a);
		
	}

}
