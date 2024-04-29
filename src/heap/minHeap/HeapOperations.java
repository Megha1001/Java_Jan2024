package heap.minHeap;


/*
Assuming only the given index (i) node is violating the property of min heap. Hence, have to fix that only
i is zero indexed
 */
public class HeapOperations {

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
        TIME COMPLEXITY : O(H), where H is height ==>O(logN),since its complete binary tree
        best case : O(1) , when already min heap
        AUX : O(H)
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

        /*
        Kind of delete func
        TO extract root :
        1. swap it with last element (why choosing last since removal is easy, just need to do --size)
        2. do --size
        3. minHeapify for root
        4. return arr[size], not size-1, that we usually do.

        TIME COMPLEXITY : O(1) + O(logN)
        Aux space : O(LogN) for recursive and O(1) : iterative
         */
        public int extractMin(){

            //no elements
            if(size==0){
                return Integer.MAX_VALUE;
            }

            // one element
            if(size==1){ // why base case , since in case of 1 element minheapify can thrown error(2i+1, 2i+2)
                --size;
                return arr[0];
            }

            //swap last and root
            int temp = arr[0];
            arr[0] = arr[size-1];
            arr[size-1] = temp;

            --size;
            minHeapify(0);//since, we swapped last with first it must needs to be heapify

            return arr[size];


        }

        /*
        decrease key :
        Given : new value(x), index=i
        1. update value at i index with x and then make sure its still a heap(same like insert)
         */

        void decreseKey(int x, int i){
            arr[i] = x;

            while(i!=0 && arr[getParent(i)]>arr[i]){
                //swap
                int temp = arr[getParent(i)];
                arr[getParent(i)] = arr[i];
                arr[i] = temp;

                i = getParent(i);
            }

        }


        /*
        Delete :
        Given : index
        1. apply decresekey(index, Integer.MIN_VALUE) --> hence it will come to toot
        2. apply extractMin

        TIME COMPLEXITY : O(logN)
         */

        void delete(int i){
            if(i>(size-1)){
                //invalid
                return;
            }

            decreseKey(Integer.MIN_VALUE, i);
            extractMin();
        }
    }



    public static void main(String[] args) {
        MinHeap h=new MinHeap(11);
        h.insert(3);
        h.insert(2);
        h.insert(15);
        h.insert(20);
        System.out.print("After extraction the min element is : "+h.extractMin());

        System.out.println(" decrease key for index=3 : ");
        h.decreseKey(1, 3);//index=3, insert 1

        System.out.println("Root element is : "+h.arr[0]);
    }


}
