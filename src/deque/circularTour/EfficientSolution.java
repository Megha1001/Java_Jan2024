package deque.circularTour;

// LInk : https://www.geeksforgeeks.org/batch/dsa-4/track/DSASP-Deque/video/MTU3OQ%3D%3D
// https://www.youtube.com/watch?v=xmJZSYSvgfE
/*
 * ONE OF THE BEST QUESTION
 * 
 * Approach : If curr_petrol becomes -ve at pi, then none of the petrol pump from p0 to pi can be a solution
 * 
 * TIME COMPLEXITY : O(N)
 * 
 */

public class EfficientSolution {

    public static void main(String args[]){
        int [] petrol = {50,10,60,100};
        int [] dist = {30,20,100,10};

        System.out.println("The index from which we can start and get back to same index is "+findIndex(petrol, dist));
    }

    public static int findIndex(int[]p, int []d){
        int n = p.length;

        int start = 0;
        int curr_petrol = 0;
        int prev_petrol  = 0;

        for(int i=0; i<n; i++){
            curr_petrol += p[i]-d[i]; // ultimately indicates the petrol needed from going n-1 -> 0

            if(curr_petrol < 0){
                start = i+1;
                prev_petrol += curr_petrol; //we might have encountered various restart so we have to have value of prev_petrols as well (might have multiple restarts)
                curr_petrol = 0;    
            }
        }

        return (curr_petrol+prev_petrol) >=0 ? start+1 : -1;

    }
    
}
