package strings.patternMatching.naive;
/*
 * ASSUMPTION : WHEN ALL CHARS IN PATTERN IS DISTINCT
 * TIME COMPLEXITY : THETA(N)
 * if we do M iterations inside we are saving iterations of outside
 * 
 * 
 * AUX SPACE : O(1)
 */
public class NaiveApproachOptimized {

    public static void main(String args[]){
        String s = "ABCABCD";
        String pattern = "ABCD";

        System.out.println("The index where given pattern is present " );
        findPattern(s, pattern);
    }

    public static void findPattern(String s, String pattern){
        int n = s.length();
        int m = pattern.length();

        for(int i=0; i<=n-m; ){
            int j;
            for(j=0 ; j<m; j++){
                if(s.charAt(i+j) != pattern.charAt(j)){
                    break;
                }
            }

            if(j==m){
                System.out.print(i+" ");
            }


            //optimization code
            if(j==0){
                //nothing matched
                ++i;
            }else {
                // some of the characters matched that j knows
                i = i+j; //since pattern is distinct hence we can jump by j
            }
        }
    }
    
}
