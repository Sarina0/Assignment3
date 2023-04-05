import java.util.Arrays;

public class MergeSortIteratively{
    
    public static void merge(int[] arr, int[] temp, int left, int mid, int end)
    {
        int k = left, i = left, j = mid + 1;
 
        while (i <= mid && j <= end)
        {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }
 
        while (i < arr.length && i <= mid) {
            temp[k++] = arr[i++];
        }
        for (i = left; i <= end; i++) {
            arr[i] = temp[i];
        }
    }
 

    public static void mergesort(int[] A)
    {
        int low = 0;  // low numbers
        int high = A.length - 1;  // from high numbers
 
        int[] temp = Arrays.copyOf(A, A.length);
 
        
        for (int m = 1; m <= high - low; m = 2*m)
        {
       
            for (int i = low; i < high; i += 2*m)
            {
                int from = i;
                int mid = i + m - 1;
                int to = Integer.min(i + 2*m - 1, high);
 
                merge(A, temp, from, mid, to);
            }
        }
    }

    

    public static void main(String args[]){
        
       
        int arr[]=  {20,45,37,50,1,5};
       mergesort(arr);
       System.out.println("Sorted array: " + Arrays.toString(arr));
        
    
    }
}