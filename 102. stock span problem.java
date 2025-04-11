class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        int n = arr.length,span =0;
        Deque<Integer> s = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                span = i+1;
            }else{
                span = i-s.peek();
            }
            res.add(span);
            s.push(i);
        }
        return res;
    }
}
