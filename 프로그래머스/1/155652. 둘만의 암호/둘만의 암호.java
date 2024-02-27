import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        ArrayList<Character> alphabet = new ArrayList<Character>(
                Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        char[] skipChar = skip.toCharArray();
        for(char c:skipChar){
            alphabet.remove(Character.valueOf(c));
        }
        char[] sChar = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            int sIndex = alphabet.indexOf(s.charAt(i));
            int nextIndex = (sIndex+index)%alphabet.size();
            answer += alphabet.get(nextIndex);
        }
        return answer;
    }
}