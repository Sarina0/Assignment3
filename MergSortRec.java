import java.util.Arrays;

public class MergSortRec {
    
    public static void merge(int arr[], int m, int start, int end){
        System.out.println("Left ->");
        for(int i=start; i<=m; i++){
            System.out.println(" " + arr[i] + " ");
        }
        System.out.println();
        System.out.println("Right: ");
        for (int j= m+1; j<=end; j++ ) {
        System.out.println(" " + arr[j] + " ");
        }
        System.out.println();
        int len = end-start +1;
        int s = start;
        int r = m + 1;
        int mid = m;
        int temp[] = new int[len];
        int c = 0;
        while (s <= mid & r<= end){
           if (arr[s]<arr[r]){
           temp[c] = arr[s];
           s++;
        }
        else {
            temp[c] = arr[r];
            r++;
        }
        c++;
    }
    while (s <= mid){
        temp[c] = arr[s];
        s++;
        c++;
    }
    while (r <= end){
        temp[c] = arr[r];
        r++;
        c++;


    }
    for(int k = start; k <= end; k++){
        arr[k] = temp[k-start];
    }
    System.out.println("Left After Merge: ");
    for(int i = start; i<=m; i++){
        System.out.println(" "+ arr[i] + " ");

        }
        System.out.println();
        System.out.println("Right After Merge: ");

        for(int j = m+1; j<= end; j++){
            System.out.println(" " + arr[j] + " ");
        }
            System.out.println();
    }

    public static void mergSort(int a[], int start, int end){
        if(end-start > 0){
            int mid = (end+start)/2;
            mergSort(a, start, mid);
            mergSort(a, mid+1, end);
            merge(a,mid,start,end);
        }
        return;
    }
    public static void main (String args[]){
        
         int arr[] = {20,70,2,49,48,3,7,21};
         mergSort(arr,0,arr.length-1);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}
