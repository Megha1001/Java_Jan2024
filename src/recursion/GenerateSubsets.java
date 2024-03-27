package recursion;

public class GenerateSubsets {
    public static void main(String[] args) {
        String input = "ABC";
        String curr = "";
        int index = 0;
        System.out.println("All subsets/subsequence of given input are :");
        printSubsets(input,curr, index);
    }

    public static void printSubsets(String input, String curr, int index){
        //base case
        if(index == input.length()){
            System.out.print(curr+", ");
            return;
        }

        printSubsets(input, curr, index+1);//not considering
        printSubsets(input, curr+input.charAt(index), index+1);//considering
    }

}
