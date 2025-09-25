import java.util.*;
public class linearSearch {

    public static int linear(){
        System.out.print("Enter the size of array ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();     //-infinity
        int arr[]=new int[n];
        

        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
            
        }
        
        System.out.println("You entered:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Enter the value you wish to search:");
        int key = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(key==arr[i]){
                return i;
        }
    }
      return -1;
}
    
    public static void main(String[] args) {
        int index = linear();
        if(index==-1){
            System.out.println("NOT FOUND");

        }
        else{
            System.out.println("found at index " + index);
        }
    }
}
