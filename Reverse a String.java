class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder str = new StringBuilder();
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            char ch = s.charAt(i);
            str = str.append(ch);
        }
        return str.toString() ; 
        
    }
}
