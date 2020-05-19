package JavaEx;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		System.out.print("¦���� �Է��ϼ���:");
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	         
	        /*
	         * �������� ���ڸ� �ִ� ����.
	         * ù ������ 1�� -> ù�� ���
	         * N�� ����� ��� �ٷ� �Ʒ� ������ ������ ���� ���� �ִ´�.
	         * �׷��� �ʴٸ� ���� ���� �̵��Ͽ� ���� ���ڸ� �ִ´�. ���� ���� ù ��°�� ������ ������ ������ �̵��Ѵ�.
	         * ���� ù ��°�� ������ ������ ���� �̵��Ѵ�.
	         * */
	     
	        int[][] magicSquare = new int[N][N];
	        int x = 0, y = N/2;
	        magicSquare[x][y] = 1;
	         
	        for(int i = 1; i < N*N; ++i)
	        {   
	            if((i+1)%N == 1){
	                x++;
	                if(x == N)
	                    x = 0;
	                magicSquare[x][y] = i+1;
	            }else{
	                x--;
	                if(x == -1)
	                    x = N-1;
	                 
	                y--;
	                if(y == -1)
	                    y = N-1;
	                 
	                magicSquare[x][y] = i+1;
	            }
	        }
	        for(int i = 0 ; i < N; ++i)
	        {
	            for(int j = 0 ; j < N; ++j)
	                System.out.print(magicSquare[i][j] + " " );
	            System.out.println();
	        }
	    }
}