package strings.checkSubsequence;

public class RecursiveAppStartingFromLast {

    public static void main(String []args){

        String s1 = "ABCDE";
        String s2 = "ADE";
        int m = s1.length();
        int n = s2.length();
        System.out.println("is "+s2+" is subsequence of "+s1+" ? "+checkSubsequence(s1, s2, m-1, n-1));
    }

    public static boolean checkSubsequence(String s1, String s2, int l1, int l2){

        if(l2==0){
            //second string travered
            return true;
        }

        if(l1==0){
            //first string vanished/travered
            return false;
        }

        if(s1.charAt(l1)==s2.charAt(l2)){
            //increment both l1 and l2
            return checkSubsequence(s1, s2, l1-1, l2-1);
        }else{
            //increment only l1
            return checkSubsequence(s1, s2, l1-1, l2);
        }

    }
}
