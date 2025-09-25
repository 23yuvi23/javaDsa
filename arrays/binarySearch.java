public class binarySearch {
    public static int search(int key,int num[]){
        int start = 0;
        int end = num.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(num[mid]==key){
                return mid;
            }if (num[mid]>key) {
                end = mid-1;
            } else  {
                start = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6};
        int key = 7;
        int s = search(key, num);
        System.out.println(s);

    }
    
}
