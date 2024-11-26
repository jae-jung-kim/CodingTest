class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] num_char = num_str.toCharArray();
        for(int i=0; i<num_char.length; i++){
            answer+= num_char[i]-'0';
        }
        return answer;
    }
}