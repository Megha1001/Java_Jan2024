package hashing.collisionHandling;

import java.util.ArrayList;

public class App2LinearProbingImpl {

    public static void main(String args[]){
        MyHashApp2 mh = new MyHashApp2(7);
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

        mh.print();
    }
    
}


class MyHashApp2{

    int [] arr;
    int cap, size;

    MyHashApp2(int cap){
        this.cap = cap;
        this.size = 0;
        this.arr = new int[cap];

        for(int i=0; i<cap; i++){
            arr[i] = -1;
        }
    }

    int hash(int key){
        return key%cap;
    }

    //search
    boolean search(int key){
        /*
        stop when found empty, element found or we reach at same position
        element found or we reach at same position -> value !=-1
        stop when found empty ==-1
        */

        int h = hash(key);
        int i = h;

        while(arr[i] !=-1){
            //key found
            if(arr[i]==key){
                return true;
            }
            i = (i+1)%cap;
            //reached at same position
            if(h==i){
                return false;
            }
        }
        //found empty
        return false;
    }

    void print(){
        for(Integer i : arr){
            System.out.print(i+" ");
        }
    }

    /*
     * If able to insert return true
     *  - found empty(-1), deleted(-2) slot
     * If not able to insert return false
     *  - reached at same postion, array size == cap
     *  - already present
     */
    boolean insert(int key){
        //no capacity to insert
        if(size == cap){
            return false;
        }
        int h = hash(key);
        int i = h;
        while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key){
            i =(i+1)%cap;
        }

        //already present
        if(arr[i] == key){
            return false;
        }else{ //insert
            arr[i] = key;
            ++size;
            return true;
        }
    }


    boolean erase(int key){
        /*
         * stop when found empty slot or reach at same place
         */
        int h = hash(key);
        int i=h;
        //check for element present or reach at same position
        while(arr[i]!=-1){
            if(arr[i] == key){
                arr[i] = -2;
                return true;
            }

            i = (i+1)%cap;
            
            // reached at same position
            if(i==h){
                return true;
            }
        }
        return false;
    }
}