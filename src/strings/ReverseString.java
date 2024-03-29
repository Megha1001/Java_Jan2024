package strings;

/*
 * APPROACH :
 * 1. reverse the individual words of the string
 * 2. reverse the whole string
 *
 * TIME COMPLEXITY : O(N)
 */

public class ReverseString {
    public static void main(String [] args){
        String s = "Java is great";

        System.out.println("String after reversing it is : ");
        char str[] = s.toCharArray();
        printReversedString(str);
    }

    public static void printReversedString(char[] str){
        int n = str.length;
        //keep track of start of word
        int start = 0;
        
        //find end of each word
        for(int end=0; end<n; end++){
            //end when encounter ' '
            if(str[end] == ' '){//put empty not '' but ' '(there is a space)

                reverse(str, start, end-1); //end-1 : since end currently pointing to ' '

                //change start
                start = end+1;

            }
        }

        //above not reverse last word since its replacing when encounter ' '
        reverse(str, start, n-1);
        
        //reverse whole string
        reverse(str, 0, n-1);

        String res = new String(str);
        System.out.println("res : "+res);

    }


    public static void reverse(char[]str, int low, int high){

        while(low < high){
            //swap
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;

            ++low;
            --high;
        }
    }
}
