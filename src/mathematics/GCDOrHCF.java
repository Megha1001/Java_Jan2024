package mathematics.gcd;

import java.util.Scanner;

public class GCDOrHCF {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number :");
    int m = Integer.parseInt(sc.nextLine());
    System.out.println("Enter second number :");
    int n = Integer.parseInt(sc.nextLine());
    System.out.println("GCD or HCF of given number is "+findGCDOrHCF(m, n));
  }

  /*
  TIME COMPLEXITY : O(m) , iff m < n
                    O(n) , iff n < m
   */
  public static int findGCDOrHCF(int m, int n){
    int result = 1;
    //base case
    if(m%n == 0){
      return n;
    }
    if(n%m == 0){
      return m;
    }

    if(m < n){
      for(int i = m; i >0 ; i--){
        if(m%i==0 && n%i==0){
          result = i;
          continue;
        }
      }
    }else{  //m > n
      for(int i = n; i >0 ; i--){
        if(m%i==0 && n%i==0){
          result = i;
          continue;
        }
      }
    }
    return result;
  }

}
