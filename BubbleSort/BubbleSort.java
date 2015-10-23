import java.util.Scanner;

public class BubbleSort {
	static Scanner in;

	public static void
 main(String args[]) {
	in = new
Scanner(System.in);
	int i, j, num, temp;

	System.out.print("Enter thr value of num \n");
	num = in.nextInt();
	int[] array = new
	int[num];
	
	System.out.print("Enter the elements one by one \n");
	for (i = 0; i < num; i++){
	array[i] = in.nextInt();
			}

	for (i = 0; i <num; i++) {
	for(j = 0; j <(num - i - 1); j++){
		if(array[j]> array[j + 1]){
	temp = array[j];
	array[j]=array[j + 1];
	array[j + 1]=temp;
}
}
}
	System.out.print("sorted array is... \n");
	for(i = 0; i < num; i ++){
	System.out.print(array[i]+"\n");
}
}
} 