package controller;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author riost_fq9d95t
 */
public class LineDrawn extends Canvas {

    private int x1 = 10;
    private int x2 = 10;
    private int y = 100;
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        g.drawLine(x1, y, x2, y); // Dibuja la línea con las coordenadas actualizadas
    }
    
    public void moveLine() {
//        x1 += 5;
        x2 += 5;
        y += 2;
        repaint();
    }
}
