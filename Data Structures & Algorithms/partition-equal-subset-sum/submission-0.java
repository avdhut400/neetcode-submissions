class Solution {
     public boolean solve(int[] nums, int i, int target,Boolean[][] memo) {
        if(target==0) return true;
        if(i==nums.length || target<0) return false;
         if (memo[i][target] != null) {
            return memo[i][target];
        }

        boolean include = solve(nums, i + 1,
                                target - nums[i], memo);

        boolean exclude = solve(nums, i + 1,
                                target, memo);

        memo[i][target] = include || exclude;

        return memo[i][target];

    }
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int n:nums){
            total+=n;
        }
        if(total%2!=0){
            return false;
        }
        int target=total/2;
        Boolean dp[][]=new Boolean[nums.length][target+1];
        return solve(nums,0,target,dp);
    }
}