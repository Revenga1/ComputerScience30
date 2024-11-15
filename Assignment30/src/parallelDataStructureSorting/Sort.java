package parallelDataStructureSorting;

public class Sort {

	public static void bubbleSortInt(Superbeast[] arr) {
		boolean swapped;
		for (int i = 0; i < arr.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].getPoints() < arr[j + 1].getPoints()) {
					Superbeast temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break; // If no swaps were made, the list is already sorted
		}

	}


	public static void bubbleSort(Superbeast[] arr) {
		boolean swapped;
		for (int i = 0; i < arr.length - 1; i++) {

			swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				
					if (arr[j].getName().toLowerCase().compareTo(arr[j + 1].getName().toLowerCase()) > 0) {
						Superbeast temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
						swapped = true;
					}
				}
				if (!swapped)
					break; // If no swaps were made, the list is already sorted
			}
		}
	
	

	
	
	
	
	
	}//end of class


