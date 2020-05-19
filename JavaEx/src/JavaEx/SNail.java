package JavaEx;

public class SNail {
	int n1, n2;
	int[][] son;
	int son_1st=1;
	int x=0, y=-1;	//x축, y축
	int d=1;	//위치 +, -

	public SNail(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		son = new int[n1][n2];
	}

	public void make() {	
		while(true) {
			for(int i=0; i<n1; i++) {
				y=y+d;
				son[x][y]=son_1st;
				son_1st++;
			}
			
			n1--;
			
			for(int i=0; i<n1; i++) {
				x=x+d;
				son[x][y]=son_1st;
				son_1st=son_1st+1;
			}
			
			if(n1==0) {
				break;
			}			
			d=d*(-1);
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

	// main 메소드
	public static void main(String[] args) {
		SNail snail = new SNail(7, 7);
		snail.make();
		snail.print();
	}
}