import java.util.Scanner;
public class evenOddIntegerSum {

  

    public static void main(String[] args) {

    int choice;
    int Evensum=0;
    int Oddsum=0;

    do{
        System.out.print("enter the number you wanna store: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number%2==0){
            Evensum +=number;
        }else{
            Oddsum +=number;
        }

         System.out.print("press 1 to continue press any other number to exit:");   
         choice = sc.nextInt();    
            
        } while (choice==1);

        
        System.out.println("");
        System.out.print("the sum of entered even number is : "+Evensum);
        System.out.println("");
        System.out.print(" the sum of entered odd number is : "+Oddsum);
    }

    }

