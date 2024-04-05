package linkedList.singlyLL.segregateEvenOrOdd;
/*
 * TIME COMPLEXITY : O(N)
 */

public class EfficientSolution {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }


    public static void main(String args[]){
        Node head = insertAtEnd(null, 10);
        head = insertAtEnd(head, 9);
        head = insertAtEnd(head, 8);
        head = insertAtEnd(head, 6);
        head = insertAtEnd(head, 7);

        System.out.println("Original LL");
        traverse(head);
        System.out.println("After segreation of even and odd ");
        head = segregate(head);
        traverse(head);
    }

    public static Node segregate(Node head){

        //for even
        Node es = null;
        Node ee = null;

        //for odd
        Node os = null;
        Node oe = null;

        Node temp = head;

        while(temp != null){
            int data = temp.data;

            //even
            if(data%2 == 0){
                if(es == null){
                    //first node
                    es = temp;
                    ee = es;
                }else{
                    ee.next = temp;
                    ee = ee.next;
                }
            }else {//odd
                if(os == null){
                    os = temp;
                    oe = os;
                }else{
                    oe.next = temp;
                    oe = oe.next;
                }
            }

            temp = temp.next;
        }

        if(os==null || es == null){
            return head;
        }

        ee.next = os;
        oe.next = null;


        return es;

    }

    public static void traverse(Node head){
        if(head==null){
            return;
        }

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
    }


    public static Node insertAtEnd(Node head, int data){

        Node curr = new Node(data);

        if(head==null){
            return curr;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = curr;

        return head;
    } 
    
}
