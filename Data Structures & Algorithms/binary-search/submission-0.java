class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                l++;
            }else{
                r--;
            }
        }
        return -1;
    }
}
