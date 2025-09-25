import java.util.*;


public class largestNumber {
    public static int large(){
    int largest = Integer.MIN_VALUE;                                                                                 //-Infinity
     
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];

        System.out.print("Eneter the value of array");
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();          
        }

        System.out.print("the value of array:");
        for(int i =0 ;i<n;i++){
            System.out.println(arr[i]+" ");      
            
            if(arr[i]>largest){
                largest = arr[i];
            }

            
        }
        return largest;

}
    public static void main(String[] args) {
        int l = large();
        System.out.println(":Largest is "+ l );
    } 
}
