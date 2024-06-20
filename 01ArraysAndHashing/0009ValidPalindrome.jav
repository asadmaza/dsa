class Solution {
    public boolean isPalindrome(String s) {
        // initialise two pointers for left and right side
        int l = 0;
        int r = s.length() - 1;
        // while l is less than r
        while(l < r){
            // if left pointer character is not alphanumeric
            if(!Character.isLetterOrDigit(s.charAt(l))){
                // increment left pointer and skip the rest of the statements in the while loop and start at beginning of while loop
                l++;
                continue;
            }
            // if right pointer character is not alphanumeric
            if(!Character.isLetterOrDigit(s.charAt(r))){
                // decrement right pointer and skip the rest of the statements in the while loop and start at beginning of while loop
                r--;
                continue;
            }
            // once this statement is executed, it means that left and right pointer characters are alphanumeric
            // if they don't match it's not a valid palindrome
            if(Character.toLowerCase(s.charAt(r)) != Character.toLowerCase(s.charAt(l))){
                // return false
                return false;
            }
            // if this statement executes means that the left and right characters are alphanumeric and they match
            // increment left pointer, decrement right pointer
            l++;
            r--;
        }
        // loop is completed when l == r
        // true is returned because word is palindrome
        return true;
    }
}