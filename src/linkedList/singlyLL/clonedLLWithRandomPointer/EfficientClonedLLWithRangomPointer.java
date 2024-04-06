package linkedList.singlyLL.clonedLLWithRandomPointer;

/*
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(1)
 */


public class EfficientClonedLLWithRangomPointer {

    static class Node{
       int data;
       Node next;
       Node random;

       Node(int data){
        this.data = data;
       }
    }

    public static void main(String [] args){
        Node head = new Node(10); 
        head.next = new Node(5); 
        head.next.next = new Node(20); 
        head.next.next.next = new Node(15); 
        head.next.next.next.next = new Node(20); 
        
        head.random = head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;
        
        System.out.print( "Original list : \n"); 
        print(head);

        System.out.print( "Cloned list : \n");
        Node clonedLL = clonedLL(head);
        print(clonedLL);

    }

    public static Node clonedLL(Node head){
        if(head==null){
            return head;
        }


        //insert next reference for with cloned nodes in original LL OR Insert cloned nodes alternatively
        Node curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = next;
            curr = next;
        }


        //connect cloned nodes with random
        curr = head;
        while(curr!=null){
            curr.next.random = curr.random!=null ? curr.random.next : null;
            curr = curr.next.next;
        }

        //seperate original and cloned nodes
        Node original = head;
        Node cloneOriginal = head.next;
        Node temp = cloneOriginal;

        while(original!=null && cloneOriginal !=null){

            original.next = original.next.next; //original next.next would always exists

            //for cloned one have to check
            cloneOriginal.next = cloneOriginal.next!=null ? cloneOriginal.next.next : null;

            original = original.next;
            cloneOriginal = cloneOriginal.next;
        }

        return temp;

    
    }

    public static void print(Node head){
        if(head==null){
            return;
        }

        Node curr = head;
        while(curr != null){
            System.out.println ( "Data = " + curr.data + ", Random  = "+curr.random.data ); 
            curr = curr.next;
        }
    }
    
    
}
