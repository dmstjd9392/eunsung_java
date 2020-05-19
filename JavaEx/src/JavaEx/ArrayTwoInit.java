package JavaEx;

import java.util.Arrays;

public class ArrayTwoInit {

	public static void main(String[] args) {
		// 2차원 배열 방법1
		int[][]son= {{1,2,0},
				     {0,0,0},
				     {0,0,0},
				     {0,0,0}};
		
		System.out.println("2차원 배열 방법1");
			for(int i=0; i<son.length; i++) {
				for(int j=0; j<son[i].length; j++) {
					System.out.print("["+son[i][j]+"]");
				}
				System.out.println();
			}
			System.out.println();
		
		// 2차원 배열 방법2
		int[][]son2= {{0,0,0,0},
				      {0,0,0,0,0},
				      {0,0,0}};
		
		System.out.println("2차원 배열 방법2");
			for(int i=0; i<son2.length; i++) {
				for(int j=0; j<son2[i].length; j++) {
					System.out.print("["+son2[i][j]+"]");
				}
				System.out.println();
			}
			System.out.println();
		
		// 2차원 배열 방법3
		int[][]son3=new int[3][5];
		int num1=1;
		int num2=2;
		int num3=6;
		System.out.println("2차원 배열 방법3");
		for(int i=0; i<son3.length; i++) {
			for(int j=0; j<son3[i].length; j++) {
				if(i==0) {
				son3[i][j]=num1;
					{
					System.out.print("["+son3[i][j]+"]");
					num1++;
					}
				}else if(i==1) {
				son3[i][j]=num2;
					{
					System.out.print("["+son3[i][j]+"]");
					num2++;
					}
				}else if(i==2) {
				son3[i][j]=num3;
					{
					num3++;
					if(son3[2][4]==10) {
						son3[2][4]=0;
					}
					System.out.print("["+son3[i][j]+"]");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
				
		// COPY1
		System.out.println("COPY");
		int[][] copy=Arrays.copyOf(son3, son3.length);
		for(int i=0; i<son3.length; i++) {
			for(int j=0; j<copy[i].length; j++) {
				System.out.print("["+copy[i][j]+"]");
			}
			System.out.println();
		}
		System.out.println();
	}
}