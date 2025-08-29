public class diamond {

    public static void pattern(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.err.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.err.print("*");
            }

            System.err.println();
        }
        for(int i =n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.err.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.err.print("*");
            }

            System.err.println();
        }

    }
    public static void main(String[] args) {
        pattern(3);
        
    }
    
}
