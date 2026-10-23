class Solution {
     public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int arr[] =new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int n:arr){
            if(n!=0){
                return false;
            }
        }
        return true;
        
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();
        boolean[]visited=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visited[i]){
                continue;
            }
            List<String>group=new ArrayList<>();
            group.add(strs[i]);
            visited[i]=true; 

            
            for(int j=i+1;j<strs.length;j++){
                if(!visited[j]&&isAnagram(strs[i],strs[j])){
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }
            ans.add(group);
        }
        return ans;
    }
}
