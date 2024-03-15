//https://rocket-dev.co.kr/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EA%B0%9C%EC%9D%B8%EC%A0%95%EB%B3%B4%EC%88%98%EC%A7%91%EC%9C%A0%ED%9A%A8%EA%B8%B0%EA%B0%84-level1/
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        // 약관종류
        for (int i = 0; i < terms.length; i++) {
            map.put(terms[i].split(" ")[0], terms[i].split(" ")[1]);
        }
        //chat gpt의 가르침
        //.은 정규 표현식에서 "모든 문자"를 의미하는 메타 문자입니다.
        //문자열에서 .를 리터럴 문자로 사용하려면 이스케이프 처리가 필요합니다 (\.).
        //Java에서는 \ 자체도 이스케이프 처리가 필요해서 \\로 써야 합니다 (\\.).

        int year = Integer.parseInt(today.split("\\.")[0]);
        int month = Integer.parseInt(today.split("\\.")[1]);
        int day = Integer.parseInt(today.split("\\.")[2]);

        // 개인정보 수집일자
        for (int i = 0; i < privacies.length; i++) {
            String date = privacies[i].split(" ")[0];
            int type = Integer.parseInt(map.get(privacies[i].split(" ")[1]))*28;

            int num = (year - Integer.parseInt(date.split("\\.")[0]))*28*12
                    + (month - Integer.parseInt(date.split("\\.")[1]))*28
                    + (day - Integer.parseInt(date.split("\\.")[2]));

            if (num >= type) {
                list.add(i+1);
            }
        }

        return list.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
    }
}