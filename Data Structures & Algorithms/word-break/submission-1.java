class Solution {
    public boolean solve(String s,int i,List<String> w, Boolean[] dp ){
        if(i==s.length()){
            return true;
        }
        if (dp[i] != null) {
            return dp[i];
        }

        for(int j=i+1;j<=s.length();j++){
            String word=s.substring(i,j);
            if(w.contains(word)){
                if(solve(s,j,w,dp)){
                    dp[i] = true;
                    return true;
                }
            }
        }
        dp[i] = false;
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];

        return solve(s,0,wordDict,dp);
    }
}
