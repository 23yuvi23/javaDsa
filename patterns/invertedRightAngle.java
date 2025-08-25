// package patterns;

import java.util.Scanner;

public class invertedRightAngle {
    public static void main (String[] args ){

        System.out.print("enter the no of line you want ");
        Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();

        for (int line=0 ;  line<=n ;  line++){
            for (int star=1; star<=(n- line+1); star++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
