package hashing;
/*
 * TIME COMPLEXITY : Theta(M+N)
 * AUXILARY SPACE : Theta(N)
 */
import java.util.HashSet;

public class FindIntersectingElements {

    public static void main(String [] args){
        int a[] = {10,15,20,25,30,50};
        int b[] = {30,5,15,80};
        System.out.println("The intersecting elements are :-");
        findIntersectingElements(a,b);
    }
    
    public static void findIntersectingElements(int a[], int b[]){
        int n = a.length;
        HashSet<Integer> h1 = new HashSet<>();

        for(int i=0; i<b.length; i++){
            h1.add(b[i]);
        }

        for(int i=0; i<n; i++){
            if(h1.contains(a[i])){  
                System.out.print(a[i]+" ");
            }
        }

    }
}
