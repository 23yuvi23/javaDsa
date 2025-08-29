public class invertedPyramid {
    public static void invertedPattern(int n){

    // int temp =1;
        for (int i =1 ; i<=n;i++){
            for (int j = 1;j<=n-i+1;j++){
                System.out.print(j+" ");
                // temp++;
            }
            // temp =1;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedPattern(5);
       
    }
    
}
