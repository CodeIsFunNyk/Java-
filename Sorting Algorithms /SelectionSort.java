
import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args) {
         int[] arr = {5,3,1,7,2,9,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int n=arr. length-1;
        for(int i=0;i<=n;i++){
            int end = n-i;
            int max = search(arr,end);
            swap(arr,max,end);
        }
    }
    static void swap(int[] arr, int max, int end){
        int temp = arr[max];
        arr[max]=arr[end];
        arr[end]=temp;
    }
        static int search(int[] arr, int end){
            int max=0;
            for(int i=1 ; i<=end; i++){
                
                if(arr[max]<arr[i]){
                    max=i;
                }
            }
        			return max;
        }
}

