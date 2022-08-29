
public class ExitPoint {
    
    public static void main(String[] args) {
        int[][] arr = {
            {0,0,1,0},
            {1,0,0,1},
            {1,0,1,0},
            {0,0,0,1}
        };
        travelling(arr);
  }
  
    static void travelling(int[][] arr){
    int dir=0;
        int i=0;
        int j=0;
        while(true){
            dir=(dir+arr[i][j])%4;
            //Moving in East direction👉👉;
            if(dir==0){
                j++;
            }
            //Moving in North direction👇👇;
            else if(dir==1){
                i++;
            }
            //Moving in West direction👈👈;
            else if(dir==2){
                j--;
            }
            //Moving in South direction🖕🖕;
            else if(dir==3){
                i--;
            }
            // Breaking out of loop🔄 to print the exit values.
            if(i<0){
                i++;
                break;
            }
            if(j<0){
                j++;
                break;
            }
            if(i>arr.length-1){
                i--;
                break;
            }
            if(j>arr[0].length-1){
                j--;
                break;
            }            
        }
        //Printing the exit points🥴🥴
        System.out.println("Exit points are: "+i +","+j);
}
}

