package JavaEx;

public class quickSort {
	
	public void sort(int[] data, int l, int r) {
		int left = l;
		int right = r;
		int pivot = data[(l + r) / 2];

		do {
			while (data[left] < pivot)
				left++;
			while (data[right] > pivot)
				right--;
			if (left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);

		if (l < right)
			sort(data, l, right);
		if (r > left)
			sort(data, left, r);
	}

	public static void main(String[] args) {
		int data[]={67,700,735,287,830,360,753,332,899,616,990,890,933,975,275
			    ,707,271,80,409,602,875,813,208,949,183,504,721,494,159,549,
			    95,818,85,444,703,961,928,193,846,660,433,253,547,436,467,751,
			    684,284,481,439,12,18,421,4,394,458,829,633,474,359,454,541,
			    601,471,326,889,345,555,710,614,540,353,795,116,119,133,859,280,413,
			    689,861,966,709,938,600,190,81,544,406,692,765,179,
			    32,629,437,804,911,42,836,770};  // 100개인 배열을 선언하고 초기화한다.
		quickSort qs=new quickSort();
		qs.sort(data,  0,  data.length-1);
		for(int i=0; i<data.length; i++) {
			System.out.println("data["+(i+1)+"] :"+data[i]);
		}
	}
}