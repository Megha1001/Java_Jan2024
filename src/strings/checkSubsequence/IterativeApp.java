package strings.checkSubsequence;

public class IterativeApp {

    public static void main(String [] args){
        String s1 = "ABCDE";
        String s2 = "ADE";

        System.out.println("is "+s2+" is subsequence of "+s1+" ? "+checkSubsequence(s1, s2, s1.length(), s2.length()));
    }
    

    public static boolean checkSubsequence(String s1, String s2, int l1, int l2){
        //pointer to s2
        int j=0;

        //pointer to s1 ->i
        for(int i=0; i<l1; i++){
            if(s1.charAt(i) == s2.charAt(j)){
                ++j;
            }
        }
        return j==l2;
    }
}
