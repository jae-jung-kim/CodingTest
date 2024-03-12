class Solution {
    public boolean solution(String s) {
        char[] sChar = s.toCharArray();
        for (char c : sChar) {
            if (c < 48 || c > 57) {
                return false;
            }
        }
        return s.length() == 4 || s.length() == 6;
    }
}