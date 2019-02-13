package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday":
			System.out.println("Laze around. The last weekend day. :(");
			break;
		case "Monday":
			System.out.println("Play tennis.");
			break;
		case "Tuesday":
			System.out.println("Go to school. I have a big question!");
			break;
		case "Wednesday":
			System.out.println("Go code.");
			break;
		case "Thursday":
			System.out.println("Go to school. Work together.");
			break;
		case "Friday":
			System.out.println("Laze around. First weekend day.");
			break;
		case "Saturday":
			System.out.println("Laze around. Stay comfy. Middle weekend day. ;D");
			break;
		}
	}
}
