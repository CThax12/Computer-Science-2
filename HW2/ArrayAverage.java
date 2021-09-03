import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {

		System.out.println("Please enter doubles. One per line.");
		Scanner scan = new Scanner(System.in);
		
		double[] doublesList = new double[10];
		int[] intList = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < doublesList.length; ++i) {
			doublesList[i] = scan.nextDouble();
		}
		
		
		System.out.println("The average of the list of doubles is: " + average(doublesList));
		System.out.println("The average of the list of ints is: " + average(intList));
	}
	
	public static double average(double[] list) {
		int sum = 0;
		for (int i = 0; i < list.length; ++i) {
			sum += list[i];
		}
		
		return sum/10;
	}
	
	public static int average(int[] list) {
		int sum = 0;
		for (int i = 0; i < list.length; ++i) {
			sum += list[i];
		}
		
		return sum/10;
	}

}
