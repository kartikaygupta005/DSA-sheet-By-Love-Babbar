class Solution {
    public void mergeArrays(int a[], int b[]) {
        int[] a1 = new int[a.length + b.length];
        int index = 0;

        for(int i = 0; i < a.length; i++) {
            a1[index] = a[i];
            index++;
        }

        for(int i = 0; i < b.length; i++) {
            a1[index] = b[i];
            index++;
        }

        Arrays.sort(a1);

        int index2 = 0;

        for(int i = 0; i < a.length; i++) {
            a[i] = a1[index2];
            index2++;
        }

        for(int i = 0; i < b.length; i++) {
            b[i] = a1[index2];
            index2++;
        }
    }
}
