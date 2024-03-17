package sorting.mergeSort.unionOfTwoSortedArrays;

/*
 * TIME COMPLEIXTY : O((m+n))
 * AUX SPACE : O(1)
 */
public class EfficientUnionOfTwoSortedArrays {
    public static void main (String[] args) 
    {
        int a[] = new int[]{3,8,10,10,11,19,100,100};
        int b[] = new int[]{2,8,9,10,15};
        
        int m = a.length;
        int n = b.length;
	    printUnion(a,b,m,n);
        
    }

    public static void printUnion(int a[], int b[], int m, int n){
        //references for a and b
        int i=0;
        int j=0;
        
        while(i<m && j<n){
            //check if already considered for a
            if(i>0 && a[i-1]==a[i]){
                ++i;
                continue;
            }

            //check if already considered for b
            else if(j>0 && b[j-1]==b[j]){
                ++j;
                continue;
            }

            else if(a[i] < b[j]){
                //print a
                System.out.print(a[i]+" ");
                ++i;
            }

            else if(a[i] > b[j]){
                //print b
                System.out.print(b[j]+" ");
                ++j;
            }

            else{
                //equal
                System.out.print(a[i]+" ");
                ++i;
                ++j;
            }
        }


        //remaning elements of a
        while(i<m){
            //already considered
            if(i>0 && a[i-1]==a[i]){
                ++i;
                continue;
            }
            //print a
            System.out.print(a[i]+" ");
            ++i;
        }

        //remaning elements of a
        while(j<n){
            //already considered
            if(j>0 && b[j-1]==b[j]){
                ++j;
                continue;
            }
            //print b
            System.out.print(b[j]+" ");
            ++j;            
        }   

    }
}
