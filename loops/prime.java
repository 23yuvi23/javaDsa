import java.util.Scanner;

public class prime {
    public static void main(String args[]){
        System.out.print("enter the number you wanna check prime or not");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 2 ; i < a+1; i++){
            if(a%i==0){
                System.out.println("composite number");
                break;
            }else{
                System.out.println("Prime number");
                break;
            }
        }
    }
}
