package smartPoint;
public class Sorting {
	static void sorting(int array[], boolean ascending) {  
		if (ascending) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						int temp = array[i]; // 6 8
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		} else {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] < array[j]) {
						int temp = array[i]; // 6 8
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}
	}
}
