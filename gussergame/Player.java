package com.gussergame;

import java.util.Scanner;

public class Player {
	
	int playerNum;
	
	public int guessNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Player Guess any Number: ");
		playerNum=sc.nextInt();
		return playerNum;
	}

}
