package BracketService;

import java.util.Stack;

import BracketInterface.BracketService;

public class BracketServiceImpl implements BracketService {

	@Override
	public boolean bracketchecker(String bracketString) {

		Stack<Character> bracketStack = new Stack<Character>();

		int countStrLenght = bracketString.length();

		for (int i = 0; i < bracketString.length(); i++) {
			
			if (bracketString.charAt(i) == '(' || bracketString.charAt(i) == '[' || bracketString.charAt(i) == '{') {
				bracketStack.push(bracketString.charAt(i));
			}
			
			if(bracketStack.isEmpty()) {
				return false;
			}
			if (bracketString.charAt(i) == ')' || bracketString.charAt(i) == ']' || bracketString.charAt(i) == '}') {
				if (compareBracket(bracketStack.peek(), bracketString.charAt(i))) {
					bracketStack.pop();

				} else {
					break;
				}
			}
			countStrLenght--;
		}
		if (bracketStack.isEmpty() && countStrLenght == 0) {
			return true;
		}
		return false;
	}

	private boolean compareBracket(Character peek, char i) {
		if (peek == '(' && i == ')') {
			return true;
		} else if (peek == '[' && i == ']') {
			return true;
		} else if (peek == '{' && i == '}') {
			return true;
		} else {
			return false;
		}
	}

}
