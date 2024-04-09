package stack.largestAreaOfRectangleInHistogram;

import java.util.Stack;

public class EfficientSolutionUsingStack {


    public static void main(String args[]){
        int[] arr=new int[]{6,2,5,4,1,5,6};

        System.out.println("The largest area of rectangle in histogram is "+findLargestArea(arr));
    }
    

    public static int findLargestArea(int arr[]){
        int n = arr.length;
        int res = 0;
        //base condition
        if(n==0){
            return res;
        }

        int ps[] = new int[n];
        int ns[] = new int[n];

        Stack<Integer> s = new Stack<>();

        //compute previous smallest of every element
        s.push(0);
        ps[0] = -1;

        for(int i=1; i<n; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            int pse = s.isEmpty() ? -1 : s.peek();

            ps[i] = pse;

            s.push(i);
        }

        //cleanup Stack
        while(!s.isEmpty()){
            s.pop();
        }


        //compute next smallest of every element
        s.push(n-1);
        ns[n-1] = n;

        for(int i=n-2; i >=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            int nse = s.isEmpty()? n : s.peek();

            ns[i] = nse;

            s.push(i);
        }



        for(int i=0 ; i<n; i++){
            int curr = arr[i];
            //for left side
            curr += (i-ps[i]-1)*arr[i];
            
            //for right side
            curr += (ns[i]-i-1)*arr[i];

            res = Math.max(res, curr);
        }



        return res;
    }
}
