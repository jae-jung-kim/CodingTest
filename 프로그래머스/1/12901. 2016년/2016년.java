class Solution {
    public String solution(int a, int b) {
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"}; //금요일이 1월1일이니까 day[1]에 금요일 넣고 순서대로 넣기
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int totalDay = 0;
        for(int i=0; i<a-1; i++){
            totalDay += month[i]; //a달 전까지 모든 day를 더해줌
        }
        totalDay += b; //a달의 day를 더해줌
        String answer = day[totalDay%7]; //일주일로 나눠서 나머지에 따라 요일 계산

        return answer;
    }
}