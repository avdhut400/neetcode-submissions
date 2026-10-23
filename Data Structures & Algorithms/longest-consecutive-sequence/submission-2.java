class Solution {
    // public boolean check(int []nums,int n){
    //     for(int k:nums){
    //         if(k==n){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public int longestConsecutive(int[] nums) {
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     int curr=nums[i];
        //     int count=1;
        //     while(check(nums,curr+1)){
        //         curr=curr+1;
        //         count=count+1;
        //     } 
        //     max=Math.max(max,count);
        // }
        // return max;



        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        for (int num : set) {
            
            if (!set.contains(num - 1)) {
                int curr = num;
                int count = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}






