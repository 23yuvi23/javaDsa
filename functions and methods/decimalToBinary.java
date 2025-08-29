public class decimalToBinary {

    public static long convert(long num){
        long rem;
        long bin = 0 ;
        long p = 0;

        while(num>0){
            rem = num %2;
            bin = bin + rem * (long) (Math.pow(10,p));
            p++;
            num = num/2;
        }
        return bin;
    }
    public static void main(String[] args) {
        System.out.print(convert(90));
    }    
}
