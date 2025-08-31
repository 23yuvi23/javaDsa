import java.util.Scanner;
public class Character {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';                                  //different pattern

        for (int line = 0 ; line <= n ; line++){
            // char ch = 'A';                           //different pattern
            for (int star = 0 ; star<=line; star++){
                System.out.print(ch);
                ch++;
            }
                // ch--;                                //different pattern
            System.out.println("");
        }
    }
}
