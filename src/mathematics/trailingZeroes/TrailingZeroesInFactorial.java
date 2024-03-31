package mathematics.trailingZeroes;

import java.util.Scanner;
/*
  n>0
 */
public class TrailingZeroesInFactorial {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the number :");
      int num = Integer.parseInt(sc.nextLine());
      System.out.println("Trailing zeroes in factorial of "+num+" is "+countTrailingZeroes(num));
    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  // Have problem of overflow
  public static int countTrailingZeroes(int num){
    int factorial = findFactorial(num);
    System.out.println(factorial);
    int result = 0;
    while(factorial%10==0 && factorial > 0){
      ++result;
      factorial /= 10;
    }
    return result;
  }

  public static int findFactorial(int num){
    int result = 1;
    for(int i = 2; i <= num; i++){
      result = result*i;
    }
    return result;
  }

}
