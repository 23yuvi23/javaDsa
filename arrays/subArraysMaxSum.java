public class subArraysMaxSum {
    public static void maxSubarraysSum(int numbers[]){
        int sum =0 ;
        int sumMax=Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i ; j<numbers.length;j++){
                int end = j;
                sum =0;
                for(int k=start;k<=end;k++){             
                    //subarray sum
                    sum = sum + numbers[k];  
                }
                System.out.println(sum);
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
