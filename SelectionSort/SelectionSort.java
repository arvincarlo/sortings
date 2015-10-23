import java.util.Scanner;

public class SelectionSort {
	static Scanner in;

	private static void selsort(int n, int[]data) {
	int i, j, min, temp;
	System.out.print("\nSorted List is:\n");
	for (i = 0; i < n - 1; i++) {
		min = 1;
		for(j = i + 1; j < n; j++) {
			if(data[j] < data[min]){
				min = j;
			}
		}
		temp = data[i];
		data[i] = data[min];
		data[min] = temp;
	}
	for (i = 0; i < n; i++) {
		System.out.print(data[i] + "\t");
	}
}

public static void main(String args[]) {
	int i, size;
	in = new Scanner(System.in);

	System.out.print("\nEnter no of Elements:");
	size = in.nextInt();
	int[] data = new int[size];

		System.out.print("\nUnsorted Data\n");
	for (i = 0; i < size; i++){
		System.out.print(data[i] + "\t");
	}
	
	selsort(size, data);
}
}