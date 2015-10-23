import java.util.Scanner;

public class InsertionSort {
	static Scanner in;

	private static void insertion_sort(int[] x ) {
		int temp;
		int i;
		int j;
		for (i = 1; i < x.length; i++){
			temp = x[i];
			j = i - 1;
			while (temp < x[j] && j >= 0){
				x[j + 1] = x[j]= x[j];
				j = j - 1;
			}
			x[j + 1] = temp;
		}
	}
	public static void main(String args[]) {
		int[] a = new int[10];
		int i;
		in = new Scanner(System.in);
		System.out.print("Enter 10 elements to be sorted:");
			for(i = 0; i < 10; i++) {
				a[i] = in.nextInt();
			}
			
			insertion_sort(a);
			System.out.print("sorted elements:\n");
			for (i = 0; i < 10; i++) {
				System.out.printf(" %d", a[i]);
			}
}
}	
	
	