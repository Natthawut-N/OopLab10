package Lab11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class Lab11_03 extends JFrame implements ActionListener {
    Timer swTimer;
    JTextField n1;

    public Lab11_03() {
        super("Program Using Timer");
        Container c = getContentPane();
        swTimer = new Timer(1000, this);
        swTimer.start();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Enter amount : "));
        n1 = new JTextField(10);
        n1.addActionListener(this);
        c.add(n1);
    }

    public void paint(Graphics g) {
        super.paint(g);

        int x = 50 + (int) (Math.random() * 450);
        int y = 50 + (int) (Math.random() * 270);
        int Red = (int) (Math.random() * 256);
        int Green = (int) (Math.random() * 256);
        int Blue = (int) (Math.random() * 256);
        g.setColor(new Color(Red, Green, Blue));

        String O = n1.getText();
        if (O.equals("fillOval")) {
            g.fillOval(x, y, (int) (Math.random() * 256), (int) (Math.random() * 256));
        } else if (O.equals("drawOval")) {
            g.fillRect(x, y, (int) (Math.random() * 256), (int) (Math.random() * 256));
        } else if (O.equals("fillRect")) {
            g.fillRect(x, y, (int) (Math.random() * 256), (int) (Math.random() * 256));
        } else if (O.equals("drawRect")) {
            g.drawRect(x, y, (int) (Math.random() * 256), (int) (Math.random() * 256));
        } else {
            g.drawString(O, x, y);
        }

    }

    public void actionPerformed(ActionEvent event) {
        repaint();
    }

    public static void main(String[] args) {
        Lab11_03 test = new Lab11_03();
        test.setSize(480, 300);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}
