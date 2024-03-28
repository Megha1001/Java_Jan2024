package strings.leftmostRepeatingElement;

/*
 * TIME COMPLEXITY: O(N^2)
 * AUX SPACE : O(1)
 */
public class NaiveSolution {
    public static void main(String args[]){
        String s = "meghaverma"; //m

        System.out.println("The index of leftmost repeating element is :"+findLeftMostRepeatingElement(s));
    }

    public static int findLeftMostRepeatingElement(String s){

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i)== s.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
}
