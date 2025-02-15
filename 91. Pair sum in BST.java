
/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        return search(list,target);
    }
    void inorder(Node root,ArrayList<Integer> list){
        if(root==null){
            return ;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    boolean search(ArrayList<Integer> list, int target){
        int left=0,right=list.size()-1;
        while(left<right){
            int sum = list.get(left)+list.get(right);
            if(sum==target){
                return true;
            }
            else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }
}
