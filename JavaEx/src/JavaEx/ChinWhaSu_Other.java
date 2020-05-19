package JavaEx;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
																														
public class ChinWhaSu_Other {

	// �Է°��� �� �� �޾Ƽ�, �� ���� �ȿ����� ģȭ���� ���϶�.

	static List<Integer> mates = new ArrayList<Integer>(); // ģȭ���� ������ ����Ʈ ����

	public static int sumFactor(int a) { // ����� ���� ���ϴ� �޼ҵ�
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static List<Integer> listFactor(int a) { // ��� ��ü ����Ʈ�� ���
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
			int temp; // �ӽ÷� ģȭ���� ������ ���� temp ����
			temp = sumFactor(low) - low;

			if (mates.contains(temp) == true) {// �̹� ģȭ�� ����Ʈ�� �ִ� ���, �Ʒ� ���� ����x

			} else if (temp < high && sumFactor(temp) - temp == low && temp != low) {// ����1:���� ���� �ִ���, ����2:ģȭ���� �´���,
				// ����3:�� ���� ���� ������
				mates.add(low);
				mates.add(temp);
			}
			low++;
		}
	}

	public static void print() { // ģȭ�� ����Ʈ�� ¦���� ���
		for (int i = 0; i < mates.size(); i = i + 2) {
			System.out.printf("(%d,%d)�� ģȭ �� : ", mates.get(i), mates.get(i + 1));
			System.out.print(listFactor(mates.get(i)));
			System.out.println(listFactor(mates.get(i + 1)));
		}
	}

	public static void main(String[] args) {

		System.out.println("ã���÷��� ������ �Է��ϼ���.");
		Scanner input = new Scanner(System.in);
		System.out.print("�ּҰ� : ");
		int low = input.nextInt();
		System.out.print("�ִ밪 : ");
		int high = input.nextInt();
		input.close();

		Chin_hwa(low, high);
		print();

	}
	/*����
	 * List�� ����ϸ�, ��½� [ ,  ,  ,  ,  ] �̷� ���·� �ڵ����� ��µ�. 
	 * ���� mates.contains�� List�ڷᱸ������ �����ϴ� �޼ҵ�*/
}