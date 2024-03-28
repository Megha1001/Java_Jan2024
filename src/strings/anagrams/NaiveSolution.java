package strings.anagrams;


import java.util.Arrays;
/*
 * TIME COMPLEXITY : O(NLogN)
 * 
 * Approach :
 * 1. Convert to char array
 * 2. sort the array
 * 3. convert to string
 * 4. compare
 */
public class NaiveSolution {

    public static void main(String [] args){
        String s1 = "silent";
        String s2 = "listen";

        System.out.println("Are both strings anagrams ?"+findAnagrams(s1, s2));
    }

    public static boolean findAnagrams(String s1, String s2){
        
        //sorted first array
        char c1[] = s1.toCharArray();
        Arrays.sort(c1);
        s1 = new String(c1);

        char c2[] = s2.toCharArray();
        Arrays.sort(c2);
        s2 = new String(c2);
        return s1.equals(s2);
    }
    
}
