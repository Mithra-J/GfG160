/*
class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}
*/

class Solution {
    static int preIndex = 0; 

    public static Node buildTree(int inorder[], int preorder[]) {
        preIndex = 0; 
        int n = inorder.length; 
        
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            inorderMap.put(inorder[i], i);
        }
        
        return constructTree(preorder, inorderMap, 0, n - 1);
    }

    private static Node constructTree(int[] preorder, Map<Integer, Integer> inorderMap, int start, int end) {
    
        if (start > end) return null;
        
        int rootValue = preorder[preIndex++];
        Node root = new Node(rootValue);
        if (start == end) return root;
        int inorderIndex = inorderMap.get(rootValue);
        root.left = constructTree(preorder, inorderMap, start, inorderIndex - 1);
        root.right = constructTree(preorder, inorderMap, inorderIndex + 1, end);
        
        return root;
    }
    public static void postorderTraversal(Node root, List<Integer> result) {
        if (root == null) return;
        postorderTraversal(root.left, result);
        postorderTraversal(root.right, result);
        result.add(root.data);
    }
    public static List<Integer> getPostorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversal(root, result);
        return result;
    }
}
