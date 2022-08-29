
public class Saddle_Point {
    
    public static void main(String[] args) {
       int [][] arr = new int[][]{
            {10,9,5,8,3},
            {40,23,15,20,11},
            {13,18,7,16,8},
            {24,31,25,14,2}
        };
        saddleSearch(arr);
    }
    static void saddleSearch(int[][] arr){
        //Searching for minimum value in rows➡️➡️
        //Loop will run (n-1) times length of the arr.
        for(int i=0;i<arr.length;i++){
            int minVal=0;
            for(int j=1; j<arr[0]. length; j++){
                //Searching in every row➡️➡️
                if(arr[i][minVal]>arr[i][j]){
                    //Updating the minVal if any smaller element is found
                    minVal=j;
                }
            }
            		//Boolean contion for breaking out of loop🔄🔄
            		//After finding the smallest element of row😎😎
					//Searching through columns if any element is greater😁😁
                boolean flag = true;
            		//Searching through columns⬇️⬇️⬇️
                for(int k=0;k<arr.length;k++){
                    if(arr[k][minVal]>arr[i][minVal]){
                    //if the statement is found true😞😞 which is very sad after all these efforts
						//flag🚩🚩 will turn false and loop will break
						//Now the control will go to outer loop again and things will start over.
                        flag=false;
                        break;
                    }
                }
            			//😁😁😌
            			//If you have reached here means that you made it.
            			//😎😎😎 Greatest and bravest number has been found.
                		if(flag==true){
                    System.out.println(arr[i][minVal]);
                    return;
                }
            }
        }
    }
