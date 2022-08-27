import java.util.Scanner;
public class Binary {
    static int anyBase2Dec(int num, int base){
      int result = 0;
      int power=1;
      while(num>0){
        int digit = num%10;
        num/=10;
        result = result+(digit*power);
        power*=base;
        
      }
      return result;
    }
    static int dec2AnyBase(int num, int base){
      int result = 0;
      int power=1;
      while(num>0){
        int digit = num%base;
        num/=base;
        result = result+(digit*power);
        power*=10;
       
      }
      return result;
    }
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your number");
      int num = sc.nextInt();
      System.out.println("Enter your Base1");
      int base1 = sc.nextInt();
      System.out.println("Enter your Base2");
      int base2 = sc.nextInt();
      int temp;
      
      temp=anyBase2Dec(num,base1);
      System.out.println(temp);
      int temp2=dec2AnyBase(temp,base2);
        System.out.println(temp2);
    }
    
}
