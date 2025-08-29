public class floydTriangle {

    public static void pattern(int n){
        int temp =1;

        for(int i =0 ;i <= n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp++;
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
        
    }
    public static void main(String[] args) {
        pattern(4);
        
    }
    
}
