import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        System.out.print("enter the no of line you want ");
        Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         int counter = 1;

         for (int line =0 ; line <=n ; line++){

            for (int star = 0 ; star <= line ;star ++){
                System.out.print(counter);
                counter++;
            }
            counter = 1 ;
            System.out.println("");
         }
    }
}
