package lec0503;

import java.util.Scanner;
import java.util.Stack;

public class BOJ0912 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		in.nextLine();
		
		for (int i = 0; i < T; i++) {
			String parStr = in.nextLine();
			System.out.println(isVPS(parStr));
		}
		
	}
	
	public static String isVPS(String parStr) {
		Stack<Character> vpsStack = new Stack<>();
		char[] parCharArr = parStr.toCharArray();
		
		for (char par : parCharArr) {
			// 1. '('을 만나면 stack 에 넣는다
			if (par == '(') {
				vpsStack.add(par);
			}
			// 2. ')'을 만나면 stack 에서 짝꿍이 있는지 찾는다
			//		-> 없으면, return "NO"
			else {
				if (vpsStack.empty()) return "NO";
				vpsStack.pop();
			}
		}
		
		// 3. Stack 에 남아 있는 '('가 있으면, return "NO"
		if (vpsStack.empty()) return "YES";
		
		return "NO";
	}

}
