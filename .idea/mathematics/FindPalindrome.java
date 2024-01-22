import java.util.Scanner;

public class FindPalindrome {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the input number : ");
        //Assuming input > 0
        String inputStr = inputObj.nextLine();
        System.out.println(inputStr + " is "+ findPalindrome(inputStr));
        System.out.println(inputStr + " is "+ findPalindromeMethod2(inputStr));
        System.out.println(inputStr + " is "+ findPalindromeMethod3(Integer.parseInt(inputStr)));
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

    //Time Complexity : O(N)
    public static String findPalindromeMethod2(String input){
        String reverse = "";
        for(int i = input.length() - 1; i >= 0; --i){
            reverse += input.charAt(i);
        }
        return (reverse.equals(input) ? "a Palindrome": "not a Palindrome");
    }

    public static String findPalindromeMethod3(int input){
        int reverse = 0;
        int temp = input;
        while(temp > 0){
            reverse = (reverse*10) + (temp%10);
            temp/=10;
        }

        return (reverse == input) ? "a Palindrome": "not a Palindrome";
    }
}
