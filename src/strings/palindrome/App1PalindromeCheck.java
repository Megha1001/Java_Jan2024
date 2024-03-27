package strings;

public class PalindromeCheck {
    
    public static void main(String args[]){
        String s = "AAABBBCCC";

        System.out.println("is given string palindrome ?"+isPalindrome(s));
    }

    public static boolean isPalindrome(String s){

        for(int i=0; i<(s.length())/2; i++){
            if(!(s.charAt(i)==s.charAt(s.length()-1-i))){
                return false;
            }
        }

        return true;
    }

}
