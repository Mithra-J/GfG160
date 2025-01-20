class Solution {
    Node reverseList(Node head) {
        // code here
        Node cur=head , prev=null,next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}
