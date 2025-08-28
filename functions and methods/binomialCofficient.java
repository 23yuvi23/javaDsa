import java.util.Scanner;
public class binomialCofficient {

    public static int factorials(int n){
        int f=1;
        for (int i =1 ;i <=n;i++){
            f*=i;
        }
        return f;
    }

    public static int binomialCalculate(int n,int r){
        int nFactorial = factorials(n);
        int rFactorial = factorials(r);
        int nmrFactorial = factorials(n-r);

        int nCr = nFactorial/ (rFactorial*nmrFactorial);
        return nCr;
    }

    public static void main(String[] args) {
        System.out.print("Enter the value of n-> ");
        Scanner sc = new Scanner(System.in);
        int factn = sc.nextInt();
        // factorials(factn);

        System.out.print("Enter the value of r-> ");
        int nCrkaR = sc.nextInt();

        int finalnCr = binomialCalculate(factn, nCrkaR);
        System.out.print("the Binomial cofficient of "+factn+" , "+nCrkaR+" is-> "+finalnCr );
    }
}
