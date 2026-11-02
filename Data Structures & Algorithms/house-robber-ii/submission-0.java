class Solution {
    public int s(int nums[],int start,int end){
       
        int prev=0;
        int prev2=0;
        for(int i=start;i<=end;i++){
            int curr=Math.max(prev,prev2+nums[i]);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int d=s(nums,0,n-2);
        int m=s(nums,1,n-1);
        return Math.max(d,m);
    }
}
