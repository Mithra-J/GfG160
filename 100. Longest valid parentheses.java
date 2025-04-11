class Solution {
    static int maxLength(String s) {
        Stack<Integer> st = new Stack<>();
        int maxLength = 0;
        st.push(-1); 

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(i); 
            } else {
                if (!st.isEmpty()) {
                    st.pop(); 
                }

                if (!st.isEmpty()) {
                    int length = i - st.peek();
                    maxLength = Math.max(maxLength, length);
                } else {
                    st.push(i);
                }
            }
        }
        return maxLength;
    }
}
