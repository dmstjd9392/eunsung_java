package JavaEx;

public class JSort {
	
	public static void BubbleSort(int[] n) {
		int tem;
		for(int j=0; j<n.length; j++) {
			for(int i=0;i<n.length-1-j;i++) {
				if(n[i]>n[i+1]) {
					tem=n[i];
					n[i]=n[i+1];
					n[i+1]=tem;
				}
			}	
		}
	}
	
	public static void print(int[]n) {
		for(int i=0; i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
}