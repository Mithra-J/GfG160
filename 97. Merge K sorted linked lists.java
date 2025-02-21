class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        PriorityQueue<Node> minheap = new PriorityQueue<>((a,b)->Integer.compare(a.data,b.data));
        for(Node i:arr){
            minheap.add(i);
        }
        Node temp=new Node(0);
        Node tail= temp;
        while(!minheap.isEmpty()){
            Node min = minheap.poll();
            tail.next=min;
            tail=tail.next;
            if(min.next!=null){
                minheap.add(min.next);
            }
        }
        return temp.next;
    }
}
