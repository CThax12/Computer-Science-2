import java.text.DecimalFormat;
import java.util.Random;

public class searchTime {

	public static void main(String[] args) {
		//Create array and fill it with random numbers.
		int[] randomNumbers = new int[100000];
		fillArray(randomNumbers);
		
		//Generate the key to look for so we can keep it the same for both searches.
		Random rand = new Random();
		int keyIndex = rand.nextInt(99999);
		int key = randomNumbers[keyIndex];
		
		//Perform the searches.
		long linearStartTime = System.nanoTime();
		linearSearch(randomNumbers, key, keyIndex);
		long linearEndtime = System.nanoTime();
		getLinearTime(linearStartTime, linearEndtime);

		long binaryStartTime = System.nanoTime();
		binarySearch(randomNumbers, key, keyIndex);
		long binaryEndTime = System.nanoTime();
		getBinaryTime(binaryStartTime, binaryEndTime);
		
		compareTime(linearStartTime, linearEndtime, binaryStartTime, binaryEndTime);


	}
	
	private static void getLinearTime(long linearStartTime, long linearEndtime) {
		DecimalFormat df = new DecimalFormat("###,###,###");

		System.out.println("The linear search took: " + df.format(linearEndtime - linearStartTime) + " Nanoseconds");
		
	}
	
	private static void getBinaryTime(long binaryStartTime, long binaryEndtime) {
		DecimalFormat df = new DecimalFormat("###,###,###");

		System.out.println("The binary search took: " + df.format(binaryEndtime - binaryStartTime) + " Nanoseconds");
		
	}
	
	private static void compareTime(long linearStartTime, long linearEndTime, long binaryStartTime, long binaryEndTime) {
		DecimalFormat df = new DecimalFormat("###,###,###");
		long linearTime = linearEndTime - linearStartTime;
		long binaryTime = binaryEndTime - binaryStartTime;
		long difference = 0;
		if (binaryTime < linearTime) {
			difference = linearTime - binaryTime;
			System.out.println("\nThe binary search was quicker by: " + df.format(difference) + " Nanoseconds.");
		}
		else {
			difference = binaryTime - linearTime;
			System.out.println("\nThe linear search was quicker by: " + df.format(difference) + " Nanoseconds.");
		}

	}

	private static void linearSearch(int[] randomNumbers, int key, int keyIndex) {
		DecimalFormat df = new DecimalFormat("###,###,###");

		System.out.println("We are searching for the number: " + df.format(key) +
				".\nIt is located at index: " + df.format(keyIndex) + "\n");
		
		for (int i = 0; i < randomNumbers.length; ++i) {
			if (randomNumbers[i] == key) {
				System.out.println("Linear search complete.\n");
			}
			
		}
		
	}
	
private static void binarySearch(int[] randomNumbers, int key, int keyIndex) {
		
		
		int high = randomNumbers.length - 1;
		int low = 0;
		int mid = (low + high) / 2;
		while (low <= high) {
			
			if (randomNumbers[mid] < key) {
				low = mid + 1;
			}
			else if (randomNumbers[mid] == key) {
				System.out.println("Binary search complete.\n");
				return;
			}
			else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}
		System.out.println("not found.");
	}



	//fills the array with random numbers
	public static void fillArray(int[] array) {
		Random rand = new Random();
		array[0] = rand.nextInt(100);

		for (int i = 1; i < array.length; ++i) {
			array[i] = array[i-1] + rand.nextInt(100) + 1;
		}
	}

}
