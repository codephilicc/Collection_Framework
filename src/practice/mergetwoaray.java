package practice;

public class mergetwoaray {

	public static void main(String[] args) {

		int a[] = { 2, 4, 1, 5, 2 };

		int b[] = { 50, 12, 33, 60};

		int a1 = a.length;
		int b1 = b.length;

		int c1 = a1 + b1;
		int c[] = new int[c1];

		for (int i = 0; i < a1; i++) {
			c[i] = a[i];
		}

		for (int j = a1; j < c1; j++) {
			c[j] = b[j-a1];
		}

		for (int i = 0; i < c1; i++) {
			System.out.print(c[i]+" ");
		}
//		System.out.println(c.length);

	}

}
