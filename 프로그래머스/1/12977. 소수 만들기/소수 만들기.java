class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    boolean prime = true;
                    for (int s = 2; s < sum; s++) {
                        if (sum % s == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if (prime) {
                        answer++;
                    }

                }
            }
        }

        return answer;
    }
}