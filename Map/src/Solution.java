import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("tell you");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long arraySize = scanner.nextInt();
       
        BigInteger bigInteger=BigInteger.valueOf(1);
        
     bigInteger= bigInteger.multiply(BigInteger.valueOf(5));
        
       System.out.println(bigInteger.multiply(bigInteger));
      
        
    }
}