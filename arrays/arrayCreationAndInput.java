import java.util.Scanner;


public class arrayCreationAndInput {
    public static void main(String[] args) {
        int marks[] = new int [100];
        Scanner sc = new Scanner(System.in);

        // int physics = sc.nextInt();
        //take input in array 

        marks[0] =sc.nextInt();   //phy
        marks[1]=sc.nextInt();     //math
        marks[2]=sc.nextInt();     //chem

        System.out.println( "phy:"+marks[0]);
        System.out.println("math:"+marks[1]);
        System.out.println("chem:"+marks[2]);

        //we can update in arrays 
        // marks[1] = 100;
        // System.out.println("math:"+marks[1]);

        int percentage  = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage = "+ percentage + " %");

        //to find length of an array
        System.out.println("length of arrata = "+ marks.length);
    }    
}
