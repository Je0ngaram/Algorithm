package AlgoGj;

import java.util.Scanner;

public class Q16 {

static public void npira(int n) {
			
			for(int i = 1; i <= n; i++) {
				for(int j = n-1; j >= i; j--) {
					System.out.print(" ");
				}
				for(int k = 1; k < i; k++) {
				System.out.print(i%10);
				}
				for(int j = 0; j < i; j++) {
				System.out.print(i%10);
				}
				System.out.println();
			}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
			npira(num);
		}
	}