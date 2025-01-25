class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        Node slow=head, fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(slow!=fast){
            return null;
        }
        while(head!=slow){
            slow=slow.next;
            head=head.next;
        }
        return head;
    }
}
