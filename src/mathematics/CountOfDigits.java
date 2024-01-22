package mathematics;

import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the number please :");
        String inputString = inputObj.nextLine();
        System.out.println("Count of digits the number is : "+countOfDigits(getInputNumber(inputString)));
    }

    private static int getInputNumber(String inputString) {
        return inputString.length()>0 ? Integer.parseInt(inputString) : 0;
    }

    // Time complexity : Theta(length_of_input)
    public static int countOfDigits(int number){
        int result = 0;
        while(number>0){
            result ++;
            number /= 10;
        }
        return result;
    }
}
