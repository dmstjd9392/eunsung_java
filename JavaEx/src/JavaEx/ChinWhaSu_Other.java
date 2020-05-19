package JavaEx;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
																														
public class ChinWhaSu_Other {

	// 입력값을 두 개 받아서, 그 범위 안에서의 친화수를 구하라.

	static List<Integer> mates = new ArrayList<Integer>(); // 친화수를 저장할 리스트 선언

	public static int sumFactor(int a) { // 약수의 합을 구하는 메소드
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static List<Integer> listFactor(int a) { // 약수 전체 리스트을 출력
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}

	public static void Chin_hwa(int low, int high) {

		while (low < high) {
			int temp; // 임시로 친화수를 저장할 변수 temp 선언
			temp = sumFactor(low) - low;

			if (mates.contains(temp) == true) {// 이미 친화수 리스트에 있는 경우, 아래 조건 실행x

			} else if (temp < high && sumFactor(temp) - temp == low && temp != low) {// 조건1:범위 내에 있는지, 조건2:친화수가 맞는지,
				// 조건3:두 수가 같은 수인지
				mates.add(low);
				mates.add(temp);
			}
			low++;
		}
	}

	public static void print() { // 친화수 리스트를 짝지어 출력
		for (int i = 0; i < mates.size(); i = i + 2) {
			System.out.printf("(%d,%d)는 친화 수 : ", mates.get(i), mates.get(i + 1));
			System.out.print(listFactor(mates.get(i)));
			System.out.println(listFactor(mates.get(i + 1)));
		}
	}

	public static void main(String[] args) {

		System.out.println("찾으시려는 범위를 입력하세요.");
		Scanner input = new Scanner(System.in);
		System.out.print("최소값 : ");
		int low = input.nextInt();
		System.out.print("최대값 : ");
		int high = input.nextInt();
		input.close();

		Chin_hwa(low, high);
		print();

	}
	/*참고
	 * List를 사용하면, 출력시 [ ,  ,  ,  ,  ] 이런 형태로 자동으로 출력됨. 
	 * 위의 mates.contains는 List자료구조에서 제공하는 메소드*/
}