import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class Point {
		int row;
		int col;

		public Point(int row, int col) {
			super();
			this.row = row;
			this.col = col;
		}
	}

	static Point king;
	static Point stone;
	static int N;
	static int dir[][] = {{0, 1},{0,-1},{1,0},{-1,0},{-1,1},{-1,-1},{1,1},{1,-1}};
	//문제에 주어진 명령어 순서 그대로 작성
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String kingPoint = st.nextToken();
		String stonePoint = st.nextToken();
		N = Integer.parseInt(st.nextToken());

		//문제에서 제기된 좌표위치 방식을 좌측 상단이 0,0 우측하단이 r,c 가 되도록 변경
		int row = 8-((int) kingPoint.charAt(1)-48);
		int col = (int) kingPoint.charAt(0) - 65;
		king = new Point(row, col);

		row = 8-((int) stonePoint.charAt(1)-48);
		col = (int) stonePoint.charAt(0) - 65;
		stone = new Point(row, col);

		for (int i = 0; i < N; i++) {
			String op = br.readLine();
			int d = -1;
			switch (op) {
			case "R": {
				d = 0;
				break;
			}
			case "L": {
				d = 1;
				break;
			}
			case "B": {
				d = 2;
				break;
			}
			case "T": {
				d = 3;
				break;
			}
			case "RT": {
				d = 4;
				break;
			}
			case "LT": {
				d = 5;
				break;
			}
			case "RB": {
				d = 6;
				break;
			}
			case "LB": {
				d = 7;
				break;
			}
			}
			
			//명령어를 실행한 후 이동된 king의 위치를 미리 저장
			int krow = king.row+dir[d][0];
			int kcol = king.col+dir[d][1];
			if(isRange(krow, kcol)) { //체스판을 벗어나는지 확인
				if(krow == stone.row && kcol == stone.col) { //이동한 킹의 위치가 돌의 위치와 같을때 돌의 위치를 이동시켜야함
					int srow = stone.row+dir[d][0];
					int scol = stone.col+dir[d][1];
					if(isRange(srow, scol)) { //돌의 위치가 체스판을 벗어난다면 킹도 돌도 이동시키지 않음
//						System.out.println("둘다 바뀜");
						king.row = krow;
						king.col = kcol;
						stone.row = srow;
						stone.col = scol;
					}else {
//						System.out.println("돌이 범위를 넘어서 패스");
					}
				}else {
//					System.out.println("킹만 바뀜");
					king.row = krow;
					king.col = kcol;
				}
			}else {
//				System.out.println("킹이 범위를 넘어서 패스");
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append((char)(king.col+65)).append(8-king.row).append("\n");
		sb.append((char)(stone.col+65)).append(8-stone.row).append("\n");
		System.out.println(sb.toString());
	}

	private static boolean isRange(int r, int c) {
		return r >=0 && r < 8 && c >=0 && c < 8;
	}

}