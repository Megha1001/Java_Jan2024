package recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Below are the steps :");
        TOH(n,'A','B','C');
    }

    public static void TOH(int input, char A, char B, char C){
        //base case
        if(input==1){
            //have only 1 disc
            System.out.println("Move 1 from A to C");
            return;
        }
        //move n-1 disc from A to B with C as auxilary
        TOH(input-1, A, C, B);
        System.out.println("Move "+input+" from "+A+"to "+C);
        TOH(input-1, B, A, C);
    }
}
