package strings.leftmostRepeatingElement;

/*
 * TIME COMPLEXITY : O(N)
 */
public class EfficientApproach {

    public static final int CHAR = 256;
    public static void main(String args[]){
        String s = "meghaverma"; //m

        System.out.println("The index of leftmost repeating element is :"+findLeftMostRepeatingElement(s));
    }

    public static int findLeftMostRepeatingElement(String s){
        int count[] = new int[CHAR];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)]++;
        }
        
        for(int i=0; i<s.length(); i++){
            if(count[s.charAt(i)] >1){
                return i;
            }
        }

        return -1;
    }

}
