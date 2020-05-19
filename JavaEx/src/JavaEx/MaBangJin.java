package JavaEx;

import java.util.Scanner;

public class MaBangJin {
	int n;
	int[][]son;
	int son_1st=1;
	int x,y,xk,yk;
	
	public MaBangJin(int num) {
		this.n=num;
		son=new int[n][n];
	}
	
	public void make() {
		x=0;
		y=n/2;
		son[x][y]=son_1st;
		
		for(int i=1; i<n*n; i++) {
			son_1st++;
			x=x-1;
			y=y-1;
			if(x<0) {
				x=n-1;
			}
			if(y<0) {
				y=n-1;
			}
			if(son[x][y]!=0) {
				while(son[x][y]!=0) {
					x=(x+1)+1;
					y=(y+1);
					if(x>n-1||y>n-1) {
						x=xk+1;
						y=yk;
					}
				}
			}
			son[x][y]=son_1st;
			xk=x;
			yk=y;
		}
	}
	   public void print() {
		      System.out.println();
		      int a,b;
		      for(int i=0; i<n; i++) {
		         a=0;
		         for(int j=0;j<n;j++) {
		            System.out.printf("%3d",son[i][j]);
		            a=a+son[i][j];
		         }
		         System.out.printf("%5d",a);
		         System.out.println();
		      }
		      for(int i=0; i<n; i++) {
		         b=0;
		         for(int j=0;j<n;j++) {
		            b=b+son[j][i];
		         }
		         System.out.printf("%3d",b);
		      }
	}
	
	public static void main(String[] args) {
		System.out.print("홀수 입력(범위:1~9): ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		MaBangJin ma=new MaBangJin(n);
		ma.make();
		ma.print();
	}
}