
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
    void correctBST(Node root) {
        // code here.
        List<Node> list = new ArrayList<>();
        inorder(root,list);
        Node first=null,second = null;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).data>list.get(i+1).data){
                if(first==null){
                    first=list.get(i);
                }
                second=list.get(i+1);
            }
        }
        if(first!=null&&second!=null){
            int temp=first.data;
            first.data=second.data;
            second.data=temp;
        }
    }
    void inorder(Node root,List<Node> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }
}
