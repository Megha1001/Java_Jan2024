package mathematics.gcd;

import java.util.Scanner;

/*
Euclidiean algorithm
  Let 'b' be smaller than 'a'
    gcd(a,b) = gcd(a-b,b)

  Why ?
    Let 'g' be GCD of 'a' and 'b'
      a=gx, b=gx, and GCD(x,y) = 1
      (a-b) = g(x-y)
      Now we have to show that gcd((a-b), b) = g
      (a-b) = g(x-y) --> would not be having any more comman factor otherwise it'll contradict with GCD(x,y) = 1
      Hence, gcd((a-b), b) = g

 */
public class EuclidienAlgo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number :");
    int m = Integer.parseInt(sc.nextLine());
    System.out.println("Enter second number :");
    int n = Integer.parseInt(sc.nextLine());
    System.out.println("GCD or HCF of given number is "+findGCDOrHCF(m, n));
    System.out.println("GCD or HCF of given number is "+findGCDOrHCFOptimizedApproach(m, n));
  }

  //Time Complexity : O(min(a,b))
  public static int findGCDOrHCF(int m, int n){
      while(m != n){
        if(m > n){
          m = m-n;
        }else{
          n = n-m;
        }
      }
      return m;
  }

  /*
  In this approach, instead of repeatedly subtracting the numbers till both become equal,
  we can check if one number is a factor of the other.
   Time Complexity : O(min(a,b))
   */
  public static int findGCDOrHCFOptimizedApproach(int m, int n){
      if(n == 0){
        return m;
      }
      return findGCDOrHCFOptimizedApproach(n, m%n);

  }

}
