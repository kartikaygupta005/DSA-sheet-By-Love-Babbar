class Solution {
    public void sort012(int[] arr) {
        // code here
        int[] answer = new int[arr.length];
        //count zero ones and two 
        int index = 0 ;
        int zeroes = 0 ;
        int ones = 0 ;
        int two = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                zeroes += 1;
            }
            if(arr[i] == 1){
                ones += 1;
            }
            if(arr[i] == 2){
                two += 1;
            }
        }
        for(int j = 0 ; j < zeroes ;j++){
            answer[index] = 0 ;
            index++ ; 
        }
        for(int j = 0; j < ones; j++){
                    answer[index] = 1;
                    index++;
        }

        for(int j = 0; j < two; j++){
                    answer[index] = 2;
                    index++;
        }

        for(int j = 0; j < arr.length; j++){
                    arr[j] = answer[j];
        }
    }
}
