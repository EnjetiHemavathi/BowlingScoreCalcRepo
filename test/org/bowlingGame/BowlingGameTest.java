package org.bowlingGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BowlingGameTest {
	
	BowlingGame game= new BowlingGame();
	
	@Test
	void allZerotest() {
		
	    for (int i=0;i<20;i++)
	    {
	    	game.throwBall(0);
	    }
	    int score=game.getScore();
	   assertEquals(0, score);
	}
	
	@Test
	void allOnestest() {
		
	    for (int i=0;i<20;i++)
	    {
	    	game.throwBall(1);
	    }
	    int score=game.getScore();
	   assertEquals(20, score);
	}
	@Test
	void spareOnestest() {
		
		game.throwBall(9);
		game.throwBall(1);
		 rollMany(18,1);
	    int score=game.getScore();
	   assertEquals(29, score);
	}
	@Test
	void twosparestest() {
		
		 rollMany(5,5);
	    rollMany(15,0);
	    int score=game.getScore();
	   assertEquals(35, score);
	}
	@Test
	void striketest() {
		
		 game.throwBall(10);
		 game.throwBall(3);
		 game.throwBall(4);
	    rollMany(16,0);
	    int score=game.getScore();
	   assertEquals(24, score);
	}
	
	@Test
	void allstriketest() {

	    rollMany(12,10);
	    int score=game.getScore();
	   assertEquals(300, score);
	}
	
	@Test
	void allspareTest() {

	    rollMany(21,5);
	    int score=game.getScore();
	   assertEquals(150, score);
	}
	
	@Test
	void scoreTest() {

		game.throwBall(10);
		game.throwBall(9);
		game.throwBall(1);
		game.throwBall(5);
		game.throwBall(5);
		game.throwBall(7);
		game.throwBall(2);
		
		game.throwBall(10);
		game.throwBall(10);
		game.throwBall(10);
		game.throwBall(9);
		game.throwBall(0);
		game.throwBall(8);
		game.throwBall(2);
		game.throwBall(9);
		game.throwBall(1);
		game.throwBall(10);
	    int score=game.getScore();
	   assertEquals(187, score);
	}

	private void rollMany(int pins,int score) {
		for (int i=0;i<pins;i++)
	    {
	    	game.throwBall(score);
	    }
	}
	

}
