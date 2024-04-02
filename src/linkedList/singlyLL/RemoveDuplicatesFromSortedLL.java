package linkedList.singlyLL;

class RemoveDuplicatesFromSortedLL {
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
       head = insertAtEnd(head, 20);
       head = insertAtEnd(head, 30);
       head = insertAtEnd(head, 30);
       head = insertAtEnd(head, 30);
       
       System.out.println("Original LL");
       traverse(head);
       
       System.out.println("LL after removing duplicates");
       head = removeDuplicates(head);
       traverse(head);

   }
   
   
   public static Node removeDuplicates(Node head){
       if(head==null || head.next == null){
           return head;
       }
       
       Node curr = head;
       while(curr!=null && curr.next != null){
           if(curr.data == curr.next.data){
               curr.next = curr.next.next;
           }else{
               curr = curr.next;
           }
       }
       
       return head;
   }
   
   public static Node insertAtEnd(Node head, int data){
       Node newNode = new Node(data);
       
       if(head==null){
           return newNode;
       }
       
       Node temp = head;
       while(temp.next != null){
           temp = temp.next;
       }
       
       temp.next = newNode;
       
       return head;
   }
   
   
   public static void traverse(Node head){
        if(head==null||head.next==null){
            return;
        }
        
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
   }
}
