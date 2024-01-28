package mathematics.lcm;

/*
LCM : Least Common Multiple
The lowest number divisible by both the number
 */
//TIME COMPLEXITY : O(a*b - max(a,b)
public class NaiveApproach {

  public static void main(String[] args) {
    int a = 4;
    int b = 31;
    System.out.println("LCM of given number a="+a+", b="+b+" is : "+findLCM(a,b));
  }

  public static int findLCM(int a, int b){
    int result=Math.max(a,b);
    while(true){
      if(result%a==0 && result%b==0){
        break;
      }
      ++result;
    }
    return result;
  }

}
