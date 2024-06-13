class Solution {
    public int[] getConcatenation(int[] nums) {
        // declare and instantiate ans array with twice length of nums array
        int[] ans = new int[2*nums.length];
        // loop through nums once
        for(int i = 0; i < nums.length; i++){
            // for each value in nums, add from beginning and halfway through ans
            ans[i] = nums[i];
            ans[nums.length + i] = nums[i];
        }
    // return ans array
    return ans;      
    }
}