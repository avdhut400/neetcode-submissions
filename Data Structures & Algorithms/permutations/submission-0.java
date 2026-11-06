class Solution {
     private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
     private void backtrack(int i, int[] nums, List<List<Integer>> result) {
        
        
        if (i == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            result.add(temp);
            return;
        }

        for (int j = i; j < nums.length; j++) {
    
            swap(nums, i, j);


            backtrack(i + 1, nums, result);

        
            swap(nums, i, j);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, result);
        return result;
    }
}
