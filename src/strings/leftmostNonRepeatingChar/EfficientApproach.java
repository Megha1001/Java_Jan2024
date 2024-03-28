package strings.leftmostNonRepeatingChar;

/*
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(CHAR)
 */
public class EfficientApproach {

    public static final int CHAR = 256;
    public static void main(String args[]){
        String s = "meghaverma"; //g

        System.out.println("The index of leftmost non repeating char is "+findLeftMostNonRepeatingElement(s));
    }


    public static int findLeftMostNonRepeatingElement(String s){
        
        int count [] = new int[CHAR];

        for(int i=0; i<s.length(); i++){
            ++count[s.charAt(i)];
        }

        for(int i=0; i<s.length(); i++){
            if(count[s.charAt(i)]==1){
                //non repeating element
                return i;
            }
        }

        return -1;
    }
}
