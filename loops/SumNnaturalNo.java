import java.util.Scanner;
public class SumNnaturalNo{
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        System.out.print("enter the value of n ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        while(i<=n){
            sum += i;
            i++ ;
        }
        System.out.print("your sum is: "+ sum );
    }
   
}