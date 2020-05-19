package JavaEx;
import java.util.ArrayList;
import java.util.List;

public class ForCondition3 {
	public static void main(String[] args) {
		//-(1)
			List<Integer> ilist=new ArrayList<>();
		//-(2)
			int s=0;
			for(int i=1; i<=100; i++) {
				ilist.add(i);
			}
		//-(3)
			s=ilist.parallelStream().reduce(0,Integer::sum);
			System.out.println("1~100의 합:"+s);
		//-(4)
			s=0;
			s=ilist.stream().filter(i-> i%2==1).reduce(0,Integer::sum);
			System.out.println("1~100사이의 홀수의 합:"+s);
			s=ilist.stream().filter(i-> i%2==1).reduce(0,(x,y)->x+y);
			System.out.println("1~100사이의 홀수의 합:" +s);				
		}
	}