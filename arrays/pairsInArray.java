//time complexity = O(n^2)
public class pairsInArray {

    public static void pair(int numbers[]){
        int totalPairs = 0 ;
        for(int i =0 ;i<numbers.length ;i++){
            int curr = numbers[i]; //1,2,3,4,5
                for(int j =i+1 ;j<numbers.length;j++){
                    System.out.print("("+curr+","+numbers[j]+")");
                    totalPairs++;
                }
                System.out.println();
                

        }
        System.out.print("total pairs = "+totalPairs);

    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        pair(numbers);
    }
}
