/*
 
syntax for function with parameter

returnType name (type parameter1 , type parameter2){
//body
return statement
}
 */

import java.util.Scanner;
public class FunctionWithParameter {

    public static int CalculateSum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        return sum;
    
}

    public static void main(String[] args) {
        CalculateSum();
    }
    
}
