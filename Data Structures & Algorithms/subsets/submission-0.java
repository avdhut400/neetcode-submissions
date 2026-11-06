class Solution {
    public void solve(int[]nums,int i,List<Integer> curr,List<List<Integer>>ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        curr.add(nums[i]);
        solve(nums,i+1,curr,ans);
        curr.remove(curr.size()-1);
        solve(nums,i+1,curr,ans);
    
        
    }
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>>ans=new ArrayList<>();
         int i=0;
         List<Integer>curr=new ArrayList<>();
         solve(nums,i,curr,ans);
         return ans;

    }
}
