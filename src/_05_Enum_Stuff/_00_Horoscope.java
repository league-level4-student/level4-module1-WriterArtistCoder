package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void zodiac() {
		/*ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, 
		LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES*/
		int input = JOptionPane.showOptionDialog(null, "Choose a Zodiac sign", "Custom Buttons", 0, -1, null,
			Zodiac.values(), 0);
		switch (input) {
		case 0:
			JOptionPane.showMessageDialog(null, "Aires, you can expect to breathe air today.");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Taurus, most likely thou shalt eat food today.");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Gemini, you will probably consume food as of this year.");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Cancer, you will inhale oxygen in the near future.");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Leo, thou shalt eat food today.");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Virgo, thou may consume water today.");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Libra, you will breathe air today.");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Scorpio shall eat food as of today.");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "Sagittarius shall eat food as of this day in history.");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Capicorn shall consume H20 today.");
			break;
		case 10:
			JOptionPane.showMessageDialog(null, "Aquarius shall drink water today.");
			break;
		case 11:
			JOptionPane.showMessageDialog(null, "Pisces shall drink liquid water today.");
			break;
		}
	}
	// 3. Make a main method to test your method
	
	public static void main(String[] args) {
		zodiac();
	}
}
