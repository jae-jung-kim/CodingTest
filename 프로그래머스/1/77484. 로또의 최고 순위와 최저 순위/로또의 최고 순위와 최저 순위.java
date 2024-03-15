class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int lottoCount = 0;
        int maxRank = 0;
        for (int i : lottos) {
            if (i == 0) {
                zeroCount++;
            }
        }
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (win_nums[i] == lottos[j]) {
                    lottoCount++;
                }
            }
        }
        maxRank = lottoCount + zeroCount;
        answer[0] = 7 - maxRank;
        answer[1] = 7 - lottoCount;
        if (answer[0] == 0) {
            answer[0] = 1;
        } else if (answer[0] == 7) {
            answer[0] = 6;
        }
        if (answer[1] == 0) {
            answer[1] = 1;
        } else if (answer[1] == 7) {
            answer[1] = 6;
        }
        return answer;
    }
}