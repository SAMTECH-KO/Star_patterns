/*
1
2 3
4 5 6
7 8 9 10
*/

public class P8 {

	public static void main(String[] args) {

		int n = 4, n1 = 0;
		for(int i = 1; i <= n; i++) {
		for(int j = 1; j <= i; j++) {
			System.out.print(++n1 + " ");	
		}
		System.out.println();
		}

}

}
