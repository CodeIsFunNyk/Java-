import java.util.Arrays;
public class Rotate {
    
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16 }
        };
        //this program rotates array by 90 degree
		//it is giving error arrayIndexOutOfBounds
		/*	for(int i=0;i<arr.length;i++){
            for(int j=arr[0]. length-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
    }*/
        int[][] brr=array(arr);
        for(int[] a:brr){
            System.out.println(Arrays.toString(a));
        }
     
        
       
    }
    static int[][] array(int[][] arr){
        int n=arr.length;
        int m=arr[0]. length;
        int[][] brr= new int[n][m];
        
        for (int i=0,a=0;i<n&&a<n;i++,a++){
            for(int j=m-1,b=0;j>=0&&b<m;j--,b++){
                brr[a][b]=arr[j][i];
            }
        }       
        return brr;
    }
}
