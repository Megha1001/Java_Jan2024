package heap.minHeap;


/*
Assuming only the given index (i) node is violating the property of min heap. Hence, have to fix that only
i is zero indexed
 */
public class MinHeapify {

    static class MinHeap{
        int [] arr;
        int c;
        int size;

        MinHeap(int c){
            this.arr = new int[c];
            this.c = c;
            this.size = 0;
        }

        int getLeft(int i){
            return 2*i+1;
        }

        int getRight(int i){
            return 2*i+2;
        }

        int getParent(int i){
            return (i-1)/2;
        }

        void insert(int x){
            if(size==c){
                return;
            }

            ++size;
            arr[size-1]=x;

            for(int i= size-1; i!=0 &&(arr[getParent(i)]) > arr[i];){
                //swap
                int temp = arr[getParent(i)];
                arr[getParent(i)] = arr[i];
                arr[i] = temp;

                i= getParent(i);
            }

        }

        /*
        TIME COMPLEXITY : O(H), where H is height
        best case : O(1) , when already min heap
         */

        void minHeapify(int i){
            int leftChild = getLeft(i);
            int rightChild = getRight(i);
            int smallest = i;

            if(leftChild<size && arr[leftChild] < arr[i]){
                smallest = leftChild;
            }

            if(rightChild<size && arr[rightChild] < arr[smallest]){
                smallest = rightChild;
            }

            if(smallest!=i){
                //swap
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;

                minHeapify(smallest);
            }
        }
    }


    public static void main(String[] args) {
        MinHeap h=new MinHeap(11);
        h.insert(3);
        h.insert(2);
        h.insert(15);
        h.insert(20);
        System.out.print(h.extractMin());
    }


}
