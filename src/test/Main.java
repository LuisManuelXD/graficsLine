package test;

import controller.LineDrawn;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import view.ViewDraw;

/**
 *
 * @author riost_fq9d95t
 */
public class Main {

    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//
//        LineDrawn lineDrawn = new LineDrawn();
//        frame.add(lineDrawn);
//
//        frame.pack();
//        frame.setVisible(true);
//        
//        Thread animationThread = new Thread(() -> {
//            while (true) {
//                lineDrawn.moveLine();
//                try {
//                    Thread.sleep(20);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        animationThread.start();
        JFrame ventana = new JFrame("Linea");
        ViewDraw viewDraw = new ViewDraw();

        ventana.add(viewDraw);
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        while (true) {
            try {
                ventana.repaint();
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
