class Solution {
    public Node cloneLinkedList(Node head) {
        if (head == null) return null;

        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            Node clone = new Node(curr.data);
            curr.next = clone;
            clone.next = temp;
            curr = temp;
        }

        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        Node clonedHead = head.next;
        Node cloneCurr = clonedHead;
        while (curr != null) {
            curr.next = curr.next.next;
            if (cloneCurr.next != null) {
                cloneCurr.next = cloneCurr.next.next;
            }
            curr = curr.next;
            cloneCurr = cloneCurr.next;
        }

        return clonedHead;
    }
}
