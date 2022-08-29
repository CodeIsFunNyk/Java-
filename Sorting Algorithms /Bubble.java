
import java.util.Arrays;

public class Bubble {
    
    public static void main(String[] args) {
        int[] arr = {4,5,7,2,0,8,1};        
        sort(arr); 
        display(arr);
        }
    static void display(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] nums, int i, int j){
      				   int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
    }
    static void  sort(int[] nums){
        boolean isSorted;
        int n = nums.length;
        for(int i=0;i<n;i++){
            isSorted= false;
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j]){
                    swap(nums,i,j);
                    isSorted=true;
                }
            }
            if(isSorted!=true)
                break;
        			}             
        	}              
    }