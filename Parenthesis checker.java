class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                if(!st.isEmpty()){
                    if((st.peek()=='('&&ch==')')||(st.peek()=='['&&ch==']')||(st.peek()=='{'&&ch=='}')){
                        st.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
