import java.util.*;

public class SortingNumbersApp {

	public static void main(String[] args) {
		int size = 10000;
		int[] arr = new int[size];
		for(int i =0; i< size; i++) {
			arr[i] = (int)(Math.random()*100) +1;
		}

	SortingNumbers sn = new SortingNumbers(arr);
	
	System.out.println("The 10000 numbers are: ");
	sn.display();
	
	System.out.println("The ascending order is: ");
	sn.ascendingBubbleSort();
	sn.display();
	
	System.out.println("The descending order is: ");
	sn.descendingBubbleSort();
	sn.display();
	
	
	}

}
