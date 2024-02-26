import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int[] arraySlice = new int[commands[i][1]-commands[i][0]+1];
            int index = 0;
            for(int j=commands[i][0]; j<=commands[i][1]; j++){
                arraySlice[index] = array[j-1];
                index++;
            }
            Arrays.sort(arraySlice);
            answer[i] = arraySlice[commands[i][2]-1];
        }

        return answer;
    }
}