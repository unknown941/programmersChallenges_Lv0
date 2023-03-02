package lesson120907;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		String[] case1 = {"3 - 4 = -3", "5 + 6 = 11"};
		String[] case2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		
		System.out.println("CASE 1 : " + Arrays.toString(Solution.solution(case1)));
		System.out.println("CASE 2 : " + Arrays.toString(Solution.solution(case2)));
	}
	
}
