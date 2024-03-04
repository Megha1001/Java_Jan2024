package recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        String input = "43211234";
        System.out.println("is the given number "+input+" is palindrome ?"+isPalindrome(input, 0, input.length()-1));
    }

    public static boolean isPalindrome(String str, int start, int end){
        //base
        if(start >= end){
            return true;
        }
        return (str.charAt(start)==str.charAt(end)) && (isPalindrome(str, start+1, end-1));
    }
}
