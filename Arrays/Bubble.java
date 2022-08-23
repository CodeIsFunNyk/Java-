
public class Bubble {
    
    public static void main(String[] args) {
        int[] arr = {4,5,7,2,0,8,1};
        
        sort(arr);
        
        }
       
       
    
   
    static void  sort(int[] nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(nums[j-1]<nums[j]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i =0;i<n;i++){
            System.out.println(nums[i]);
                
            }
               
    }

}