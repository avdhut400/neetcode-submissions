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


//Brute force



class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] arr = new int[26];
            int maxf = 0;

            for (int j = i; j < s.length(); j++) {
                arr[s.charAt(j) - 'A']++;

                maxf = Math.max(
                    maxf,
                    arr[s.charAt(j) - 'A']
                );

                int len = j - i + 1;

                if (len - maxf <= k) {
                    max = Math.max(max, len);
                }
            }
        }

        return max;
    }
}
