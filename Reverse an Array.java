class Solution {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        // Swap elements from both ends moving towards the center
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
}
