package sorting;

public class NaiveIntersectOfTwoSortedArrays {

    public static void main(String [] args){
        int a[]={10,20,20,40,60};
        int b[] ={2,20,20,20,40};

        System.out.println("The common elements in given arrays are :");
        printIntersection(a,b);
        
    }

    public static void printIntersection(int a[], int b[]){

        //for each element will check
        for(int i=0; i<a.length; i++){
            if(i>0 && a[i]==a[i-1]){
                //already addressed
                continue;
            }
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    break; //found already for this element
                }
            }
        }

    }
    
}
