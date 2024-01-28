package mathematics.lcm;

/*
 a*b = gcd(a,b) * lcm(a,b)
 Time Complexity : O(log(min(a,b))
 */
public class EuclideanAlgo {

  public static void main(String[] args) {
    int a = 4;
    int b = 31;
    System.out.println("LCM of given number a="+a+", b="+b+" is : "+findLCM(a,b));
  }

  public static int findLCM(int a, int b){
    return (a*b)/findGCD(a,b);
  }

  public static int findGCD(int a, int b){
    if(b == 0){
      return a;
    }
    return findGCD(b, a%b);
  }
}
