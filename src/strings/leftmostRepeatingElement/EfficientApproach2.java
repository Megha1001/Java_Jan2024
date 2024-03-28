package strings.leftmostRepeatingElement;

/*
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(CHAR)
 * 1-traversal
 */
public class EfficientApproach2 {

    public static final int CHAR = 256;
    public static void main(String args[]){
        String s = "meghaverma"; //m

        System.out.println("The index of leftmost repeating element is :"+findLeftMostRepeatingElement(s));
    }

    public static int findLeftMostRepeatingElement(String s){
        int res = -1;
        boolean visited[] = new boolean[CHAR];

        for(int i=s.length()-1; i>=0; i--){
            if(visited[s.charAt(i)]){
                res = i;
            }else{
                visited[s.charAt(i)] = true;
            }
        }

        return res;
    }

}
