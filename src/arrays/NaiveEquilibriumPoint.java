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
            for(int j=i+1; j<n && i!=n-1; j++){ //in case of right most we consider rightSideSum as 0 that's why have && i!=n-1
                rightSideSum += arr[j];
            }
            
            int leftSideSum=0;
            for(int j=0; j<i && i!=0; j++){//in case of left most we consider rightSideSum as 0. that's why have && i!=0
                leftSideSum += arr[j];
            }
            
            if(leftSideSum == rightSideSum){
                return true;
            }
        }
        
        return false;
    }
}
