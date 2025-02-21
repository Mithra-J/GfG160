class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        ArrayList<Double> median=new ArrayList<>();
        for(int i:arr){
            if(maxheap.isEmpty()||i<maxheap.peek()){
                maxheap.offer(i);
            }else{
                minheap.offer(i);
            }
            if(maxheap.size()>minheap.size()+1){
                minheap.offer(maxheap.poll());
            }else if (minheap.size()>maxheap.size()){
                maxheap.offer(minheap.poll());
            }
            double m;
            
            if(maxheap.size()==minheap.size()){
                m=(maxheap.peek()+minheap.peek())/2.0;
            }else{
                m=maxheap.peek();
            }
            median.add(m);
        }
        return median;
    }
}
