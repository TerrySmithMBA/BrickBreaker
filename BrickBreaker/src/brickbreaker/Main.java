package brickbreaker;

import javax.swing.JFrame;

public class Main {
    
    public static void main(String[] args) {
        JFrame windowFrame = new JFrame();
        Game game = new Game();
        windowFrame.setBounds(10, 10, 700, 600);
        windowFrame.setTitle("Brick Breaker");
        windowFrame.setResizable(false);
        windowFrame.setVisible(true);
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.add(game);
    }
}
