package JavaEx;

import java.util.Scanner;

public class MBJ {
	int n;
	int[][] arr;

	public MBJ(int n) {
		this.n = n;
		arr = new int[n][n];
	}

	public void make() {
		int x = 0;
		int y = n / 2;
		int num = 1;
		int xk = 0, yk = 0;
		arr[x][y] = num;

		for (int i = 1; i < n * n; i++) {
			num++;
			x = x - 1;
			y = y - 1;
			if (x < 0) {
				x = n - 1;
			}
			if (y < 0) {
				y = n - 1;
			}
			if (arr[x][y] != 0) {
				while (arr[x][y] != 0) {
					x = (x + 1) + 1;
					y = (y + 1);
					if (x > n - 1 || y > n - 1) {
						x = xk + 1;
						y = yk;
					}
				}
			}
			arr[x][y] = num;
			/*
			 * xk = x; yk = y;
			 */
		}

	}

	public void print() {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.print("홀수를 입력하세요(범위)1~9:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MBJ ma = new MBJ(n);
		ma.make();
		ma.print();
	}
}