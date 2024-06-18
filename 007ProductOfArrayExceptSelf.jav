class Solution {
    public int[] productExceptSelf(int[] nums) {
        // create res array with length of nums to hold final result
        int[] res = new int[nums.length];
        // create temporary
        int left = 1;
        int right = 1;

        // loop from left to right over nums and res arrays
        for(int i = 0; i<nums.length; i++){
            // at i = 0 store 1, else store current left value
            res[i] = left;
            // update left value to be equal to current left value
            // multiplied by current value of nums
            left = left * nums[i];
        }
        
        // loop from right to left over nums and res array
        for(int i = nums.length - 1; i >= 0; i--){
            // multiply current res with right value
            res[i] = res[i] * right;
            // update right value by multiplying with current nums value
            right = right * nums[i];
        }
        // return result array
        return res;

        
        
    }
}