class Solution {
    public int l(String s,int start,int end){
        int count=0;
        int left=start;
        int right=end;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;

    }
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count+=l(s,i,i);
            count+=l(s,i,i+1);
        }
        return count;
    }
}