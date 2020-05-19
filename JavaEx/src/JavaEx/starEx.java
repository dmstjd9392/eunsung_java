package JavaEx;

public class starEx {

	public static void main(String[] args) {
		// º°Âï±â
		int num=11;
		for (int i=0;i<num;i++){
		  for (int j=0; j<num;j++)
		  {
		      if (i>num/2) //¾Æ·¡ÂÊ ¿µ¿ª
		     {
		        if (i-j>=num/2+1) //¿ŞÂÊ ¹Ø °ø¹é
		        	System.out.print(" ");
		        else if (i+j>=num/2*3+1)//¿À¸¥ÂÊ ¹Ø °ø¹é
		        	System.out.print(" ");
		        else
		        	System.out.print("*"); // *Âï±â
		     }
		  }
		  System.out.println();//ÁÙ¹Ù²Ş
		}
	}
}