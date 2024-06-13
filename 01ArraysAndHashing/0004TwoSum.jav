class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create map to store each num in nums with index map -> num : index
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // create ans to store 2 indices
        int[] ans = new int[2];
        // loop through each num in nums
        for(int i = 0; i < nums.length; i++){
            // store difference between target and current num
            int difference = target - nums[i];
            // if the difference (first num) exists
            if(map.containsKey(difference)){
                // add first num to ans index 0
                ans[0] = map.get(difference);
                // add current num to ans index 1
                ans[1] = i;
                // found two nums that match target so return
                return ans;
            }
            else{
                // if it doesn't exist, add to map
                map.put(nums[i], i);
            }
        }
        // return empty array (should not happen as two nums are guaranteed)
        return ans;
    }
}