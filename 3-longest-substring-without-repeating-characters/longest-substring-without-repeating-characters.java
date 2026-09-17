class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int l = 0;
        int n = s.length();

        HashSet<Character> hs = new HashSet<>();

        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);

            while (hs.contains(ch)) {
                hs.remove(s.charAt(l));
                l++;
            }

            hs.add(ch);

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}