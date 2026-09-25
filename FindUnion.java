import java.util.HashSet.*;
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> hashset = new HashSet<>();
        for(int i = 0 ; i < a.length ;i++){
            hashset.add(a[i]);
        }
        for(int i = 0 ; i < b.length ;i++ ){
            hashset.add(b[i]);
        }
        ArrayList<Integer> answer = new ArrayList<>(hashset);
        return answer ; 
        
    }
}
