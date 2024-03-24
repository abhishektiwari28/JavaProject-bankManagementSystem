package bank.management.system;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Pin extends JFrame implements ActionListener {
    JButton b1;
    JButton b2;
    JPasswordField p1;
    JPasswordField p2;
    String pin;

    Pin(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1330, 830, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        this.add(l3);
        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setBounds(480, 180, 400, 35);
        label1.setFont(new Font("System", 1, 16));
        label1.setForeground(Color.WHITE);
        l3.add(label1);
        JLabel label2 = new JLabel("New Pin");
        label2.setBounds(480, 225, 400, 35);
        label2.setFont(new Font("System", 1, 16));
        label2.setForeground(Color.WHITE);
        l3.add(label2);
        this.p1 = new JPasswordField();
        this.p1.setBounds(595, 229, 200, 25);
        this.p1.setBackground(new Color(65, 125, 128));
        this.p1.setForeground(Color.WHITE);
        this.p1.setFont(new Font("Raleway", 1, 22));
        l3.add(this.p1);
        JLabel label3 = new JLabel("Re-enter Pin");
        label3.setBounds(480, 258, 400, 35);
        label3.setFont(new Font("System", 1, 16));
        label3.setForeground(Color.WHITE);
        l3.add(label3);
        this.p2 = new JPasswordField();
        this.p2.setBounds(595, 262, 200, 25);
        this.p2.setBackground(new Color(65, 125, 128));
        this.p2.setForeground(Color.WHITE);
        this.p2.setFont(new Font("Raleway", 1, 22));
        l3.add(this.p2);
        this.b1 = new JButton("CHANGE");
        this.b1.setBounds(687, 364, 150, 35);
        this.b1.setBackground(new Color(65, 125, 128));
        this.b1.setForeground(Color.WHITE);
        this.b1.addActionListener(this);
        l3.add(this.b1);
        this.b2 = new JButton("BACK");
        this.b2.setBounds(687, 408, 150, 35);
        this.b2.setBackground(new Color(65, 125, 128));
        this.b2.setForeground(Color.WHITE);
        this.b2.addActionListener(this);
        l3.add(this.b2);
        this.setLayout((LayoutManager)null);
        this.setSize(1550, 1080);
        this.setLocation(0, 0);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String pin1 = p1.getText();
            String pin2 = p2.getText();
            if (!pin1.equals(pin2)) {
                JOptionPane.showMessageDialog((Component)null, "Entered Pin does not match");
                return;
            }

            if (e.getSource() == b1) {
                if (p1.getText().equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "Enter New Pin");
                    return;
                }

                if (p2.getText().equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "Re-Enter New Pin");
                    return;
                }

                Conn c = new Conn();
                String q1 = "update bank set pin = '" + pin1 + "' where pin ='" + pin + "'";
                String q2 = "update login set pin = '" + pin1 + "' where pin ='" + pin + "'";
                String q3 = "update signupthree set pin = '" + pin1 + "' where pin ='" + pin + "'";
                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);
                JOptionPane.showMessageDialog((Component)null, "Pin Changed Successfully");
                this.setVisible(false);
                new main_Class(pin1);
            }

            else if (e.getSource() == b2) {
                new main_Class(pin);
                this.setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Pin("");
    }
}
