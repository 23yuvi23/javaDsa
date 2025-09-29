public class array2 {
    public static boolean dupliCheck(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        return true;
                    }
            }
        }

        return false ;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,1,4};
        
        System.out.println(dupliCheck(nums));
    }
}
