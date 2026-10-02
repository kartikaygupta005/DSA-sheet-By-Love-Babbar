class Solution {
    public int minJumps(int[] arr) {
        // code here
        if(arr[0] == 0 ){
            return  -1 ;
        }
        int n = arr.length ; 
        int maxi = 0 ; 
        int choice = 0 ; 
        int jumps = 0 ; 
        for(int i = 0 ; i  <  n - 1 ; i++ ){
            maxi = Math.max(maxi , arr[i] + i);
            if(i == choice){
                choice = maxi ; 
                jumps++;
            }
            if(choice >= n-1){
                return jumps;
            }
        }
        return -1 ;
        
    }
}
