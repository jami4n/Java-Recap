/*
Count Vowels in a String
*/


public class vowels {
    public static void main(String[] args) {
        
        String text = "Lorem Ipsum";
        text = text.toLowerCase();
        int count = 0;



        for(int i = 0; i < text.length(); i++){

            if(text.charAt(i) == 'a' || 
            text.charAt(i) == 'e' || 
            text.charAt(i) == 'i' || 
            text.charAt(i) == 'o' || 
            text.charAt(i) == 'u'){
                
                count++;

            }    
        }

        System.out.println("There are " + count + " vowels");



    }
}
