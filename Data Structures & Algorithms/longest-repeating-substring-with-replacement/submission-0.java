class Solution {
    public int characterReplacement(String s, int k) {
        int maxf=0;
        int left=0;
        int max=0;
        int arr[]=new int[26];
        for(int r=0;r<s.length();r++){
            arr[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,arr[s.charAt(r)-'A']);
            int windowLen = r - left + 1;
            if(windowLen- maxf>k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            max=Math.max(max,r-left+1);

        }
        return max;
    }
}
