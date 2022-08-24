import java.util.Arrays;
import java.util.Scanner;

public class NinetyDegreeRotation {
    
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter rows and cols");
        int n = sc.nextInt();
      int [][] arr  = new int [n][n]; 
      
        //calling inputArray() method
         inputArray(arr);
        //calling Transpose() method
        transpose(arr);
        //Printing the Array
        for(int i = 0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        
    }
    	//Taking user input
       static void inputArray(int[][] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]= sc.nextInt();   
            }
        }
        sc.close();
}
    		//Transposing the Array
		static void transpose(int [][] arr){
        
        for(int i = 0; i<arr.length; i++){
            for(int j = i ; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //calling reverse() method insed Transpose
        reverse(arr);
        
        }      
    		//Reversing the Array to get desired output
    static void reverse(int [][] arr){    
        for(int i=0; i<arr.length; i++){
            int start=0;
             int end = arr.length-1;
        		while(start<end){
              int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
        		}
        }        
	}
    
}