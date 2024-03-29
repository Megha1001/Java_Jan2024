package strings.patternMatching;

/*
 * TIME compLEXiTY : O(N*M) where N is length of original string and M is length pattern
 */
public class NaiveApproach {
    public static void main(String args[]){
        String s = "AAAAA";
        String pattern = "AAA";

        System.out.println("The index where given pattern is present " );
        findPattern(s, pattern);
    }

    public static void findPattern(String s, String pattern){
        int index = 0;
        boolean flag = false;
        for(int i=0; i<s.length()-pattern.length()+1; i++){
            flag = false;
            if(s.charAt(i) == pattern.charAt(index)){ //find start

                for(int j=i+1 ; j<(i+pattern.length()); j++){ //i+1 for next elememt
                    ++index;//for next element
                    //check for remaining char
                    if(s.charAt(j) != pattern.charAt(index)){
                        flag = true;
                    }
                }

                if(!flag){
                    System.out.print(i+" ");
                }
                // i += pattern.length()-1; //since zero indexed
                index = 0; //for next pattern

            }
        }

    }
}
