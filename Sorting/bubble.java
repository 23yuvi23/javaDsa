public class bubble {

    public static void search(int[] nums){
        int n = nums.length;
        for(int i =0;i<n-1;i++){
            for (int j = 0;j<n-i-1;j++){
                if(nums [j]>nums[j+1]){
                    int temp;
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] nums={2,3,5,1,7,0};
        search(nums);
        printArray(nums);

    }
}
