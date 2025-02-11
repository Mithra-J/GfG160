
/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    int max=Integer.MIN_VALUE;
    // Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node node) {
        // your code goes here
        calculateMax(node);
        return max;
    }
    int calculateMax(Node node){
        if(node==null){
            return 0;
        }
        int leftsum=Math.max(0,calculateMax(node.left));
        int rightsum=Math.max(0,calculateMax(node.right));
        max=Math.max(max,leftsum+rightsum+node.data);
        return node.data+Math.max(leftsum,rightsum);
    }
}
