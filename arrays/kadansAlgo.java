public class kadansAlgo{

    public static void kadanes(int numbers[]) {
        int CurrSum = 0 ;
        int MaxSum = Integer.MIN_VALUE;

        for(int i =0 ; i< numbers.length;i++){
            CurrSum = CurrSum + numbers[i];


                if(CurrSum<0){
                    CurrSum=0;
                } 
                MaxSum = Math.max(CurrSum,MaxSum);
            }

            // agar MaxSum 0 aaya aur array me saare negative hain
            if(MaxSum == 0 ){
                 // find the largest negative number
                MaxSum = numbers[0];
                for(int i =1;i<numbers.length ; i++){
                    MaxSum=Math.max(MaxSum,numbers[i]); 
                }
            }
            System.out.println("our max subarray sum is "+ MaxSum);
        }

    
    public static void main(String[] args) {
        int numbers[]= {-2,-3,4,-1,-2,1,5,-3};
        // int numbers[] = {-2, -3, -4, -1, -7};        // output -1 (largest negative)
        kadanes(numbers);
    }
    
}
