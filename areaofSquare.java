import java.util.Scanner;
public class areaofSquare {
    public static void main(String[] args) {
        System.out.println("enter the side of square");
        Scanner sc = new Scanner (System.in);
        int side = sc.nextInt();

        int area = side*side;

        System.out.printf("the area of square of side %d is %d " , side , area);
    }
}
