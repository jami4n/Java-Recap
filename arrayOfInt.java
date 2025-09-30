import java.util.Scanner;

/*
Write a program to take an array of integers and print the sum of all elements.
*/

public class arrayOfInt {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " numbers");
        for(int i = 0; i < size ;i++){

            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("The sum of array is " + sum);



        sc.close();



    }

    
}
