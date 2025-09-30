/*
Largest of Three Numbers
Write a program to find the largest among three numbers without using built-in functions.
*/

public class largestOfThree {
    public static void main(String[] args) {
        
        int a=1, b=2, c=3;
        int largest;

        if(a >= b && a >=c){
            largest = a;
        }else if(b >= a && b >= c){
            largest = b;
        }else{
            largest = c;
        }

        System.out.println("Largest number is " + largest);
         
    }
}
