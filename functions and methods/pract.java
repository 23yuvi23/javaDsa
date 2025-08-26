import java.util.Scanner;

public class pract {

    int CalculateSum(){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum is "+ sum);
        return sum;
    }
    public static void main (String args[]){
        pract obj = new pract();
        obj.CalculateSum();

        // CalculateSum();

    }

    
}
