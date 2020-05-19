package JavaEx;

public class ChinWhaSu {
	//약수 구하는 로직
	public static boolean isMod(int a, int b) {
		boolean isP=false;
		if(a!=1 && a!=0 && b!=0 && a%b==0) {
			isP=true;
		}
		return isP;
	}
	
	//약수 합 구하는 메소드(자기자신 제외)
	private static int divisorSum(int a) {
		int sum=1;
		for(int j=2; j<a; j++) {
			if(isMod(a,j)) {
				sum+=j;
			}
		}
		return sum;
	}
	
	//약수 출력 메소드
	public static void printDivisor(int a) {
		System.out.print("[1,");
		for(int j=2; j<a; j++) {
			if(isMod(a,j)) {
				System.out.print(j+",");
			}
		}
		System.out.println(a+"]");
	}
	
	//친화수 여부 확인
	public static void confirm(int A, int B ) {
		if(divisorSum(A)==B && divisorSum(B)==A) {
			System.out.println("두 수는 친화수");
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
			System.out.print(A+"의 약수:"); 
				printDivisor(A);	//220의 모든 약수 출력
			System.out.print(B+"의 약수:"); 
				printDivisor(B);	//284의 모든 약수 출력
			System.out.print("친화수 여부 확인:");
				confirm(A,B);		//친화수 여부 출력
			System.out.println("-------------------------");
			/*System.out.println("#220의 합:" +divisorSum(A));	//(본인제외)약수 합
			System.out.println("#284의 합:" +divisorSum(B));	//(본인제외)약수 합*/
				}
			}
		}
		
		/*System.out.print(A+"의 약수:"); 
			printDivisor(A);	//220의 모든 약수 출력
		System.out.print(B+"의 약수:"); 
			printDivisor(B);	//284의 모든 약수 출력
		System.out.print("친화수 여부 확인:");
			confirm(A,B);		//친화수 여부 출력
		System.out.println("#220의 합:" +divisorSum(A));	//(본인제외)약수 합
		System.out.println("#284의 합:" +divisorSum(B));	//(본인제외)약수 합*/
	}
}