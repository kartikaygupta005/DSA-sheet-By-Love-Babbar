class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i , 0 ) + 1);
        }
            for(int key : map.keySet()){
            if(map.get(key) > 1){
                ans.add(key);
            }
        }
        return ans ; 
        }
    }
