import java.util.*;

public class billCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the price of pencil");
        float pencil = sc.nextFloat();

        System.out.println("enter the price of pen");
        float pen = sc.nextFloat();

        System.out.println("enter the price of eraser");
        float eraser= sc.nextFloat();

        System.out.printf("the value of pencil is %f \nthe value of pen is %f \nthe value of eraser is %f \n" ,pencil,pen,eraser);
        
        System.out.println("the total ofyout above bill is ");

        double totalBill = pencil+pen+eraser;

        System.out.printf("%.2f",totalBill);

        //now 18% gst calculate

        double gst = totalBill * 0.18f;  //18 % of totoal

        double finalBill =  totalBill + gst;

        System.out.println("the final bill after gst is ");

        System.out.println(finalBill);
        


        sc.close();
    }
}
