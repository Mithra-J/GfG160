
/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int sumK(Node root, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        return count(root,0,k,map);
    }
    private int count(Node node,int sum,int k,HashMap<Integer,Integer> map){
        if(node==null){
            return 0;
        }
        sum+=node.data;
        int path=map.getOrDefault(sum-k,0);
        map.put(sum,map.getOrDefault(sum,0)+1);
        path+=count(node.left,sum,k,map);
        path+=count(node.right,sum,k,map);
        map.put(sum,map.get(sum)-1);
        return path;
    }
}
