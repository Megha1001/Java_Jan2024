package mathematics.trailingZeroes;

import java.util.Scanner;

public class TrailingZeroesEffectiveApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int num = Integer.parseInt(sc.nextLine());
    System.out.println("Trailing zeroes in given num "+num+" is : "+countTrailingZeroes(num));
  }

  /*
  Approach :
  1. Wrote the prime factorization of num : 1*2*3*4*5* ....... *num
  2 . Calculate the pair of (2,5)
  3. The num 5 would be less as compare to 2.
  4. Count the number of 5's
      Note : There would be numbers like 25, 125 etc where we have to consider all 5.
   5. Formula : floor(n/5) + floor(n/25) + floor(n/125) + .... + 0.

   TIME COMPLEXITY : log(N) with base 5
   */
  public static int countTrailingZeroes(int num){
    int result = 0;
    for (int i = 5; i <=num; i=i*5){
      result = result + num/i;// floor(n/5) + floor(n/25) + floor(n/125)
    }
    return result;
  }

}
