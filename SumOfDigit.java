
public class SumOfDigit {
    
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }
    static int sum(int n){
        int ans = productOfDigits(n)- sumOfDigits(n);
        return ans;
    }
    static int sumOfDigits(int n){
        int ans=0;
        while(n!=0){
            int digit=n%10;
            n=n/10;
            ans+=digit;
        }
        return ans;
    }
    static int productOfDigits(int n){
        int ans=1;
        while(n!=0){
            int digit=n%10;
            n=n/10;
            ans*=digit;
    }
        return ans;
    
		}
}    
