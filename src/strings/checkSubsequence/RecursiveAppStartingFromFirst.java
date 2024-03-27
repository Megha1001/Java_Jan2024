package strings.checkSubsequence;

public class RecursiveAppStartingFromFirst {

    private static String s1 = "ABCDE";
    private static String s2 = "AED";
    private static int m = s1.length();
    private static int n = s2.length();

    public static void main(String []args){
        System.out.println("is "+s2+" is subsequence of "+s1+" ? "+checkSubsequence(s1, s2, 0, 0));
    }

    public static boolean checkSubsequence(String s1, String s2, int l1, int l2){

        if(l2==n){
            //second string travered
            return true;
        }

        if(l1==m){
            //first string vanished/travered
            return false;
        }

        if(s1.charAt(l1)==s2.charAt(l2)){
            //increment both l1 and l2
            return checkSubsequence(s1, s2, l1+1, l2+1);
        }else{
            //increment only l1
            return checkSubsequence(s1, s2, l1+1, l2);
        }

    }
}
