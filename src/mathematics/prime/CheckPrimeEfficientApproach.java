package mathematics.prime;
/*
Idea : Divisors always appears in pairs

30 : (1,30), (2,15), (3,10),(5,6)
65 : (1,65), (5,13)
25 : (1,25), (5,5)

If (x,y) is a pair
    x * y = n
and x <= y
  x * x <=n
  x <= Sqrt(n)
  
  TIME COMPLEXITY : O(sqrt(N))
 */
public class CheckPrimeEfficientApproach {

  public static void main(String[] args) {
    int input = 101;
    System.out.println("The enterned number "+input+" is "+checkPrime(input));
  }

  public static String checkPrime(int n){
    if(n == 1){
      return " not a Prime.";
    }
    for(int i=2; i <=Math.sqrt(n); i++){
      if(n%i ==0){
        return " not a Prime.";
      }
    }
    return " Prime.";
  }
}
