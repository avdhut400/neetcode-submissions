class Solution {
    public int l(String s,int start,int end){
        int left=start;
        int right=end;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;

    }
    public String longestPalindrome(String s) {
         int start =0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int st1=l(s,i,i);
            int st2=l(s,i,i+1);
            int len=Math.max(st2,st1);
            if(len>end-start+1){
                start=i-(len-1)/2;
                end=i+(len/2);
            }
           
        }
        return s.substring(start,end+1);
    }
}
