package strings.patternMatching.naive;

/*
 * TIME compLEXiTY : O((n-m+1)*M) where N is length of original string and M is length pattern
 */
public class NaiveApproachBetterCode {
    public static void main(String args[]){
        String s = "AAAAA";
        String pattern = "AAA";

        System.out.println("The index where given pattern is present " );
        findPattern(s, pattern);
    }

    public static void findPattern(String s, String pattern){
        int n = s.length();
        int m = pattern.length();

        for(int i=0 ; i<=n-m; i++){ //Theta(n-m+1)
            int j;
            for(j=0; j<m; j++){ //O(M)
                if(s.charAt(j+i) != pattern.charAt(j)){
                    //j is the shift
                    break;
                }
            }

            if(j==m){
                //pattern found
                System.out.print(i+" ");
            }
        }


    }
}
