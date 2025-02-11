/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        
        if(root==null){
            return ans;
        }
        inOrder(root.left);
        ans.add(root.data);
        inOrder(root.right);
        return ans;
    }
}
