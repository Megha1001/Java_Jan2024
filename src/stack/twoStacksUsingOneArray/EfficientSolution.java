package stack.twoStacksUsingOneArray;


class TwoStacks{
    int arr[];
    int top1; //for first stack
    int top2; //for second stack
    int cap;

    TwoStacks(int cap){
        this.arr = new int[cap];
        this.top1 = -1;
        this.top2 = cap;
        this.cap = cap;
    }


    //push to stack 1
    boolean push1(int x){
        if(top1 < top2-1){ //should have space in array for insertion
            ++top1;
            arr[top1] = x;
            return true;
        }

        return false;
    }


    //push to stack2
    boolean push2(int x){
        if(top1 < top2 -1){
            --top2;
            arr[top2] = x;
            return true;
        }

        return false;
    }

    //delete from stack1
    Integer pop1(){
        if(top1 >= 0){//is any element exists ?
            int temp = arr[top1];
            --top1;
            return temp;
        }
        return null;
    }

    //delete from stack2
    Integer pop2(){
        if(top2 < cap){
            int temp = arr[top2];
            ++top2;
            return temp;
        }
        return null;
    }

    //size of stack1
    int size1(){
        return top1+1;
    }

    //size of stack2
    int size2(){
        return cap-top2;
    }


}

public class EfficientSolution {

    public static void main(String args[]){
        TwoStacks ts=new TwoStacks(5); 
        ts.push1(5); 
        ts.push2(10); 
        ts.push2(15); 
        ts.push1(11); 
        ts.push2(7); 
        System.out.println("Popped element from stack1 is: " + ts.pop1()); 
        ts.push2(40); 
        System.out.println("Popped element from stack2 is: " + ts.pop2());  
	  
    }
    
}