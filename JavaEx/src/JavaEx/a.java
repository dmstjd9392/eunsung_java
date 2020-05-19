package JavaEx;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		System.out.print("짝수를 입력하세요:");
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	         
	        /*
	         * 마방진에 숫자를 넣는 순서.
	         * 첫 숫자인 1은 -> 첫행 가운데
	         * N의 배수일 경우 바로 아래 행으로 내려가 다음 수를 넣는다.
	         * 그렇지 않다면 왼쪽 위로 이동하여 다음 숫자를 넣는다. 만약 행이 첫 번째를 만나면 마지막 행으로 이동한다.
	         * 열이 첫 번째를 만나면 마지막 열로 이동한다.
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