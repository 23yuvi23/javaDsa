import java.util.*;

class Solution {
    public static int[] inputs(){
        System.out.println("enter the value of n");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        //input arrays
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        //output arrays
         for(int i =0;i<n;i++){
           System.out.print(nums[i] + " ");
        }
        return nums;
    }


    public static void sum(int nums[], int target) {
        int CurrSum = 0 ;
        int prefix[] = new int[nums.length];

        prefix[0]=nums[0];
        for(int i =1 ;i<prefix.length;i++){
            prefix[i]= prefix[i-1]+nums[i];
        }


        for (int i=0;i<nums.length;i++){
            int start = i;

        for(int j = i ; j<nums.length;j++){
            int end = j;
            CurrSum = start==0?prefix[end]:prefix[end]-prefix[start-1];

            if(CurrSum==target){
                System.out.println("nums are ");
                for(int k = start;k<=end;k++){
                    System.out.print("["+nums[k]+"]");
                }
                System.out.println();
            }
        }
    }
}

    public static void main(String[] args) {
        int[] nums=inputs();
        sum(nums,9) ;
    }
}