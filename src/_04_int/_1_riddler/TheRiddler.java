package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog(null, "What can you catch, but not throw?");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equals("a cold")) {
JOptionPane.showMessageDialog(null, "nice you got it correct!");
score += 1;
}
// 5. Otherwise, say "wrong" and tell them the answer
else { 
JOptionPane.showMessageDialog(null, "L you got it wrong hahahahahahahahahahahahahahaha");
}
//6. Add some more riddles
JOptionPane.showMessageDialog(null, "your score is" + score + ".");
String riddle2 = JOptionPane.showInputDialog(null, "What has words, but never speaks?");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle2.equals("book")) {
JOptionPane.showMessageDialog(null, "nice you got it correct!");
score = score + 1;
}
// 5. Otherwise, say "wrong" and tell them the answer
else { 
JOptionPane.showMessageDialog(null, "L you got it wrong hahahahahahahahahahahahahahaha");
}
//6. Add some more riddles
JOptionPane.showMessageDialog(null, "your score is" + score + ".");
		// 2. Make a pop up to show the score.
String riddle3 = JOptionPane.showInputDialog(null, "What kind of band never plays music?");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle3.equals("rubber band")) {
JOptionPane.showMessageDialog(null, "nice you got it correct!");
score = score + 1;
}
// 5. Otherwise, say "wrong" and tell them the answer
else { 
JOptionPane.showMessageDialog(null, "L you got it wrong hahahahahahahahahahahahahahaha");
}
//6. Add some more riddles
JOptionPane.showMessageDialog(null, "your score is" + score + ".");
if (score == 3) {
	JOptionPane.showMessageDialog(null, "nice you got all the riddles correct!!! Good job :)");
}
	}
}

