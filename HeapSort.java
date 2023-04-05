import java.util.Arrays;

public class HeapSort {
    public static void sort(int arr[]) {
        int n = arr.length;
    
      
        for (int i = n / 2 - 1; i >= 0; i--) {
          heapify(arr, n, i);
        }
    

        for (int i = n - 1; i >= 0; i--) {
          // moved to the end
          int tmp = arr[0];
          arr[0] = arr[i];
          arr[i] = tmp;
    
          heapify(arr, i, 0);
        }
      }
    
      static void heapify(int arr[], int n, int i) {
        int max = i; // max as root
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
    
        //If left is bigger than root
        if (leftChild < n && arr[leftChild] > arr[max])
          max = leftChild;
    
        //If right is bigger than max
        if (rightChild < n && arr[rightChild] > arr[max])
          max = rightChild;
    
        if (max != i) {
          int swap = arr[i];
          arr[i] = arr[max];
          arr[max] = swap;
  
         
          heapify(arr, n, max);
        }
      }
    
  

      public static void main(String args[]) {

        int arr[]=  {20,100,37,60,1,5};
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
      }
    }
    
