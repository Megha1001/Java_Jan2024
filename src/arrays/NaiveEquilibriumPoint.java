class NaiveEquilibriumPoint {
    
    public static void main(String[] args) {
        // int arr[] = {3,4,8,-9,20,6};
        int arr[] = {4,2,-2};
        System.out.println("does the given array contain equilibrium point ?"+doesEquilibriumPointExists(arr, arr.length));
    
    }
    
    public static boolean doesEquilibriumPointExists(int arr[], int n){
        
        for(int i=0 ; i<n; i++){
            //check equilibrium for every element
            int rightSideSum=0;
            for(int j=i+1; j<n; j++){
                rightSideSum += arr[j];
            }
            
            int leftSideSum=0;
            for(int j=0; j<i; j++){
                leftSideSum += arr[j];
            }
            
            if(leftSideSum == rightSideSum){
                return true;
            }
        }
        
        return false;
    }
}
