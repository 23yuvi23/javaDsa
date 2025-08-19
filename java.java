import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a"); 
        int a = sc.nextInt();

        System.out.println("enter the value of b");
        int b = sc.nextInt();

        System.out.println("enter the value of c");
        int c = sc.nextInt();


        double Avg = (a+b+c)/3;

        // System.out.println("the average of "+a+ "" "" +b+"" +c+ " is  ");
        System.out.printf("the average of %d, %d, %d is %f" ,a,b,c,Avg );

    }
}