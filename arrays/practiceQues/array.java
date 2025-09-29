import java.util.*;
public class array {

    public static boolean dupliCheck(int[] nums){
        Arrays.sort(nums);
        for(int i =0 ;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }

        return false ;
    }
    public static void main(String args[]){
        // int nums[] = {1,1,2,3,4,5,6};
        int[] nums = {1,2,3,4,5};
        System.out.println("length "+ nums.length);    //5
        System.out.println(dupliCheck(nums));
    }
}
