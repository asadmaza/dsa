class Solution {
    public boolean isAnagram(String s, String t) {
            // Check size of s to t, if mismatch, return false
            if(s.length() != t.length()){
                return false;
            }
            // create HashMap to store letters from string s
            HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
            // loop through string s
            for(int i = 0; i <s.length(); i++){
                // store character in c
                char c = s.charAt(i);
                // use HashMap.getOrDefault to add c
                // if c exists, retrieve value, if not, get default value 0 and increase by 1
                letters.put(c, letters.getOrDefault(c, 0)+1);
            }
            // loop through string t
            for(int i = 0; i < t.length(); i++){
                // store character in c
                char c = t.charAt(i);
                // if HashMap contains c
                if(letters.containsKey(c)){
                    // store value of HashMap key c in count
                    int count = letters.get(c);
                    if(count == 1){
                        letters.remove(c);
                    }
                    else{
                        letters.put(c, count -1);
                    }
                }
                else{
                    return false;
                }
            }
        // if letters is empty, all counts are balanced (0), so its an anagram
        return letters.isEmpty();
        }
    }