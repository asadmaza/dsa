class Solution {
    public boolean containsDuplicate(int[] nums) {
    // Declare numberSet - HashSet to store each Integer
    HashSet<Integer> numberSet = new HashSet<Integer>();
    // Loop - each value in nums int array
    for(int i=0; i<nums.length; i++){
        // if numberSet contains number, then there is a duplicate:
        // stop loop and return true -> there is a duplicate
        if(numberSet.contains(nums[i])){
            return true;
        }
        // else add the new number to the list and continue
        else{
            numberSet.add(nums[i]);
        }
    }
    // if end of loop is reached then return false -> there is no duplicate
    return false;
    }
}