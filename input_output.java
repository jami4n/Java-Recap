
//Write a program that takes an integer as input and checks whether it is even or odd.

import java.util.Scanner;

public class input_output {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
    

        System.out.println("Enter a number");

        int num = sc.nextInt();
        sc.close(); 
        if(num%2 == 0){
            System.out.println(num + " is Even");
        }else{
            System.out.println(num + " is Odd");
        }
    }
}
