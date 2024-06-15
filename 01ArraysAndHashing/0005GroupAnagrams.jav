// Best solution with Time Complexity O(M*N*26) => O(M*N) where N is average length of input string, M is number of input strings
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ans = new HashMap<>();

        for (String str : strs) {
            int[] charCount = new int[26];

            for (char c : str.toCharArray()) {
                charCount[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(charCount[i]);
            }
            String key = sb.toString();
            
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(str);
        }

        return new ArrayList<>(ans.values());
    }
}


// Alternate solution with O(M*NLogN) Time complexity where N is average length of input string, M is number of input strings
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create HashMap (stringListMap) where key:value are sorted word (string) and list of strings that are anagrams
        HashMap<String, List<String>> stringListMap = new HashMap<>();
        // loop for each word in strs list
        for(String word : strs){
            // convert each word into array of characters
            char[] charArray = word.toCharArray();
            // sort characters in array
            Arrays.sort(charArray);
            // Convert sorted character array into sorted word
            String sortedWord = new String(charArray);
            // check if sorted word is already key in stringListMap
            if(!stringListMap.containsKey(sortedWord)){
                // if not in list, add it as key and initialise value with empty array list
                stringListMap.put(sortedWord, new ArrayList<>());
            }
            // add original word to list for key (sortedWord)
            stringListMap.get(sortedWord).add(word);
        }
        // Return new list containing all values in stringListMap
        return new ArrayList<>(stringListMap.values());
        }
    }
