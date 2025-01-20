class Solution {
    public Node rotate(Node head, int k) {
    
        Node current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        k = k % length;
        if (k == 0) { 
            return head;
        }
        current.next = head;
        
        Node newTail = head;
        for (int i = 1; i < k; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
