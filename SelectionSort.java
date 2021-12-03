import java.io.*;
class SelectionSort {
    //   not selection sort
	public static void main(String []args) throws IOException {
		int n, c, d, swap;
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number of integers to sort");
		n = Integer.parseInt(sc.readLine());
		int array[] = new int[n];
		System.out.println("Enter " + n + " integers");
		for (c = 0; c < n; c++) 
		      array[c] = Integer.parseInt(sc.readLine());
		for (c = 0; c < ( n - 1 ); c++) {
			for (d = 0; d < n - c - 1; d++) {
				if (array[d] > array[d+1]) 
				/* For descending order use < */ {
					swap       = array[d];
					array[d]   = array[d+1];
					array[d+1] = swap;
				}
			}
		}
		System.out.println("Sorted list of numbers");
		for (c = 0; c < n; c++) 
		      System.out.println(array[c]);
	}
}