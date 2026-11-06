class Solution {
    public void solve(int[] candidates, int target,int i, List<List<Integer>>ans,List<Integer> curr){
       
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
         if(i==candidates.length){
            return;
        }
        if(target>=candidates[i]){
            curr.add(candidates[i]);
            solve(candidates,target-candidates[i],i+1,ans,curr);
            curr.remove(curr.size()-1);
        }
        i=i+1;
        while(i<candidates.length && candidates[i]==candidates[i-1]){
            i++;
        }
         solve(candidates,target,i,ans,curr);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        int i=0;
        solve(candidates,target,i,ans,curr);
        return ans;
    }
}
