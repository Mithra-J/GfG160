class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr){
            maxheap.offer(i);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(maxheap.poll());
        }
        return res;
    }
}
