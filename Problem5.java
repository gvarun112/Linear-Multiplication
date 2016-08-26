package grandfinale;
public class Problem5 {
public static void LinearMulti(int a0,int a1,int b0,int b1)
	{
		int c0 = a0*b0;
		int c1 = a0*b1 + a1*b0;
		int c2 = a1*b1;
		System.out.println(c0 + " "+ c1+ " "+ c2);
	}
	public static void main(String[] args) {
		LinearMulti(10, 10, 10, 10);
	}
}