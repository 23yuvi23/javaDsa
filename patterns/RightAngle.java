import java.util.Scanner;

public class RightAngle{
    public static void main (String[] args){
        System.out.print("enter the no of line you want ");
        Scanner sc = new Scanner (System.in);

        int a  = sc.nextInt();

        for (int i = 0 ; i<= a ; i++){
            for (int j =0;j<=i;j++  ){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}