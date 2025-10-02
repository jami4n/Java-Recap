
/*Question: Swap two numbers without a temporary variable.*/


public class swapNumbers {
    public static void main(String[] args) {
        
        int a = 11;
        int b = 211;

        System.out.println("Value of a is " + a + " and b is " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("Value of a is now " + a + " and b is now " + b);

    }
}
