package linkedList.singlyLL.isPalindrome;


/*
 * Approach : 
 * 1. find middle of LL using slow and fast pointer
 * 2. use middle as head and reverse the LL from mid to end
 * 3. using head and mid start comparing until mid!=null, if mid.data != head.data return otherwise iterate
 * 
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(1)
 */

public class EffCheckPalindromeUsingLL {

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
        if(head == null || head.next == null){
            return true;
        }

        Node middle = findMiddle(head);

        Node newHead = reverseHalfLL(middle);

        return compareLL(head, newHead); //ideally newHead should be middle but it will not change in original LL hence need to return back newHead and use the same
    }

    public static boolean compareLL(Node head, Node newHead){
        while(newHead!=null){
            if(head.data != newHead.data){
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }

    public static Node reverseHalfLL(Node head){
        Node prev = null;
        Node curr = head;

        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }

    public static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    
}
