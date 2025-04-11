class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            res.add(-1);
        }
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&arr[i]>arr[s.peek()]){
                int index = s.pop();
                res.set(index,arr[i]);
            }
            s.push(i);
        }
        return res;
    }
}
