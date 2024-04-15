
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
            1. 추천 받기 전, 게시판은 비어있음
            2. 일단 추천을 받으면 게시판에 올라감
            3. 게시판이 꽉 찬 경우? 게시판에 추천받은 횟수가 가장 적은 학생 사진 삭제 -> 추천받은 횟수가 같으면
                게시된지 가장 오래된 사진부터 삭제
            4. 이미 게시판에 있는 학생이 추천 받으면? 추천수 ++
            5. 게시판에 걸려있는 학생사진이 삭제되면? 추천수 0
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Student students[] = new Student[101];
        List<Student> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        int total = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<total; i++){
            int num = Integer.parseInt(st.nextToken());
            //1. 처음 추천 받은 학생이라면
            if(students[num]==null){
                students[num] = new Student(num,0,0,false);
            }

            //2. 이미 게시된 경우 추천수++
            if(students[num].isPosted){
                students[num].cnt++;
            }

            //3. 게시된 적 없음
            else{
                if(list.size()==N){
                    Collections.sort(list, new Comparator<Student>(){
                        public int compare(Student o1, Student o2){
                            if(o1.cnt==o2.cnt){
                                return o1.time-o2.time;
                            }
                            return o1.cnt - o2.cnt;
                        }
                    });
                    list.get(0).isPosted=false;
                    list.remove(0);
                }
                students[num].cnt=1;
                students[num].time=i;
                students[num].isPosted=true;
                list.add(students[num]);
            }
        }

        Collections.sort(list,(o1,o2)->o1.idx-o2.idx);
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i).idx).append(" ");
        }
        System.out.println(sb);
    }

    static class Student{
        int idx; //학생 번호
        int cnt; //추천수
        int time; //입력받은 순서
        boolean isPosted; //게시판에 게재되었는가?

        public Student(int idx, int cnt, int time, boolean isPosted) {
            this.idx = idx;
            this.cnt = cnt;
            this.time = time;
            this.isPosted = isPosted;
        }
    }
}