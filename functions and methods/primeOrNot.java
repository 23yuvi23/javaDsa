

public class primeOrNot {

    public static boolean  isprime(int num){
      for (int i=2;i<=Math.sqrt(num);i++){
        if(num==2){
            return true;
        }
       if(num%i==0){
        return false;
       }
      }
      return true;
    }

    public static void allFactorialNumbers(int n){
        for(int  i =0;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+ " " );
    }
}
    }
   
    public static void main(String[] args) {
        // int  i = isprime (23);
        allFactorialNumbers(23);

        
    }
    
}
