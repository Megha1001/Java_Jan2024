class PrefixSumAlgo {
    
    public static int preCompute[];
    public static void main(String[] args) {
        int arr[] = {2,8,3,9,6,5,4};
        preCompute = new int [arr.length];
        
        //Pre-processing
        preCompute[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            preCompute[i] = preCompute[i-1] + arr[i];
        }
        System.out.println("The sum for given lengths are :-");
        System.out.println(getSum(0, 2, preCompute));
        System.out.println(getSum(1, 3, preCompute));
        System.out.println(getSum(2, 6, preCompute));
    }
    
    //Computation in O(1)
    public static int getSum(int l, int r, int preCompute[]){
        if(l==0){
            return preCompute[r];
        }else{
            return preCompute[r] - preCompute[l-1];
        }
    }
}
