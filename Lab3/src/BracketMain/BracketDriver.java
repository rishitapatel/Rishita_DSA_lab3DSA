package BracketMain;

import java.util.Scanner;

import BracketService.BracketServiceImpl;

public class BracketDriver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the bracket string");
	String inputBrackets = sc.next();
	
	BracketServiceImpl bracketServiceimpl = new BracketServiceImpl();
	boolean output = bracketServiceimpl.bracketchecker(inputBrackets);
	
	if(output) {
		System.out.println("The entered String has Balanced Brackets ");
	}
	else {
		System.out.println("The entered Strings do not contain Balanced Brackets");
	}
	}
}
