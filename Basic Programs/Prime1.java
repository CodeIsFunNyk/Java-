import java.util.Scanner;
public class Prime1 {
static boolean valid(String str){
if (str.equalsIgnoreCase("y")){
return true;
} else {
System.out.println("Program Stopped!!");
return false;
}
}

static boolean isPrime(int num){
int counter = 0;
for (int i = 1;i <= num;i++){
if (num%i == 0){
counter++;
}
}
if (counter == 2){
System.out.println(num+" is prime number");
return true;
} else return false;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n;
String action;
boolean v;

do{
System.out.println("Enter no. of elements of array");

n = sc.nextInt();
System.out.println();
int[] nums = new int[n];
for (int i = 0;i < n;i++){
nums[i] = sc.nextInt();
}
int primes = 0;
for (int i = 0;i < n;i++){
if (isPrime(nums[i])){
primes++;
}
}
System.out.println("Total no. of primes "+primes);
System.out.println("Do you wish to start again(Y/n)");
action = sc.next();
v = valid(action);
}while (v);

}

}