package JavaEx;

import java.util.Scanner;

public class SNailReview {
	int[][] arr; // 배열 변수
	int num = 1; // 숫자 데이터
	int n; // 배열 크기 수
	int x = 0, y = -1; // 위치
	int d = 1; // 방향

	public SNailReview(int n) {
		arr = new int[n][n];
		this.n = n;
	}

	public void make() {
		while (true) {
			for (int i = 0; i < n; i++) {
				y = y + d;
				arr[x][y] = num;
				num++;
			}

			n--;

			for (int i = 0; i < n; i++) {
				x = x + d;
				arr[x][y] = num;
				num++;
			}
			if (n == 0) {
				break;
			}

			d = d * (-1);
		}
	}

	public void print() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.print("배열길이를 입력:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SNailReview snr = new SNailReview(n);
		snr.make();
		snr.print();
	}
}