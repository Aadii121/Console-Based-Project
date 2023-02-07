package com.gussergame;

import java.util.Scanner;

public class Gusser {
	int guesNum;
	public int guessNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Guesser Guess any Number: ");
		guesNum=sc.nextInt();
		return guesNum;
	}

}
