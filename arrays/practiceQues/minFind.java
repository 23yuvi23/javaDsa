//leetcode ques no 33 

public class minFind {
    public static int SearchRotated(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;

        while (low<=high){
            int mid = (low+high)/2;

            if(nums[mid]== target) return mid;

            //leftsorted
            if(nums[low]<=nums[mid]){
                //array lies in sorted half
                if(nums[low]<=target && target <= nums[mid]){
                    high = mid -1;
                }
                //not lies in sorted half 
                else {
                    low = mid+1;
                }

            //rightsorted
            }else {
                //array lies in sorted half
            if(nums[mid]<=target && nums[high]>=target){
               low = mid +1 ;
            } 
            //array not lies in the sorted half 
            else {
                high = mid - 1;
            }
        }
    }
        return -1;
}  
    public static void main(String[] args) {
        
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;

        System.out.println(SearchRotated(nums, target));
    }
}
