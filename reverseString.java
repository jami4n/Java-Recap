//Input a string and print its reverse. (e.g., "hello" → "olleh")

public class reverseString {
    
    public static void main(String[] args) {

        String input = "Hello World";
    
        String reved = revStr(input);
        System.out.println("" + reved);

        String strb = new StringBuilder(input).reverse().toString();
        System.out.println("" + strb);
    
    }


    private static String revStr(String s){

        StringBuilder sb = new StringBuilder();

        for(int i = s.length() - 1 ; i >= 0; i--){
            sb.append(
                s.charAt(i)
            );
        }

        return sb.toString();
    }
}
