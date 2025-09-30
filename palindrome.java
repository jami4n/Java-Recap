/*
Palindrome Number
Check if a given number is a palindrome (same forwards and backwards).
Example: 121 → Palindrome, 123 → Not Palindrome
*/

public class palindrome {

    public static void main(String[] args) {
        
        int num = 121;
        int reverseNum = 0;
        int original = num;
       
        //reverse number
        while(num > 0 ){
            int dig = num % 10;
            reverseNum = reverseNum * 10 + dig;
            num /= 10;
        }
        

        if(reverseNum == original){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
        
    }
    
}
