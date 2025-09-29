public class minFind {

    public static int binarySearch(int[] nums ,int target){

        int min = 
        for(int i=0;i<nums.length;i++){

        }

    }

    public static int binarySearch(int[] nums , int min , int max , int target){

    }

    public static int minSearch(int[] nums){
        int left =0;
        int right= nums.length-1;

        while(left<right){
            int mid = left+(right-left)/2;
            if(mid>0 && nums[mid-1]>nums[mid]){
                return mid;
            }
            else if()
        }
    }
    public static void main(String[] args) {
        
        int[] nums = {4,5,6,7,0,1,2};
        int target = 1;
    }
}
