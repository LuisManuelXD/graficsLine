package test;

import controller.LineDrawn;
import javax.swing.JFrame;

/**
 *
 * @author riost_fq9d95t
 */
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        LineDrawn lineDrawn = new LineDrawn();
        frame.add(lineDrawn);

        frame.pack();
        frame.setVisible(true);
        
        Thread animationThread = new Thread(() -> {
            while (true) {
                lineDrawn.moveLine();
                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        animationThread.start();
    }
}
