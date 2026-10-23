class Solution {
    public int[] twoSum(int[] n, int target) {
        int l=0;
        int r=n.length-1;
        int sum=0;
        while(l<r){
            sum=n[l]+n[r];
            if(sum==target){
                return new int []{l+1,r+1};
            }else if(sum<target){
                l++;
            }else{
                r--;
            }
        }
          return new int[]{-1, -1};
  

    }
}
