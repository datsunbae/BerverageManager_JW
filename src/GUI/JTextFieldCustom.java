
package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.border.EmptyBorder;


public class JTextFieldCustom extends javax.swing.JTextField{

    public JTextFieldCustom() {
        setBackground(new Color(255, 255, 255, 0));
        setOpaque(false);
        setBorder(new EmptyBorder(10, 20, 10, 50));
        setFont(new java.awt.Font("Segoe UI", 0, 15)); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        int width = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) g;
        //g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setColor(new Color(215,215,215));
        g2.fillRoundRect(0, 0, width, height, height, height);
        super.paintComponent(g);
    }
    
}
