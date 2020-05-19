package JavaEx;

public class SNail2 {
	int n1, n2;
	int[][] son;
	int val;	//�� ����
	int x, y; // x��, y��
	int dir; // ��ġ +, -

	public SNail2(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		this.son = new int[n1][n2];
	}

	public void make() {
		x=0; 
		y=0;
		val=1;
		dir=0;		//����:������(0), �Ʒ�(1), ����(2), ��(3)
		son[x][y]=val;
		
		while (val < n1 * n2) {
			// ������ �̵�
			if(dir==0) { 
				y++;
				if (y > n2 - 1 || son[x][y] > 0) {	//�� �ְų�, �ִ� �ε��� �ʰ�
					y--;	//�ٽ� ���� ��ǥ�� ����
					dir++;
				} else {
					val++;
					son[x][y] = val;
				}
			}
			//�Ʒ�
			else if(dir==1) { 
				x++;
				if (x > n1 - 1 || son[x][y] > 0) {	//�� �ְų�, �ִ� �ε��� �ʰ�
					x--;	//�ٽ� ���� ��ǥ�� ����
					dir++;
				} else {
					val++;
					son[x][y] = val;
				}
			}
			//����
			else if(dir==2) { 
				y--;
				if (y <0 || son[x][y] > 0) {	//�� �ְų�, �ִ� �ε��� �ʰ�
					y=y+1;	//�ٽ� ���� ��ǥ�� ����
					dir++;
				} else {
					val++;
					son[x][y] = val;
				}
			}
			//����
			else { 
				x--;
				if (x <0 || son[x][y] > 0) {	//�� �ְų�, �ִ� �ε��� �ʰ�
					x++;	//�ٽ� ���� ��ǥ�� ����
					dir=0; // ������ �ٲ� ���, �ٽ� ����������
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