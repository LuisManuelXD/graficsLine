package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author riost_fq9d95t
 */
public class ViewDraw extends JPanel {

    private int x = 0;
    private int y = 0;
    private int dx = 1;
    private int dy = 1;

    public ViewDraw() {
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(this.x, this.y, this.x+100, this.y);

        // Actualiza la posición de la línea
        this.x += this.dx;
        this.y += this.dy;

        // Invierte la dirección si la línea llega al borde del panel
        if (this.x <= 0 || this.x >= getWidth() - 100) {
            this.x *= -1;
        }
        
        if (this.y <= 0 || this.y >= getHeight() - 1) {
            this.dy *= -1;
        }
    }
}
