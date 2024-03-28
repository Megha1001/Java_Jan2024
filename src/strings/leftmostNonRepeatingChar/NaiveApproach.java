package strings.leftmostNonRepeatingChar;

/*
 * TIME COMPLEXITY : O(N^2)
 */
public class NaiveApproach {
    public static void main(String args[]){
        String s = "meghaverma"; //g

        System.out.println("The index of leftmost non repeating char is "+findLeftMostNonRepeatingElement(s));
    }


    public static int findLeftMostNonRepeatingElement(String s){

        boolean flag = false;

        for(int i=0; i<s.length(); i++){
                flag = false;
            for(int j=0; j<s.length(); j++){ //need to consider from 0 otherwise for example string "sso" it will return index of second 's'
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    //repeating element
                    flag = true;
                }
            }
            if(!flag){
                return i;
            }
        }

        return -1;
    }
}
