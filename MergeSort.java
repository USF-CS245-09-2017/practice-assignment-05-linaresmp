// code implements the interface SortingAlgorithm
public class MergeSort implements SortingAlgorithm{

//sort function calls MergeSort function
 public void sort(int arr[]) {
 	int l = 0;
 	int r = arr.length -1;
 	mergeSort(arr, l,r);
 }
    
    

//mergeSort recursively sorts through theleft and right half od the array
public void mergeSort(int arr[], int l, int r){
	{ 
        if (l < r) 
        {  
            int m = (l+r)/2; 
            mergeSort(arr, l, m); 
            mergeSort(arr , m+1, r); 
            merge(arr, l, m, r); 
        } 
    } 
}



//merge joins the left and right side of the sorted arrays and sorts it into one new completely sorted array
  public void merge(int arr[], int l, int m, int r) 
    { 

        int x = m - l + 1; 
        int y = r - m; 
        int a[] = new int [x]; 
        int b[] = new int [y]; 
        for (int i=0; i<x; ++i) 
            a[i] = arr[l + i]; 
        for (int j=0; j<y; ++j) 
            b[j] = arr[m + 1+ j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i < x && j < y) 
        { 
            if (a[i] <= b[j]) 
            { 
                arr[k] = a[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = b[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < x) 
        { 
            arr[k] = a[i]; 
            i++; 
            k++; 
        } 
        while (j < y) 
        { 
            arr[k] = b[j]; 
            j++; 
            k++; 
        } 
    }

    } 

