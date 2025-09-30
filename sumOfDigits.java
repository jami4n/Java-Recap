//Write a program to find the sum of digits of a number.
//Example: 123 → 1 + 2 + 3 = 6

public class sumOfDigits {

    public static void main(String[] args) {
        
        int number = 1234;
       
        System.out.println(sumOfN(number));
        System.out.println(sumOfD(number));
    

    }

    private static int sumOfN(int n){
        String num = Integer.toString(n);
        int total = 0;

        System.out.println(num);

        for(int i = 0; i < num.length(); i++){

            total = total + Character.getNumericValue(num.charAt(i));
        }

        return total;
    }

    private static int sumOfD(int d){

        int total = 0;
        int temp = d;

        while(temp > 0){
            int dig = temp % 10;
            total += dig;

            temp = temp / 10;

        } 

        return total;

    }

}
