import java.util.Scanner;
public class factorial {

    public static long factorials(long n){
        long f=1;
        for(long i=1;i<=n;i++){
            f=f*i;

        }
        return f;
        
    }
    public static void main(String args[]){
        System.out.print("Enter the number you wish factorial of ");
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = factorials(a);
        System.out.print("The factorial of "+ a+ " is "+ b);
    }    
    
}
