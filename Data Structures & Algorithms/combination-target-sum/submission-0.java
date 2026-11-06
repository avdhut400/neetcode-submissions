class Solution {
    public void solve(int []nums,int i,List<Integer>curr,int target,List<List<Integer>>ans){
     
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i==nums.length){
            return;
        }
        if(target>=nums[i]){
            curr.add(nums[i]);
            solve(nums, i,curr,target-nums[i],ans);
            curr.remove(curr.size()-1);
        }
         
         solve(nums, i+1,curr,target,ans);


    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        int i=0;
        solve(nums, i,curr,target,ans);
        return ans;
    }
}
