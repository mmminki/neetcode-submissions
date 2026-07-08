class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> charMap1 = new HashMap<>();
        Map<Character, Integer> charMap2 = new HashMap<>();

        for(char c : s.toCharArray()) {
            charMap1.put(c, charMap1.getOrDefault(c, 0) + 1);
        }
        
        for(char c : t.toCharArray()) {
            charMap2.put(c, charMap2.getOrDefault(c, 0) + 1);
        }
        
        if(charMap1.equals(charMap2)) return true;
        else return false;

    }
}
