class Solution {
    public void find(int[] nums,int index,List<List<Integer>> ans, List<Integer> p){
        if(index==nums.length){
            ans.add(new ArrayList<>(p));
            return ;
        }
        p.add(nums[index]);
        find( nums,index+1,ans,p);
        p.remove(p.size()-1);
        while(index+1<nums.length && nums[index+1]==nums[index]){
            index++; 
        }
        find(nums,index+1,ans,p);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
          Arrays.sort(nums);
        int index=0;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> p=new ArrayList<>();
        find(nums,index,ans,p);
        return ans;
    }
}
