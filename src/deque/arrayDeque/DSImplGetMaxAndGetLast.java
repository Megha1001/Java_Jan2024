package deque.arrayDeque;

import java.util.ArrayDeque;

public class DSImplGetMaxAndGetLast {

    static class DSGetMinAndMax{
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        void insertMin(int x){
            ad.offerFirst(x);
        }

        void insertMax(int x){
            ad.offerLast(x);
        }

        int getMin(){
            return ad.peekFirst();
        }

        int getMax(){
            return ad.peekLast();
        }


        int extractMin(){
            return ad.pollFirst();
        }

        int extractMax(){
            return ad.pollLast();
        }
    }


    public static void main(String args[]){
        DSGetMinAndMax ds = new DSGetMinAndMax();
        
        ds.insertMin(10);
		ds.insertMax(15);
		ds.insertMin(5);
		
		int x= ds.extractMin();
		System.out.println(x);
		
		x= ds.extractMax();
		System.out.println(x);
		
		ds.insertMin(8);
		
    }
    
}
