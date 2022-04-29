package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main extends JPanel implements ActionListener {
    Timer timer = new Timer(100, this);
    int x = 960;
    int y = 540;
    int z = 0;
    int c = 0;
    int schet = 1;
    int count = 0;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.gray);
        g.setColor(Color.black);
        g.fillOval(x, y, z, c);
        this.timer.setRepeats(false);
        this.timer.start();
    }

    public static void main(String[] args) {
        Main java = new Main();
        JFrame frame = new JFrame("Приближающийся издали шар, удаляющийся шар.");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.add(java);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        while(schet > 0 && < 400) {
            if (count < 10000) {
                if (schet < 200) {
                    x--;
                    y--;
                    z++;
                    z++;
                    c++;
                    c++;
                    schet++;
                    repaint();
                } else if (schet> 199 && schet<400) {
                    x++;
                    y++;
                    z--;
                    z--;
                    c--;
                    c--;
                    schet++;
                    repaint();
                }
            } else {
                schet = 500;
            }
            count++;
        }
    }
}