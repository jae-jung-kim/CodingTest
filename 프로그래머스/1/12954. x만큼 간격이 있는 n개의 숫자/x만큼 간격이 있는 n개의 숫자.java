class Solution {
    public long[] solution(int x, int n) {
        long[] answers = new long[n];
        long mul = x;
        long mulIndex = 1;
        for(int i=0; i<n; i++){
            answers[i] = mul*mulIndex;
            mulIndex++;
        }
        return answers;
    }
}