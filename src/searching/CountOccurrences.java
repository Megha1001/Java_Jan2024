package searching;

/*
TIME COMPLEXITY : O(logN)
AUX SPACE : O(1)

IDEA : COUNT => last_occurrence - first_occurrence +1
 */
public class CountOccurrences {
    public static void main(String[] args) {
        int arr[] ={20, 20, 20, 20, 20, 20};
        int item = 20;
        System.out.println("Number of occurrence of"+ item+" element is :"+countOccurr(arr, 0, arr.length-1, item));
    }

    //iterative approach
    public static int countOccurr(int arr[], int l, int h, int x){
        int firstOccurr = findFirstOccurr(arr, l, h, x);
        if(firstOccurr == -1){
            return -1;
        }
        return (lastOccurr(arr, l, h, x) - firstOccurr +1);
    }

    public static int findFirstOccurr(int arr[], int l, int h, int x){
        while(l <= h){
            int m = (l+h)/2;
            if(arr[m]==x){
                if(m==0 || arr[m]!=arr[m-1]){
                    return m;
                }else{
                    h = m - 1;
                }
            }else if(arr[m] > x){
                h = m - 1;
            }else{
                l = m + 1;
            }
        }
        return -1;
    }

    public static int lastOccurr(int arr[], int l, int h, int x){
        while(l <=h){
            int m = (l+h)/2;

            if(arr[m]==x){
                if(m==arr.length-1 || arr[m]!=arr[m+1]){
                    return m;
                }else{
                    l = m+1;
                }
            }else if(arr[m] > x){
                h = m - 1;
            }else{
                l = m + 1;
            }
        }

        return -1;
    }
}
