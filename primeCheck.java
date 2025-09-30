

public class primeCheck {

    public static void main(String[] args) {
    
        int num = 13;

        Boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }else{

            for(int i = 2; i * i <= num ;i++){

                if(num % i == 0){
                    isPrime = false;
                    break;
                }

            }

        }



        if(isPrime){
            System.out.println("Number is a Prime Number");
        }else{
            System.out.println("Number is not a Prime Number");
        }

    }
    
}
