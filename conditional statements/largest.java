import java.util.Scanner;

public class largest {
    public static void main (String args[] ){
        System.out.print("enter the number 1 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("enter the number 2 : ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a+">"+b);
        }else{
            System.out.println(b+">"+a);
        }
    }    
}
