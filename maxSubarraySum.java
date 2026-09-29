class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int max_sum = arr[0] ; 
        int current_sum = 0;
        for(int i = 0  ; i < arr.length ; i++){
            current_sum = Math.max(arr[i] , current_sum + arr[i]);
            if(current_sum > max_sum){
                max_sum = current_sum ; 
            }
        }
        return max_sum ; 
        
        
    }
}
