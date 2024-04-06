package linkedList.singlyLL.isPalindrome;

import java.util.Deque;
import java.util.ArrayDeque;

/*
 * Approach : 
 * 1. Declare a deque and push each character of LL into it
 * 2. Pop each element from top and traverse the LL from start and start comparing
 * 3. while comparing if you find character not matching return immediately with false
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N)
 */

public class CheckPalindromeUsingDeque {

    static class Node{
        Character data;
        Node next;

        Node(Character data){
            this.data = data;
        }
    }

    public static void main(String args[]){
        Node head = new Node('r');
        head.next = new Node('a');
        head.next.next = new Node('d');
        head.next.next.next = new Node('a');
        head.next.next.next.next = new Node('r');


        System.out.println("Is the given LL is palindrome ? "+checkPalindrome(head));
    }

    public static boolean checkPalindrome(Node head){
        Deque<Character> deque = new ArrayDeque<>();

        Node curr = head;

        while(curr!=null){
            deque.push(curr.data);
            curr = curr.next;
        }


        curr = head;
        while(curr!=null){
            if(curr.data != deque.pop()){
                return false;
            }
            curr=curr.next;
        }


        return true;

    }

    
}
