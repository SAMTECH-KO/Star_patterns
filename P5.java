/*
    1
   2 2
  3 3 3
 4 4 4 4
 */

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
		}
	}

}
