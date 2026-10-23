class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int [nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int pro=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             pro*=nums[j];
        //         }
        //     }

        //     ans[i] = pro;
        // }
        // return ans;
        int n = nums.length;
        int s[]=new int[n];
        s[0]=1;
        for(int i=1;i<nums.length;i++){
            s[i]=s[i-1]*nums[i-1];
        }
        // int s[]=new int[n];
        // s[0]=1;
        // for(int i=1;i<nums.length;i++){
        //     s[i]=s[i-1]*nums[i-1];
        // }
        int suffix[]=new int [n];
        suffix[n-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
         for(int i=0;i<nums.length;i++){
            ans[i]=suffix[i]*s[i];
        }
        return ans;


    }
}  
