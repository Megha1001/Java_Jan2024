package strings.leftmostNonRepeatingChar;

/*
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(CHAR)
 */
import java.util.Arrays;

public class EfficientApproach2 {

    public static final int CHAR = 256;
    public static void main(String args[]){
        String s = "meghaverma"; //g

        System.out.println("The index of leftmost non repeating char is "+findLeftMostNonRepeatingElement(s));
    }


    public static int findLeftMostNonRepeatingElement(String s){
        int firstIndex[] = new int[CHAR];
        Arrays.fill(firstIndex, -1);

        //contruct non repeating firstIndex array with value of non repeating as there index non encountered as -1 and repeating as -2
        for(int i=0; i<s.length(); i++){
            if(firstIndex[s.charAt(i)] == -1){
                //first occurrence
                firstIndex[s.charAt(i)] = i;
            }else{
                //repeating 
                firstIndex[s.charAt(i)] = -2;
            }
        }


        //traverse through CHAR
        int res = Integer.MAX_VALUE;
        for(int i=0; i<CHAR; i++){
            if(firstIndex[i]>0){
                //first occurrence
                res = Math.min(res, firstIndex[i]);
            }
        }


        return res;
    }
}
