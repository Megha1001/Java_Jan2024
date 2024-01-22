import java.util.Scanner;

public class FindPalindrome {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the input number : ");
        //Assuming input > 0
        String inputStr = inputObj.nextLine();
        System.out.println(inputStr + " is "+ findPalindrome(inputStr));
    }

    /*
    In the worst case it will go this half of the length
    Time Complexity : O(N)
     */
    public static String findPalindrome(String input){
        for(int i = 0; i < input.length()/2; i++){
            if(input.charAt(i) == input.charAt(input.length() - 1 - i)){
                continue;
            }
            return "not a Palindrome";
        }
        return "a Palindrome";
    }
}
