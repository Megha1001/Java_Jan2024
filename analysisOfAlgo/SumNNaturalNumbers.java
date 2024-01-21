import java.util.Scanner;

public class SumNNaturalNumbers {
    public static void main(String []args){
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter input");
        int input = Integer.parseInt(inputObj.nextLine());
        System.out.println("Sum of N natural numbers using for loop : "+sumOfNNaturalNumbersUsingForLoop(input));
        System.out.println("Sum of N natural numbers using two for loop : "+sumOfNNaturalNumbersUsingTwoForLoop(input));
        System.out.println("Sum of N natural numbers using Formula : "+sumOfNNaturalNumbersUsingFormula(input));
    }

    public static int sumOfNNaturalNumbersUsingForLoop(int input){
        int result = 0;
        for (int i=1; i<=input; i++){
            result += i;
        }
        return result;
    }

    public static int sumOfNNaturalNumbersUsingTwoForLoop(int input){
        int result = 0;
        for (int i=1; i<=input; i++){
            for(int j = 1; j<=i; j++){
                result += j;
            }
        }
        return result;
    }

    public static int sumOfNNaturalNumbersUsingFormula(int input){
        return input*(input+1)/2;
    }

}
