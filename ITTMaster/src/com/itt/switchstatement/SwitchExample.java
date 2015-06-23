package com.itt.switchstatement;

public class SwitchExample {

	public static void main(String[] args) {
		char grade = 'a';
		switch(grade){
		case 'a':
			System.out.println("Excellent!");
			break;
		case 'b':
			System.out.println("Almost Excellent");
			break;
		case 'c':
			System.out.println("Okay");
			break;
		case 'd':
			System.out.println("poor");
			break;
		default:
			System.out.println("Default");
		}
	}

}
