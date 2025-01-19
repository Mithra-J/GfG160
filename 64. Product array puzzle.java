class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int totalProduct = 1;
        int zeroCount = 0;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else {
                totalProduct *= arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                res[i] = 0; 
            } else if (zeroCount == 1) {
                res[i] = (arr[i] == 0) ? totalProduct : 0; 
            } else {
                res[i] = totalProduct / arr[i]; 
            }
        }

        return res;
    }
}
