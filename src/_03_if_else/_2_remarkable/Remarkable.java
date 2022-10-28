package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String cool = "is good at ping pong and loves stuffed animals!";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String q = JOptionPane.showInputDialog(null, "enter ur best friend");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
JOptionPane.showMessageDialog(null,q + cool);
	}
}

