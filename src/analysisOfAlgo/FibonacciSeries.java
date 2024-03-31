package analysisOfAlgo;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        try (Scanner inputObj = new Scanner(System.in)) {
            System.out.println("Enter input");
            int input = Integer.parseInt(inputObj.nextLine());
            System.out.println("Fibonacci number at position "+input+" is "+ calFibonacciThroughRecursion(input));
            System.out.println("Fibonacci number at position "+input+" is "+ calFibonacciUsingLoop(input));
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Space complexity : Theta(N), Auxilary Space : Theta(N)
    public static int calFibonacciThroughRecursion(int input){
        if(input == 0 || input == 1){
            return input;
        }
        return calFibonacciThroughRecursion(input - 1)+calFibonacciThroughRecursion(input-2);
    }

    // Space complexity : Theta(N), Auxilary Space : Theta(1) --> SAVING SPACE
    public static int calFibonacciUsingLoop(int input){
        if(input == 0 || input == 1){
            return input;
        }
        int a = 0, b = 1, c=0;
        for(int i = 2; i <= input; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}

/*
Enter input
3
Fibonacci number at position 3 is 2
Fibonacci number at position 3 is 2
 */