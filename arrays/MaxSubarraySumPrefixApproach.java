public class MaxSubarraySumPrefixApproach {
        public static void maxSubarraysSum(int numbers[]){
        int sum =0 ;
        int sumMax=Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length];

        prefix[0]= numbers[0];
        //calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1] + numbers[i];
        }
 
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i ; j<numbers.length;j++){
                int end = j;

                sum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
                
                if(sum>sumMax){
                    sumMax = sum;
                }
            }
        }
        System.out.println("max sum = "+ sumMax);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8};
        maxSubarraysSum(numbers);
    }
}
