package analysisOfAlgo;

import java.util.Scanner;

public class SumNNaturalNumbers {
    public static void main(String []args){
        try (Scanner inputObj = new Scanner(System.in)) {
            System.out.println("Enter input");
            int input = Integer.parseInt(inputObj.nextLine());
            System.out.println("Sum of N natural numbers using for loop : "+sumOfNNaturalNumbersUsingForLoop(input));
            System.out.println("Sum of N natural numbers using two for loop : "+sumOfNNaturalNumbersUsingTwoForLoop(input));
            System.out.println("Sum of N natural numbers using Formula : "+sumOfNNaturalNumbersUsingFormula(input));
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Time Complexity :- O(n)
    public static int sumOfNNaturalNumbersUsingForLoop(int input){
        int result = 0;
        for (int i=1; i<=input; i++){
            result += i;
        }
        return result;
    }

    // Time Complexity :- O(n*n)
    public static int sumOfNNaturalNumbersUsingTwoForLoop(int input){
        int result = 0;
        for (int i=1; i<=input; i++){
            for(int j = 1; j<=i; j++){
                result += j;
            }
        }
        return result;
    }

    // Time Complexity :- O(1)
    public static int sumOfNNaturalNumbersUsingFormula(int input){
        return input*(input+1)/2;
    }

}