package JavaEx;

public class GuGuDan {

	private int n; // [����]:�迭 ũ�� ���� ��
	private int[][] arr; // [2�� �迭����]
	public int num; // [����]:�迭�� �Ҵ� �� ��

	public GuGuDan(int n) { // [������]
		this.n = n;
		this.arr = new int[n][n];
		this.num = 1;
	}

	public void make() { // [�޼ҵ�]:'������' ó�� ����
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				num = i * j;
				arr[i - 1][j - 2] = num;
			}
		}
	}

	public void print() { // [�޼ҵ�]:��� ����
		System.out.print("������");
		for (int t = 0; t < arr.length - 1; t++) { // �� �� Ÿ��Ʋ
			System.out.print("(" + (t + 2) + ")");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print("(" + (i + 1) + ")"); // ���� Ÿ��Ʋ
			for (int j = 0; j < arr.length - 1; j++) {// ������ ����
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		GuGuDan gu = new GuGuDan(9); // [��ü ����]
		gu.make(); // [�޼ҵ�] ���
		gu.print(); // [�޼ҵ�] ���
	}
}