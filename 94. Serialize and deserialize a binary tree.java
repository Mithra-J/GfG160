
/*Complete the given function
Node is as follows:
class Tree{
    int data;
    Tree left,right;
    Tree(int d){
        data=d;
        left=right=null;
    }
}*/


class Tree {
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        serializeHelper(root, list);
        return list;
    }
    private void serializeHelper(Node root, ArrayList<Integer> list) {
        if (root == null) {
            list.add(-1); 
            return;
        }
        list.add(root.data);
        serializeHelper(root.left, list);
        serializeHelper(root.right, list);
    }
    public Node deSerialize(ArrayList<Integer> arr) {
        Queue<Integer> queue = new LinkedList<>(arr);
        return deserializeHelper(queue);
    }
    private Node deserializeHelper(Queue<Integer> queue) {
        int val = queue.poll();
        if (val == -1) return null; 

        Node node = new Node(val);
        node.left = deserializeHelper(queue);
        node.right = deserializeHelper(queue);
        return node;
    }
}
