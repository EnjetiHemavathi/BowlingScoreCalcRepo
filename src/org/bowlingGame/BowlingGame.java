package org.bowlingGame;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	private List<Integer> rolls =new ArrayList<>();
	
	public void throwBall(int pins) {
		rolls.add(pins);
	}
	
	public int getScore() {
		int score=0;
		int rollIndex=0;
		//frames will  be 10 so considering that  
		for (int frame=0;frame<10;frame++) {
			//if strike then score will be 10+(score of next two rolls )
			if(isStrike(rollIndex)) {
				score += 10+rolls.get(rollIndex+1)+rolls.get(rollIndex+2);
				rollIndex +=1; // as frame will be completed incrementing one
			}
			else if(isSpare(rollIndex)) {
				//if spare then score will be 10+ (score of next one roll)
				score += 10+rolls.get(rollIndex+2);
				rollIndex +=2; //incremented by 2 to fetch nxt frame value
			}else {
				score += rolls.get(rollIndex)+rolls.get(rollIndex+1);
				rollIndex +=2; //incremented by 2 to fetch nxt frame value
			}
		}
		return score;
	}

	private boolean isSpare(int rollIndex) {
		return rolls.get(rollIndex)+ rolls.get(rollIndex+1)==10;
	}

	private boolean isStrike(int rollIndex) {
		return rolls.get(rollIndex)==10;
	}

}
