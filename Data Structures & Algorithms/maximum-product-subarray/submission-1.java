class Solution {
     static int max(int a ,int b ,int c){
        return Math.max(a,Math.max(b,c));
    }
     static int min(int a ,int b ,int c){
        return Math.min(a,Math.min(b,c));
    }
    public int maxProduct(int[] nums) {
        int maxprod=nums[0];
        int minprod=nums[0];
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp=max(nums[i],maxprod*nums[i],minprod*nums[i]);
            minprod=min(nums[i],maxprod*nums[i],minprod*nums[i]);
            maxprod=temp;
            curr=Math.max(curr,maxprod);
        }

        return curr;
    }

}
