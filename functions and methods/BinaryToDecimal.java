import java .util.Scanner;

public class BinaryToDecimal {

    public static long Convert(long num){
        long lastdigit;
        long dec=0;
        long pow=0;

        do{
            lastdigit = num % 10;
            num= num/10;
            dec = dec  + lastdigit * (long)(Math.pow(2,pow));
             pow++;
        }while(num!=0);

        
       

        return dec;

    }
    public static void main(String[] args) {

        System.out.print("Enter number in binary only to  convert in decimal: ");
        Scanner sc =new Scanner (System.in);
        long num = sc.nextLong();
        System.out.print("the conversion of binary "+ num+ " is ->"+Convert(num));
        
    }    

}
