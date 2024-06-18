class Solution {
    public int longestConsecutive(int[] nums) {
        // if nums is empty, return 0
        if(nums.length == 0){
            return 0;
        }
        // Create Hashset to store unique integers in nums array
        HashSet<Integer> set = new HashSet<>();
        // Loops through num array and add unique intger num to set if not in set
        for(int num: nums){
            set.add(num);
        }
        // Create longest to store result that will be returned to method for longest sequence found             
        int longest = 1;
        // Iterate through nums array
        for(int num : nums){
            // if current number is the start of the sequence
            if(!set.contains(num -1)){
                // Count current streak using current num
                int count = 1;
                // Increment count (streak) as long as consequentive elements are in set
                while(set.contains(num+1)){
                    num++; // increment num to check next num in sequence
                    count++; // increment count to increase length of streak
                }
                // Update longest streak
                longest = Math.max(count, longest);
            }
        }
        // Return length of longest sequence     
        return longest;
        }
   }