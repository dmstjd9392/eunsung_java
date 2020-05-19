package JavaEx;

public class SNail2 {
	int n1, n2;
	int[][] son;
	int val;	//수 증가
	int x, y; // x축, y축
	int dir; // 위치 +, -

	public SNail2(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		this.son = new int[n1][n2];
	}

	public void make() {
		x=0; 
		y=0;
		val=1;
		dir=0;		//방향:오른쪽(0), 아래(1), 왼쪽(2), 위(3)
		son[x][y]=val;
		
		while (val < n1 * n2) {
			// 오른쪽 이동
			if(dir==0) { 
				y++;
				if (y > n2 - 1 || son[x][y] > 0) {	//값 있거나, 최대 인덱스 초과
					y--;	//다시 이전 좌표로 복귀
					dir++;
				} else {
					val++;
					son[x][y] = val;
				}
			}
			//아래
			else if(dir==1) { 
				x++;
				if (x > n1 - 1 || son[x][y] > 0) {	//값 있거나, 최대 인덱스 초과
					x--;	//다시 이전 좌표로 복귀
					dir++;
				} else {
					val++;
					son[x][y] = val;
				}
			}
			//왼쪽
			else if(dir==2) { 
				y--;
				if (y <0 || son[x][y] > 0) {	//값 있거나, 최대 인덱스 초과
					y=y+1;	//다시 이전 좌표로 복귀
					dir++;
				} else {
					val++;
					son[x][y] = val;
				}
			}
			//위로
			else { 
				x--;
				if (x <0 || son[x][y] > 0) {	//값 있거나, 최대 인덱스 초과
					x++;	//다시 이전 좌표로 복귀
					dir=0; // 방향을 바꿀 경우, 다시 오른쪽으로
				} else {
					val++;
					son[x][y] = val;
				}
			}
			//
		}
	}

	public void print() {
		System.out.println();
		for (int i = 0; i < son.length; i++) {
			for (int j = 0; j < son.length; j++) {
				System.out.printf("%3d", son[i][j]);
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		SNail2 snail = new SNail2(7, 7);
		snail.make();
		snail.print();
	}
}