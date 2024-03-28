package strings.anagrams;

/*
 * TIME COMPLEXITY : O(N + CHAR)
 * AUX SPACE : O(CHAR)
 */
public class EfficientApproach {


    public static final int CHAR = 256;

    public static void main(String args[]){
        String s1 = "silent";
        String s2 = "listen";
        System.out.println("Are both strings anagrams ?"+findAnagrams(s1, s2));
    }
    

    public static boolean findAnagrams(String s1, String s2){
        
        if(s1.length() != s2.length()){
            return false;
        }
    
        int count [] = new int[CHAR];

        for(int i=0; i<s1.length(); i++){
            ++count[s1.charAt(i)];
            --count[s2.charAt(i)];
        }

        for(int i=0 ; i<CHAR; i++){
            if(count[i]!=0){
                //not anagram
                return false;
            }
        }

        return true;
    }
}
