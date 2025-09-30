/*Fibonacci Series
Print the first n terms of the Fibonacci sequence.
Example: 0, 1, 1, 2, 3, 5, 8...*/

public class fibonacci {
    
    public static void main(String[] args) {
        

        int num = 10;
        int temp1 = 0, temp2 = 1;
        int temp3 = 0;
        int index = 0;


        while(index < num){

            System.out.print(temp1);

            if(index != num - 1){
                System.out.print(",");
            } 

            temp3 = temp2 + temp1;
            temp1 = temp2;
            temp2 = temp3;

            index++;
        }


    }


}
