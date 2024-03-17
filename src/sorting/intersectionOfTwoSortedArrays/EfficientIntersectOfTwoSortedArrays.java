package sorting.intersectionOfTwoSortedArrays;


/*
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N)
 */

public class EfficientIntersectOfTwoSortedArrays {
    public static void main(String [] args){
        int a[]={10,20,20,40,60};
        int b[] ={2,20,20,20,40};

        System.out.println("The common elements in given arrays are :");
        printIntersection(a,b);
    }


    //use Merge function of merge sort
    public static void printIntersection(int a[], int b[]){
        int i=0;
        int j=0;

        while(i < a.length  && j<b.length){
            //alredy addressed
            if(i > 0 && a[i]==a[i-1]){
                ++i;
                continue;
            }

            if(a[i]>b[j]){
                //b[j] can never be found at right of a[i] since its sorted array
                ++j;
            }

            else if(a[i]<b[j]){
                //a[i] can never be found in right of b[j] since its sorted array
                ++i;
            }
            
            else{
                //equal
                System.out.print(a[i]+" ");
                ++i;
                ++j;
            }
        }
    }
    
}
