class Solution {
    public int longestSubarray(int[] arr, int k) {
        
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int maxLength = 0 , currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == k) {
                maxLength = i + 1; 
            }

            if (prefixSumMap.containsKey(currentSum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(currentSum - k));
            }

            if (!prefixSumMap.containsKey(currentSum)) {
                prefixSumMap.put(currentSum, i);
            }
        }

        return maxLength;
    }
}
