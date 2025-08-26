/*
 syntax of function
 returntype name(){
//body
return statement; 
}

jin function ko hum class ke andar likhnte hai vo un class ke methods ho jate hai 
 */


public class first{

    void printHelloWorld(){
        System.out.println("heloo from non-static function mai object se hi call hunga");
    }

    static void printAgain(){
        System.out.println("i am function2 and i am static merko bina obj banaye bhi call kr sakte ho");
    }
    public static void main (String args[]){

        first obj = new first();
        obj.printHelloWorld();  // non static function called with the help of object

        printAgain();           //static function called with the help of direct function()
        
    }
 }\\