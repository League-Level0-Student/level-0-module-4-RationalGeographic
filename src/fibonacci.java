
public class fibonacci {
public static void main(String[] args) {
	int a =0;
	int b =1;
	System.out.println(a + "\n" + b);
	for(int i =0; i<12;i++) {
		int temp = b;
		b = a + b;
		a = temp;
		System.out.println(b);
	}
}
}
