class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int smallest = arr[0] ;
        int largest = arr[0] ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }if(arr[i] > largest){
                largest = arr[i];
            }
        }
        ArrayList<Integer> array = new ArrayList<>();
        array.add(smallest) ;
        array.add(largest); 
        return array ; 
    }
}
