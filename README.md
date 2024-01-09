# BowlingScoreCalcRepo

Bowling Game is the Main class handles the logic for score calculation based on below Rules
Rules of the Game
We can briefly summarise the scoring for this form of bowling: 
• Each game, or “line” of bowling, includes 10 turns, or “frames” for the bowler. 
• In each frame, the bowler gets up to two tries to knock down all the 10 pins. 
• If in 2 tries, he fails to knock them all down, his score for that frame is the total number of pins 
knocked down in his 2 tries. 
• If in 2 tries he knocks them all down, this is called a “spare” and his score for the frame is ten 
plus the number of pins knocked down on his next throw (in his next turn). 
• If on his first try in the frame he knocks down all the pins, this is called a “strike”. His turn is over, 
and his score for the frame is ten plus the simple total of the pins knocked down in his next 2 
throws (this can span multiple frames if a strike is subsequently scored). 
• If he gets a spare or strike in the last (10th) frame, the bowler gets to throw one or two more 
bonus balls, respectively. These bonus throws are taken as part of the same turn. If the bonus 
throws knock down all the pins, the process does not repeat: the bonus throws are only used to 
calculate the score of the final frame. 
• The game score is the total of all frame scores. 

Input: 
10,9,1,5,5,7,2,10,10,10,9,0,8,2,9,1,10 then 
output:187
	