package com.bridgelabz;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the value between 0 and 1");
		int userInput=scanner.nextInt();
		if(userInput==0) {
			System.out.println("employee is present");
		}else {
			System.out.println("employee is absent");
		}

	}

}
