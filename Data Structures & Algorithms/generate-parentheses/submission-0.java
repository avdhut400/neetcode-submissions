class Solution {
    public void solve(int n,int open ,int close,String s,List<String> ans){
        if(close==n && open==n){
            ans.add(s);
        }
        if(open<n){
            solve(n, open+1, close, s+"(", ans);
        }
         if(close<open){
            solve(n, open, close+1, s+")", ans);
        }
    }
    public List<String> generateParenthesis(int n) {
         List<String> ans = new ArrayList<>();

        solve(n, 0, 0, "", ans);

        return ans;
    }
}