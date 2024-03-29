package strings.patternMatching.KMPAlgo;


import java.util.Arrays;
public class FindLongestCommonPrefixSuffix {
    
    public static void main(String []args){
        String s = "ababc";

        Integer lps[] = new Integer[s.length()];
        for(int i=0; i<s.length();i++){
            lps[i] = findLongestCommonPrefixSuffix(s,i+1);
        }
        System.out.println(Arrays.asList(lps));
    }

    public static int findLongestCommonPrefixSuffix(String s, int len){
        int res = 0;

        String [] pf = new String[len];

        //find all valid proper prefix
        for(int i=0; i<len; i++){
            pf[i] = s.substring(0,i);
        }
        System.out.println(Arrays.asList(pf));

        String [] sf = new String[len+1];

        //find all valid proper suffix
        for(int i=len; i>=0; i--){
            sf[i] = s.substring(i,len);
        }

        System.out.println(Arrays.asList(sf));

        //find common maximum longest proper prefix suffix
        for(int i=0; i<pf.length;i++){
            for(int j=0; j<sf.length; j++){
                if(pf[i].equals(sf[j])){
                    res = pf[i].length() >res ? pf[i].length() : res;
                }
            }
        }


        return res;
    }

}
