class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] b = my_string.split(" ");
        answer = Integer.parseInt(b[0]);
        for(int i=1; i<b.length-1; i++){
            if(b[i].equals("+")){
                answer+=Integer.parseInt(b[i+1]);
            }
            if(b[i].equals("-")){
                answer-=Integer.parseInt(b[i+1]);
            }
        }
        return answer;
    }
}