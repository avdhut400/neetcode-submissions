class Solution {
    public int numDecodings(String s) {
         int n=s.length();
        int dp[]=new int [n+1];

        if (n == 0 || s.charAt(0) == '0') return 0;
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int a=s.charAt(i-1)-'0';
            if(a>=1 && a<=9){
                dp[i]+=dp[i-1];
            }
            int b=Integer.parseInt(s.substring(i-2,i));
            if(b>=10 && b<=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
}
