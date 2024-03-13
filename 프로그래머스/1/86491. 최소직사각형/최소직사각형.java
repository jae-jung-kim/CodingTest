import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        //명함 번호의 작은 길이와 큰 길이를 나누고
        //작은 길이 중 가장 큰 길이랑 큰 길이 중 가장 큰 길이의 곱
        int[] maxArray = new int[sizes.length]; //큰 길이
        int[] minArray = new int[sizes.length]; //작은 길이
        for(int i=0; i<sizes.length; i++){ // 작은 길이 큰 길이 나누기 
            if(sizes[i][0]>sizes[i][1]){
                maxArray[i] = sizes[i][0];
                minArray[i] = sizes[i][1];
            }else{
                maxArray[i] = sizes[i][1];
                minArray[i] = sizes[i][0];
            }
        }
        Arrays.sort(maxArray);
        Arrays.sort(minArray);
        int max = maxArray[sizes.length - 1]; //큰 길이중 가장 큰 길이
        int min = minArray[sizes.length - 1]; //작은 길이중 가장 큰 길이
        return max*min;
    }
}