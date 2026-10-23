class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i+1;j<nums.length;j++){
                sum=nums[j]+nums[i];
                if(sum==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
