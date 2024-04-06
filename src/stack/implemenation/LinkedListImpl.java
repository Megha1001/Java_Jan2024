package stack.implemenation;

/*
 * 
 * Approach : Insert at head of LL so it will require O(1) complexity
 * 
 * TIME COMPLEXITY : O(1)
 * AUX SPACE : O(1)
 * 
 */

public class LinkedListImpl {

    public static void main(String[] args) {
        MyStack1 mystack = new MyStack1();
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        System.out.println(mystack.peek());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.size());
        System.out.println(mystack.isEmpty());
    }
    
}


class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data = data;
    }
}

class MyStack1{
    Node1 head = null;
    int size;

    public void push(int data){
        Node1 newNode = new Node1(data);
        newNode.next = head;
        head = newNode;
        ++size;
    }

    public int pop(){
        if(head==null){
            //nothing to pop
            System.out.println("Underflow");
            return -1;
        }
        int temp = head.data;
        head = head.next;
        --size;
        return temp;
    }

    public int peek(){
        if(head==null){
            //nothing to pop
            System.out.println("Underflow");
            return -1;
        }
        return head.data;
    }

    public  int size(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }

}