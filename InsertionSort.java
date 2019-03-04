// insertionSort implements Sorting Algorithm's function sort 
// With each iteration in Insertion Sort an element is picked and inserted into the correct sorted spot in the array
public class  InsertionSort implements SortingAlgorithm{

	public void sort(int[] a){
		// for loop that runs through the array, but starts at the second number in the array
		for (int i = 1; i<a.length;i++){
			int temp = a[i];
			int j = i-1;
			while(j>= 0 && a[j]>temp){
				a[j+1] = a[j];
				--j;
				a[j+1] = temp;
			}
		}
	}
}