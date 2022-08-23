
public class WaveTraversal {
  public  static void spiralTraversal(int[][] arr){
        int minr=0,minc=0;
        int maxr=arr.length-1,maxc=arr[0].length-1;
        int total=arr.length*arr[0].length;
        int count=0;
        while(count<total){
            //this loop is for left wall
            for(int i=minr,j=minc;i<=maxr&& count<total;i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            //this loop is for bottom wall
            for(int i=maxr,j=minc;j<=maxc&& count<total;j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            //this loop is for right wall
            for(int i=maxr,j=maxc;i>=minr&& count<total;i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            //this loop is for top wall
            for(int i=minr,j=maxc;j>=minc&& count<total;j--){
                System.out.println(arr[i][j]);
                count++;
            } 
            minr++;
        }
    }
    
    public static void main(String[] args) {
        int[][] arr= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        spiralTraversal( arr);
    //    System.out.println(arr);
   /*    for(int i=0;i<arr[0].length;i++){
            if(i%2==0){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[j][i]);
                }}
                else{
                    for(int j=arr.length-1;j>=0;j--){
                        System.out.println(arr[j][i]);
                    }
                }
    }*/
		   }
    }
		
    
