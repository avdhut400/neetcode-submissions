class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max=0;
        int left=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max, r - left + 1);
        }
        return max;
    }
}
