package hashing.collisionHandling;

import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementationOfChaining {

    public static void main(String args[]){
        MyHash mh = new MyHash(7);
	    mh.insert(10);
	    mh.insert(20);
	    mh.insert(15);
	    mh.insert(7);
	    System.out.println(mh.search(10));
	    mh.delete(15);
	    System.out.println(mh.search(15));
    }
    
}

class MyHash{
    int BUCKET ;
    ArrayList<LinkedList<Integer>> table;

    MyHash(int bucket){
        BUCKET = bucket;
        table = new ArrayList<LinkedList<Integer>>();

        for(int i=0; i<bucket; i++){
            table.add(new LinkedList<Integer>());
        }
    }


    //search
    boolean search(Integer key){
        int i = key%BUCKET;
        return table.get(i).contains(key);
    }

    //insert
    void insert(Integer key){
        int i = key%BUCKET;
        table.get(i).add(key);
    }
    
    //delete
    void delete(Integer key){
        int i = key%BUCKET;
        table.get(i).remove(key);
    }

}
