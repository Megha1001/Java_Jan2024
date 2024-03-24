package hashing;
/*
TIME COMPLEXITY : Theta(N)
AUX SPACE : O(N)
 */

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {

    public  static void main(String [] args){
        int arr[] = {10,20,10,30,20,60,60,40};
        System.out.println("the frequency of elements are : ");
        findAndPrintFreq(arr);
    }


    public static void findAndPrintFreq(int []arr){
        int n = arr.length;
        HashMap<Integer, Integer> h = new HashMap<>(n);

        for(int i=0; i<n; i++){
            h.put(arr[i], h.getOrDefault(arr[i],0)+1); //Theta(N)
        }

        for(Map.Entry<Integer,Integer>e : h.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue()); //O(1) , if one element than O(1)
        }
    }
    
}
