package queue;

import java.util.Queue;
import java.util.ArrayDeque;

/*
 * Approach
 * - Use two Queue(main queue -> ma and Auxilary queue ->aq)
 * - While pushing element we take all the items present in mq->aq then push in mq then push back all the elements of aq->mq
 * - to delete an items poll from front of the queue since it would be containing last pushed element at front
 */

public class ImplStackUsingQueues {


    static class Stack{
        Queue<Integer> mq = new ArrayDeque<>();
        Queue<Integer> aq = new ArrayDeque<>();

        int currSize=0;

        int top(){
            if(mq.isEmpty()){
                return -1;
            }

            return mq.peek(); //retrieves head of the queue i.e. front
        }


        int size(){
            if(mq.isEmpty()){
                return -1;
            }

            return currSize;
        }


        void push(int x){

            ++currSize;

            if(mq.isEmpty()){
                mq.offer(x); //save us from the exception when capacity is full unlike add method
                return;
            }

            //take all the element from mq->aq
            while(!mq.isEmpty()){
                aq.offer(mq.poll()); //poll method save us from exception when queue is empty unlike remove
            }

            //push curr element to mq
            mq.offer(x);

            //push back all the elements from aq->mq
            while(!aq.isEmpty()){
                mq.offer(aq.poll());
            }

            
        }

        int pop(){
            if(mq.isEmpty()){
                return -1;
            }
            --currSize;
            return mq.remove(); //peek method saves us from exception when queue is empty
        }

    }

    public static void main(String[] args) 
	{ 
		Stack s = new Stack(); 
		s.push(10); 
        s.push(5); 
        s.push(15); 
        s.push(20);

		System.out.println("current size: " + s.size()); 
		System.out.println(s.top()); 
		s.pop(); 
		System.out.println(s.top()); 
		s.pop(); 
		System.out.println(s.top()); 

		System.out.println("current size: " + s.size()); 
	} 
    
    
}
