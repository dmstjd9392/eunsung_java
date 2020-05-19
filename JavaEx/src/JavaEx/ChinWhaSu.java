package JavaEx;

public class ChinWhaSu {
	//��� ���ϴ� ����
	public static boolean isMod(int a, int b) {
		boolean isP=false;
		if(a!=1 && a!=0 && b!=0 && a%b==0) {
			isP=true;
		}
		return isP;
	}
	
	//��� �� ���ϴ� �޼ҵ�(�ڱ��ڽ� ����)
	private static int divisorSum(int a) {
		int sum=1;
		for(int j=2; j<a; j++) {
			if(isMod(a,j)) {
				sum+=j;
			}
		}
		return sum;
	}
	
	//��� ��� �޼ҵ�
	public static void printDivisor(int a) {
		System.out.print("[1,");
		for(int j=2; j<a; j++) {
			if(isMod(a,j)) {
				System.out.print(j+",");
			}
		}
		System.out.println(a+"]");
	}
	
	//ģȭ�� ���� Ȯ��
	public static void confirm(int A, int B ) {
		if(divisorSum(A)==B && divisorSum(B)==A) {
			System.out.println("�� ���� ģȭ��");
		}
	}

	public static void main(String[] args) {
		int A; 
		int B;
		for(int i=2; i<10000; i++) {
			if(i==divisorSum(divisorSum(i))){
			A=i;
			B=divisorSum(i);
			if(A<B) {
			System.out.print(A+"�� ���:"); 
				printDivisor(A);	//220�� ��� ��� ���
			System.out.print(B+"�� ���:"); 
				printDivisor(B);	//284�� ��� ��� ���
			System.out.print("ģȭ�� ���� Ȯ��:");
				confirm(A,B);		//ģȭ�� ���� ���
			System.out.println("-------------------------");
			/*System.out.println("#220�� ��:" +divisorSum(A));	//(��������)��� ��
			System.out.println("#284�� ��:" +divisorSum(B));	//(��������)��� ��*/
				}
			}
		}
		
		/*System.out.print(A+"�� ���:"); 
			printDivisor(A);	//220�� ��� ��� ���
		System.out.print(B+"�� ���:"); 
			printDivisor(B);	//284�� ��� ��� ���
		System.out.print("ģȭ�� ���� Ȯ��:");
			confirm(A,B);		//ģȭ�� ���� ���
		System.out.println("#220�� ��:" +divisorSum(A));	//(��������)��� ��
		System.out.println("#284�� ��:" +divisorSum(B));	//(��������)��� ��*/
	}
}