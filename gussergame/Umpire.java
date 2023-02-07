package com.gussergame;

public class Umpire {
	
	int guesserNumber;
	int playerNum1;
	int playerNum2;
	int playerNum3;
	
	public void CollectNumFromGuesser() {
		
		Gusser g=new Gusser();
		guesserNumber=g.guessNumber();
	}
	
	public void CollectNumberFromPlayer() {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		playerNum1=p1.guessNumber();
		playerNum2=p2.guessNumber();
		playerNum3=p3.guessNumber();
	}
	
	public void compare() {
		
		if(guesserNumber==playerNum1) {
			if(guesserNumber==playerNum2 && guesserNumber==playerNum3) {
			System.out.println(" Game tied No one is won this Game!!!");
			}
			else if(guesserNumber==playerNum2) {
				System.out.println("Player1 and Player2 has won the Game!!");
			}
			else if(guesserNumber==playerNum3) {
				System.out.println("Player1 and Player3 has won the Game");
			}
			else {
				System.out.println("Player1 has won the Game!!");
			}
		}
		else if(guesserNumber==playerNum2) {
			if(guesserNumber==playerNum3) {
			System.out.println("Player2 and Player3 won the Game");
			}
			else {
				System.out.println("Player2 has Won the Game");
			}
		}
		else if(guesserNumber==playerNum3){
	        System.out.println("Player3 won the Game");		
		}
		else {
			System.out.println("Kisi ka Sahi nhi hai Bye tata ");
		}
	}

}
