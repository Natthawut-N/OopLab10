import javax.swing.*;
import java.awt.*;

public class RectangleJFrame extends javax.swing.JFrame {
    int x, y, w, h;
    Rectangle r[];

    public RectangleJFrame() {
        super("Program Inheritance Rectangle");
        String input; // user's input
        // obtain user's choice
        r = new Rectangle[num];
        for (int i = 0; i <r.length; i++) {
            input = JOptionPane.showInputDialog("Enter value x of left point : " + i+1);
            x = Integer.parseInt(input); // convert input to int
            input = JOptionPane.showInputDialog("Enter value y of left point : " + i+1);
            y = Integer.parseInt(input); // convert input to int
            int w = 10 + (int) (Math.random() * 600);
            int h = 10 + (int) (Math.random() * 400);
            r[i] = new Rectangle(x, y, w, h);
        }
    } // end method init

    public void paint(Graphics g) {
        super.paint(g); // call paint method inherited
        // set color

        int red, green, blue;
        red = (int) (Math.random() * 256);
        green = (int) (Math.random() * 256);
        blue = (int) (Math.random() * 256);
        g.setColor(new Color(red, green, blue));
        g.drawRect(r[i].getX(), r[i].getY(), r[i].getWidth(), r[i].getHeight());
        g.setColor(Color.black);
        g.drawString("Point Left : " + r[i].getX() + ", " + r[i].getY(), r[i].getX(), r[i].getY());
        g.drawString("Width : " + r[i].getWidth(), r[i].getX(), r[i].getY() + 15);
        g.drawString("Height : " + r[i].getHeight(), r[i].getX(), r[i].getY() + 30);
        g.drawString("Area : " + r[i].getArea(), r[i].getX(), r[i].getY() + 45);
    } // end method paint

    public static void main(String[] args) {
        
        RectangleJFrame test = new RectangleJFrame();
        test.setSize(640, 480);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}