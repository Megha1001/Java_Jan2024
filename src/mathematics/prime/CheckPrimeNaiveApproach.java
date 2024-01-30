package mathematics.prime;
/*
Prime number : A number that is divisible by 1 and itself only.
Note : 1 is not prime neither composite
 */
public class CheckPrimeNaiveApproach {

  public static void main(String[] args) {
    int input = 101;
    System.out.println("The enterned number "+input+" is "+checkPrime(input));
  }

  //TIME COMPLEXITY : O(N)
  public static String checkPrime(int input){
    for(int i = 2; i < input; i++){
      if(input%i == 0){
        return "not a prime";
      }
    }
    return input==1? "not a prime.":"Prime.";
  }
}
