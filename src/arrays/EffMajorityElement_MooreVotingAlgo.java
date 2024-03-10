package arrays;
/*
Moore's Voting Algorithm

This is a two-step process
    1. The first step gives the element that may be the majority element in the array.If there is a
    majority element in an array then this step will definitely return majority element, otherwise it
    will return the candidate for majority element

    2. Check fi the element obtained from the above step is the majority element. This step is necessary
    as there might be no majority element

    Disclaimer : This algo doesn't gurantee to return the index of first occurrence of majority element
    it can return any index

 */
public class EffMajorityElement_MooreVotingAlgo {
    public static void main(String[] args) {
        int arr[]={8,8,6,6,6,6,4,6};
        System.out.println("The majority element is : "+arr[countMajorityElementUsingMooreAlgo(arr)]);
    }

    public static int countMajorityElementUsingMooreAlgo(int arr[]){
        int mayBeCandidate = findCandidate(arr);
        int res = checkAndGetIfMajorityOrNot(arr, mayBeCandidate);

        return res;
    }

    public static int findCandidate(int arr[]){
        int res = 0;
        int count =1;

        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[res]){
                ++count;
            }else{
                --count;
            }
            if(count == 0){ //the occurrence is definitely less than n/2;
                res = i;
                count = 1;
            }
        }
        return res;
    }

    public static int checkAndGetIfMajorityOrNot(int arr[], int candidateIndex){
        int count=0;
        int res = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[candidateIndex]==arr[i]){
                ++count;
            }
        }

        return count <= arr.length/2 ? res : candidateIndex;
    }
}
