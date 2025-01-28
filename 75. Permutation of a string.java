class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        Set<String> ans = new HashSet();
        boolean[] visit = new boolean[s.length()];
        permutations(s, ans , "" , visit);
        return new ArrayList(ans);
    }
    
    static void permutations(String s, Set<String> ans, String curr,boolean[] visit ){
        if(curr.length()==s.length()){
            ans.add(curr);
            return;
        }
        for(int i=0;i<s.length();i++){
            if(!visit[i]){
                visit[i]=true;
                permutations(s,ans,curr+s.charAt(i),visit);
                visit[i]=false;
            }
        }
    }
}
