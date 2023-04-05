import java.util.Arrays;

public class QuickSort {
        private int[] numbers;
        private int number;
    
        public static void sort(int[] arr) {
            // check for empty array
            if (arr ==null || arr.length==0){
                return;
            }
            int[] temp = Arrays.copyOf(arr, arr.length);
            temp = arr;
           int number = arr.length;

            quicksort(arr,temp,0,number -1);
        }
    
        private static void quicksort(int[] arr, int[] temp, int low, int high) {
            int i = low, j = high;
        
            int pivot = temp[low + (high-low)/2];
    
            while (i <= j) {
            
                while (temp[i] < pivot) {
                    i++;
                }
               
                while (temp[j] > pivot) {
                    j--;
                }
    
        
                if (i <= j) {
                    //exchange(temp,i, j);
                    int temp2 = temp[i];
            temp[i] = temp[j];
            temp[j] = temp2;
                    i++;
                    j--;
                }
            }
            // Recursion
            if (low < j)
                quicksort(arr, temp,low, j);
            if (i < high)
                quicksort(arr, temp,i, high);
        }
    
      
        public static void main(String[] args){
             
        int arr[]=  {20,100,37,50,1,5};
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
         
     
    }
}

