package strings.patternMatching.KMPAlgo;


import java.util.Arrays;
public class FindLongestCommonPrefixSuffix {
    
    public static void main(String []args){
        String s = "abab";
        System.out.println("The longes common prefix suffix length is :"+findLongestCommonPrefixSuffix(s));
    }

    public static int findLongestCommonPrefixSuffix(String s){
        int res = 0;
        int len = s.length();

        String [] pf = new String[len];

        //find all valid proper prefix
        for(int i=0; i<len; i++){
            pf[i] = s.substring(0,i);
        }

        System.out.println("Prefix array : "+Arrays.asList(pf));

        String [] sf = new String[len+1];

        //find all valid proper suffix
        for(int i=len; i>=0; i--){
            sf[i] = s.substring(i,len);
        }

        System.out.println("Prefix array : "+Arrays.asList(sf));

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
