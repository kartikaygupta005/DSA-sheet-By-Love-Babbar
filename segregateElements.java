class Solution {
    public void segregateElements(int[] arr) {
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> positive = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                negative.add(arr[i]);
            }
            else{
                positive.add(arr[i]);
            }
        }

        ArrayList<Integer> dummy = new ArrayList<>();
        int index = 0;
        int index2 = 0;

        while(index < positive.size()){
            dummy.add(positive.get(index));
            index++;
        }

        while(index2 < negative.size()){
            dummy.add(negative.get(index2));
            index2++;
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = dummy.get(i);
        }
    }
}
