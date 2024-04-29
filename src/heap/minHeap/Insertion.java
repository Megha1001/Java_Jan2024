package heap.minHeap;

import java.util.Arrays;

/*
TIMEC
 */

public class Insertion{

    static class MinHeap{
        int arr[];
        int c;
        int size;

        MinHeap(int c){
            this.arr = new int[c];
            this.c = c; //capacity
            this.size = 0; //nothing is there
        }

        int getParent(int i){
            return (i-1)/2;
        }

        int getLeftChild(int i){
            return 2*i+1;
        }

        int getRightChild(int i){
            return 2*i+2;
        }

        public void insert(int x){
            if(size==c){
                return; //can't insert
            }

            ++size; //num of elements --> not zero indexed
            arr[size -1] = x; //-1 since size is not zero indexed

            //maintain bst
            for(int i =size-1; i!=0 && (arr[getParent(i)]>arr[i]);){
                //swap
                int temp = arr[getParent(i)];
                arr[getParent(i)] = arr[i];
                arr[i] = temp;

                i = getParent(i);
            }

        }
    }
    public static void main(String[] args) {
        MinHeap h = new MinHeap(11);
        h.insert(3);
        h.insert(2);
        h.insert(15);
        h.insert(20);

        Arrays.stream(h.arr).forEach(System.out::println);
    }

}
