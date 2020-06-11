package JavaEx;

public class GuGuDan {

	private int n; // [변수]:배열 크기 설정 수
	private int[][] arr; // [2중 배열변수]
	public int num; // [변수]:배열에 할당 할 수

	public GuGuDan(int n) { // [생성자]
		this.n = n;
		this.arr = new int[n][n];
		this.num = 1;
	}

	public void make() { // [메소드]:'구구단' 처리 로직
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				num = i * j;
				arr[i - 1][j - 2] = num;
			}
		}
	}

	public void print() { // [메소드]:출력 로직
		System.out.print("구구단");
		for (int t = 0; t < arr.length - 1; t++) { // 맨 위 타이틀
			System.out.print("(" + (t + 2) + ")");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print("(" + (i + 1) + ")"); // 왼쪽 타이틀
			for (int j = 0; j < arr.length - 1; j++) {// 구구단 내부
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		GuGuDan gu = new GuGuDan(9); // [객체 생성]
		gu.make(); // [메소드] 출력
		gu.print(); // [메소드] 출력
	}
}