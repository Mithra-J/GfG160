class Solution {
    public static void removeLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (slow != fast) {
            return;
        }
        slow = head;
        Node prev = null; 
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        while (fast.next != slow) {
            fast = fast.next;
        }
        fast.next = null;
    }
}
