package _07_MySnake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnakeGame {
	
	public static final Color BG_COLOR = Color.BLACK;
	public static final int WINDOW_WIDTH = 600;
	public static final int WINDOW_HEIGHT = 600;
	public static final int PIXEL_WIDTH = 20;
	public static final int PIXEL_HEIGHT = 20;
	public Color[][] pixels;
	
	public SnakeGame() {
		pixels = new Color[WINDOW_WIDTH][WINDOW_HEIGHT];
	}
	
	public static void main(String[] args) {
		SnakeGame game = new SnakeGame();
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;

				g2.setColor(BG_COLOR);
				g2.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
				
				for (int i = 0; i < WINDOW_HEIGHT/PIXEL_HEIGHT; i++) {
					for (int x = 0; x < WINDOW_WIDTH/PIXEL_WIDTH; x++) {
						g2.setColor(game.pixels[x][i]);
						g2.fillRect(x*PIXEL_WIDTH, i*PIXEL_HEIGHT, PIXEL_WIDTH, PIXEL_HEIGHT);
					}
				}
			}
		};
		
		panel.setSize(600, 600);
		
		frame.add(panel);
		frame.pack();
	}
}
