package linkedList.singlyLL.segregateEvenOrOdd;

public class NaiveSolution {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    

    public static void main(String args[]){
        Node head = insertAtEnd(null, 17);
        head = insertAtEnd(head, 8);
        head = insertAtEnd(head, 3);
        head = insertAtEnd(head, 4);
        head = insertAtEnd(head, 16);
        head = insertAtEnd(head, 19);

        head = segregateEvenOrOdd(head);


        traverse(head);
    }


    public static Node segregateEvenOrOdd(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node curr = head;
        Node lastNode = null;

        //find last Node
        while(curr.next!=null){
            curr = curr.next;
        }

        lastNode = curr.next;

        Node tempLastNode = lastNode;
        Node tempHead = head;
        boolean firstPass = true;

        while(tempHead != lastNode){
            if(tempHead.data%2==0 && firstPass){
                //even
                head = tempHead;
                firstPass = false;
                tempHead = tempHead.next;
            }else if(tempLastNode!=null && tempLastNode.next !=null && tempHead.data%2!=0){

                Node curr1 = tempHead;
                curr1.next = null;
                tempHead = tempHead.next;
                tempLastNode.next = curr1;
                tempLastNode = curr1;
            }else{
                tempHead = tempHead.next;
            }
        }



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
