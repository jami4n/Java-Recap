//Calculate the factorial of a number using both for loop and recursion.

import java.util.Scanner;

public class factorial {
  
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        int num = sc.nextInt();
        sc.close();


        long facto = recFactorial(num);
        System.out.println("Factorial with Recursion - " + facto);


        facto = forFactorial(num);
        System.out.println("Factorial with For Loop - " + facto);


    }

    private static long forFactorial(int n){

       long numb = 1;

       for(int i = 1; i <= n; i++){
           numb = numb * i;
       }

       return numb;

    }




    private static long recFactorial(int num) {

        if(num == 0 || num == 1){
            return 1;
        }else{
            return num * recFactorial(num - 1);
        }

    }
    
}
