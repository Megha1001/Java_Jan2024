import java.util.Scanner;

/*
 0! = 1
 1! = 1
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        String inputStr = inputObj.nextLine();
        System.out.println("Factorial of number is : "+findFactorialByRecursion(Integer.parseInt(inputStr)));
        System.out.println("Factorial of number is : "+findFactorialByForLoop(Integer.parseInt(inputStr)));
    }
    /*
    Auxilary Space : function call stack = O(N), Time complexity : Theta(N)
     */

    public static int findFactorialByRecursion(int input){
        // base case
        if(input == 0 || input == 1){
            return 1;
        }
        return input * findFactorialByRecursion(input - 1);
    }

    /*
    Auxilary Space : function call stack = O(1), Time complexity : Theta(N)
     */
    public static int findFactorialByForLoop(int input){
        // base case
        if(input == 0 || input == 1){
            return 1;
        }
        int result = 1;
        for(int i = input ; i > 0; --i){
            result *= i;
        }
        return result;

    }
}
