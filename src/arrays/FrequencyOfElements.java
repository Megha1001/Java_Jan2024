package arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int arr[] ={1,1,3,3,3,4,5,5,5,7,7,7,7,7,7};
        System.out.println("Frequencies of elements in given arrays :");
        getAndPrintFreq(arr);
    }
    public static void getAndPrintFreq(int arr[]){
        int freq = 1;
        int i=0;
        for(i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                ++freq;
            }else{
                System.out.println(arr[i-1]+":"+freq);
                freq=1;
            }
        }
        System.out.println(arr[i-1]+":"+freq);
    }
}
