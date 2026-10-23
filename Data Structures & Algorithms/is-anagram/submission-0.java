class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        char[] arr = s.toCharArray();
        char[] op=t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(op);
        return Arrays.equals(arr,op);
    }
}
