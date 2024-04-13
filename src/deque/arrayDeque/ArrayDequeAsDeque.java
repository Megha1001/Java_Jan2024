package deque.arrayDeque;

import java.util.ArrayDeque;


public class ArrayDequeAsDeque {
    public static void main(String args[]){
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.offerFirst(10);
        ad.offerLast(20);

        ad.offerFirst(30);
        ad.offerLast(40);

        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad.pollFirst());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
    }
}
