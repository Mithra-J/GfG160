class Solution {

    public int maxWater(int arr[]) {
        int left = 0; 
        int right = arr.length - 1; 
        int maxArea = 0; 
        while (left < right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int currentArea = height * width;

            maxArea = Math.max(maxArea, currentArea);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
