package mathematics.prime;

public class CheckPrimeNaiveApproach2 {
  public static void main(String[] args) {
    int input = 101;
    System.out.println("The enterned number "+input+" is "+checkPrime(input));
  }

  public static String checkPrime(int n){
    if(n==2 || n==3){
      return " Prime.";
    }
    if(n == 1 || n%2 == 0 || n%3 == 0){
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
