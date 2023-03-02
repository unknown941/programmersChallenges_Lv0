package lesson120907;

// OX퀴즈

// 문제 설명
/* 
 * 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
 * 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 */

public class Solution {
	
	public static String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		
		for(int i = 0; i < quiz.length; i++) {
			// 공백 기준으로 split
			String[] quizSplit = quiz[i].split(" ");
			
			// 더하기인 경우
			if(quizSplit[1].equals("+")) {
				if(Integer.parseInt(quizSplit[0]) + Integer.parseInt(quizSplit[2]) == Integer.parseInt(quizSplit[4])) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
			// 빼기인 경우
			} else if(quizSplit[1].equals("-")) {
				if(Integer.parseInt(quizSplit[0]) - Integer.parseInt(quizSplit[2]) == Integer.parseInt(quizSplit[4])) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
			}
		}
		
		return answer;
	}
	
}
