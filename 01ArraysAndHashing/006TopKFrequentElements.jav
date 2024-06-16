class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create HashMap  numMap to count frequency of each unique number
        HashMap<Integer, Integer> numMap = new HashMap<>();
        // Create array of lists to group numbers by frequency
        List<Integer> bucket[] = new ArrayList[nums.length + 1];

        // Count frequency of each num in nums
        for(int num: nums){
            // merge function that adds 1 to value for num (key) if it doesn't exist, if it does it adds 1 to existing value
            numMap.merge(num, 1, Integer::sum);
        }

        // Fill bucket array where index is frequency, value is list of numbers with that frequency
        for (int key: numMap.keySet()){
            int freq = numMap.get(key);
            if (bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        
        // initialise index and ans array to return k most frequent elements
        int index = 0;
        int[] ans = new int[k];        
        // Loop through bvucket array from highest frequency to lowest
        for(int i = nums.length; i >= 0 && index <k; i--){
            if (bucket[i] !=null){ // if num exists at ith index (exists with frequency)
            // loop through bucket and return res array
            for(int val : bucket[i]){
                ans[index++] = val;
                if(index == k){
                    return ans; // Return when k elements are in ans array
                    }
                }
            }
        }
        return ans; // Return ans array
    }
}