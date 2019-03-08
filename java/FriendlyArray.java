import java.util.*;
import java.lang.*;

class  FriendlyArray {
    int getPivot(int[] arr, int p, int q) {
        int start = p, i = p;
        int end = q;
        int pivot = arr[end];
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                // Swap i & j;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        // Swap i & pivot.
        int temp = arr[i];
        arr[i] = pivot;
        arr[end] = temp;
        return i;
    }

     int quickSort(int[] arr, int p, int q ) {
        int sum = 0;
         int cases=4;
         int size=arr.length;
        for (int i = 0; i < cases; i++) {
             int j;
//             quickSort(arr, 0, arr.length - 1);
             int min = 0;
             for (int k = 0; k < arr.length; k++) {
                 if (k == 0) {
                     min = Math.abs(arr[k + 1] - arr[k]);
                 } else if (k == arr.length - 1) {
                     min = Math.abs(arr[k] - arr[k - 1]);
                 } else {
                     min = Math.min(Math.abs(arr[k + 1] - arr[k]), Math.abs(arr[k] - arr[k - 1]));
                 }
                 sum = sum + min;
             }

         }System.out.println(sum);

         if (p < q) {
             int partition = getPivot(arr, p, q);
//             quickSort(arr, p, partition - 1);
//             quickSort(arr, partition + 1, q);
//
         }
        return  sum;
     }
    }

