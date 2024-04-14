package deque.circularTour;

/*
 * TIME COMPLEXITY : O(N*N)
 */

public class NaiveSolution {

    public static void main(String args[]){

        int [] petrol = {50,10,60,100};
        int [] dist = {30,20,100,10};

        System.out.println("The index from which we can start and get back to same index is "+findIndex(petrol, dist));
    }
    

    public static int findIndex(int [] p, int [] d){
        int res=-1;
        int n = p.length;

        for(int start=0; start<n ; start++){

            int end = start;
            int curr_petrol = 0;


            while(true){
                curr_petrol += (p[end]-d[end]);

                if(curr_petrol < 0){
                    break;
                }
                end = (end+1)%n;
                if(start==end){
                    return start+1;
                }
            }

        }

        return res;
    }
}
