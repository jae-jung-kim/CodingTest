import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main
{
	static boolean visited[];
	static ArrayList<Integer> A[];
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		A = new ArrayList[n+1]; //배열 0번 인덱스 쓰면 헷갈려서, 연결하기 전에 인접리스트 설정
		visited = new boolean[n+1];
		for(int i=1; i<n+1; i++) {
			A[i] = new ArrayList<Integer>();//인접리스트에 연결할 인접리스트 설정
		}
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s); //양쪽방향 모두 add  
		}
		int count = 0;
		for(int i=1; i<n+1; i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	private static void DFS(int v) {
		// TODO Auto-generated method stub
		if(visited[v]) {
			return;
		}
		visited[v]=true;
		for(int i:A[v]) {//인접리스트에 add된 애들 탐색
			if(visited[i]==false) {
				DFS(i);
			}
		}
		
	}
	
}