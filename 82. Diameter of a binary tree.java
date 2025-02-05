class Solution {
    int max=0;
    int diameter(Node root) {
        // Your code here
        height(root);
        return max;
    }
    int height(Node node){
        if(node==null){
            return 0;
        }
            int leftt=height(node.left);
            int rightt=height(node.right);
            max=Math.max(max,leftt+rightt);
        return 1+Math.max(leftt,rightt);
    }
}

