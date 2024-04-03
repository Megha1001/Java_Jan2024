package linkedList.singlyLL.detectAndRemoveCycle;

public class DetectAndRemoveCycleUsingFloydAlgo {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    

    public static void main(String args[]){
        Node head = insertAtEnd(null, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);
        head.next.next.next.next = head;

  
        System.out.println("LL after removing cycle");
        head = detectAndRemoveCycle(head);
        traverse(head);
    }

    public static Node detectAndRemoveCycle(Node head){

        //detect loop using Floyd algo
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }

        //check whether its normal LL or have cycle
        if(slow != fast){
            //normal LL
            return head;
        }

        //Now we definetly have cycle

        //move slow to head
        slow = head;

        //when the loop is like 10->20->30->40->10(back to head)
        if(slow==head && fast==head){
            Node temp = head;
            do{
                temp=temp.next;
            }while(temp.next != slow); //!=fast or !=head
            temp.next = null;
            return head;
        }

        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }

        //now both are at just previous location to where cycle started. slow is at cycle end previous position fast is at cycle end previous position
        //break cycle
        fast.next = null;
        return head;
    }


    public static void traverse(Node head){
        if(head==null){
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);
        if(head==null){
            return newNode;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;

        return head;
    }
    
}
