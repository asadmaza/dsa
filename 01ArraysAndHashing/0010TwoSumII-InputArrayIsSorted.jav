class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // create a left and right pointer to start at each end of int array, numbers
        int l = 0;
        int r = numbers.length-1;
        // create res array to store result
        int[] res = new int[2];
        // while l is less than r
        while(l < r){
            // if value of left pointer is equal to value of right we have found
            // the correct combination of values to sum to target
            if(numbers[l] + numbers[r] == target){
                // before returning res, add 1 as per problem spec
                res[0] = l+1;
                res[1] = r+1;
                return res; 
            }
            // as array is sorted in increasing (non-decreasing ) order
            // if sum of pointers is greater than target, decrement right pointer
            if(numbers[l] + numbers[r] > target){
                r--;
            
            }
            // if sum of pointers is greater than target, increment left pointer
            if(numbers[l] + numbers[r] < target){
                l++;
            }
            
        }
        // this shouldn't execute, if it does [0,0] is returned
        return res;
    }
}