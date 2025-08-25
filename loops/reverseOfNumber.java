public class reverseOfNumber {
    public static void main(String[] args) {
        int n = 10899;
        int lastdigit;
while(n>0){
    lastdigit = n%10;
    System.out.print(lastdigit);
    n=n/10;
    }
}

}

