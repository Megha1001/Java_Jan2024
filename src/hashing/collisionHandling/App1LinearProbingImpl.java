package hashing.collisionHandling;

import java.util.ArrayList;

public class LinearProbingImpl {

    public static void main(String args[]){
        MyHash mh = new MyHash(7);
	    mh.insert(49);
	    mh.insert(56);
	    mh.insert(72);
	    if(mh.search(56)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	    mh.erase(56);
	    if(mh.search(56)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
    }
    
}


class MyHash{
    int size;
    ArrayList<Integer> elements;

    MyHash(int size){
        this.size = size;
        this.elements = new ArrayList<Integer>(7);

        //initiallize
        for(int i=0; i<size; i++){
            elements.add(-1);
        }
    }

    //insert

    void insert(Integer i){
        int key = i%size;
        
        //check at position , if -1 insert otherwise search for available location like
        //stop if not able to find empty slot(-1)
        if(elements.get(key)==-1){
            elements.set(key,i);
        }else{
            boolean flag = false;
            for(int j=key+1; (j%size!=key); j=(j+1)%size){
                if(elements.get(j)<=-1){
                    //available
                    elements.set(j,i);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("Cannot be added");
            }
        }
    }

    boolean search(Integer i){
        int key = i%size;
        
        //check at position , if -1 insert otherwise search for available location like
        //stop if not able to find empty slot(-1)
        if(elements.get(key)==i){
            return true;
        }else{
            //do linear probing
            for(int j=key+1; (j%size!=key); j=(j+1)%size){
                if(elements.get(j)==i){
                    //available
                    return true;
                }else if(elements.get(j)==-1){
                    return false; //stop at empty slot
                }
            }   
        }
        return false;
    }

    boolean erase(Integer i){
        int key = i%size;
        
        //check at position , if -1 insert otherwise search for available location like
        //stop if not able to find empty slot(-1)
        if(elements.get(key)==i){
            //available
            elements.set(key, -2);
            return true;
        }else{
            //do linear probing
            for(int j=key+1; (j%size!=key); j=(j+1)%size){
                if(elements.get(j)==i){
                    //available
                    elements.set(j, -2);
                    return true;
                }
            }   
        }
        return false;
    }


    void print(ArrayList<Integer>elements){
        for(Integer i : elements){
            System.out.print(i+" ");
        }
    }
}