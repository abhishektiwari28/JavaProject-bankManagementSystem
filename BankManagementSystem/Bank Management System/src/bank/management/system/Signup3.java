package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;
    Signup3(String first){

        this.formno = first;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);


        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);


        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);





        JLabel l3 = new JLabel("Account Type :");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,180,250,30);
        r1.setBackground(new Color(215,252,252));
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(350,180,300,30);
        r2.setBackground(new Color(215,252,252));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100,220,250,30);
        r3.setBackground(new Color(215,252,252));
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350,220,300,30);
        r4.setBackground(new Color(215,252,252));
        add(r4);

        ButtonGroup buttonGroupAc = new ButtonGroup();

        buttonGroupAc.add(r1);
        buttonGroupAc.add(r2);
        buttonGroupAc.add(r3);
        buttonGroupAc.add(r4);




        JLabel l4 = new JLabel("Card Number :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);


        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);


        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,250,30);
        add(l6);


        JLabel l7 = new JLabel("(It Would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);




        JLabel l8 = new JLabel("PIN :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);




        JLabel l11 = new JLabel("Services Required :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alert");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);


        JCheckBox c7 = new JCheckBox("I here by declares that the above entered details correct to the best of my knowledge.",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,20);
        add(c7);



        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(650,10,90,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(740,10,50,30);
        add(l13);


        s = new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(250,720,100,30);
        s.addActionListener(this);
        add(s);


        c = new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(420,720,100,30);
        c.addActionListener(this);
        add(c);



        getContentPane().setBackground(new Color(215,252,252));
        setLayout(null);
        setSize(850,800);
        setLocation(400,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if(r1.isSelected()){
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        } else if (r4.isSelected()) {
            atype = "Recurring Deposit Accoun";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = ""+Math.abs(first7);


        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = ""+Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac += "ATM CARD";
        }
        else if(c2.isSelected()){
            fac += "Internet Banking";
        }
        else if(c3.isSelected()){
            fac += "Mobile Banking";
        }
        else if(c4.isSelected()){
            fac += "EMAIL Alert";
        }
        else if(c5.isSelected()){
            fac += "Cheque Book";
        }
        else if(c6.isSelected()){
            fac += "E-Statement";
        }



        try{
            if(e.getSource() == s){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signupthree values('"+formno+"','"+atype+"', '"+cardno+"','"+pin+"', '"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number :"+cardno+"\n Pin :"+pin);
                    new main_Class(pin);
                    setVisible(false);

                }
            } else if (e.getSource() == c) {
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();

        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }

    public static class Pin extends JFrame implements ActionListener {
        JButton b1,b2;
        JPasswordField p1,p2;
        String pin;
        Pin(String pin){
            this.pin = pin;

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
            Image i2 = i1.getImage().getScaledInstance(1330,830,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel l3 = new JLabel(i3);
            l3.setBounds(0,0,1550,830);
            add(l3);

            JLabel label1 = new JLabel("CHANGE YOUR PIN");
            label1.setBounds(480,180,400,35);
            label1.setFont(new Font("System",Font.BOLD,16));
            label1.setForeground(Color.WHITE);
            l3.add(label1);


            JLabel label2 = new JLabel("New Pin");
            label2.setBounds(480,225,400,35);
            label2.setFont(new Font("System",Font.BOLD,16));
            label2.setForeground(Color.WHITE);
            l3.add(label2);


            p1 = new JPasswordField();
            p1.setBounds(595,229,200,25);
            p1.setBackground(new Color(65,125,128));
            p1.setForeground(Color.WHITE);
            p1.setFont(new Font("Raleway",Font.BOLD,22));
            l3.add(p1);


            JLabel label3 = new JLabel("Re-enter Pin");
            label3.setBounds(480,258,400,35);
            label3.setFont(new Font("System",Font.BOLD,16));
            label3.setForeground(Color.WHITE);
            l3.add(label3);


            p2 = new JPasswordField();
            p2.setBounds(595,262,200,25);
            p2.setBackground(new Color(65,125,128));
            p2.setForeground(Color.WHITE);
            p2.setFont(new Font("Raleway",Font.BOLD,22));
            l3.add(p2);



            b1 = new JButton("CHANGE");
            b1.setBounds(687,364,150,35);
            b1.setBackground(new Color(65,125,128));
            b1.setForeground(Color.WHITE);
            b1.addActionListener(this);
            l3.add(b1);


            b2 = new JButton("BACK");
            b2.setBounds(687,408,150,35);
            b2.setBackground(new Color(65,125,128));
            b2.setForeground(Color.WHITE);
            b2.addActionListener(this);
            l3.add(b2);


            setLayout(null);
            setSize(1550,1080);
            setLocation(0,0);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String pin1 = p1.getText();
                String pin2 = p2.getText();

                if(!pin1.equals(pin2)){
                    JOptionPane.showMessageDialog(null,"Entered Pin does not match");
                    return;
                }
                if (e.getSource() == b1){
                    if (p1.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Enter New Pin");
                        return;
                    }
                    if (p2.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Re-Enter New Pin");
                        return;
                    }

                    Conn c= new Conn();
                    String q1 = "update bank set pin = '"+pin1+"' where pin ='"+pin+"'";
                    String q2 = "update login set pin = '"+pin1+"' where pin ='"+pin+"'";
                    String q3 = "update signupthree set pin = '"+pin1+"' where pin ='"+pin+"'";

                    c.statement.executeUpdate(q1);
                    c.statement.executeUpdate(q2);
                    c.statement.executeUpdate(q3);

                    JOptionPane.showMessageDialog(null,"Pin Changed Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
                if(e.getSource() == b2){
                    new main_Class(pin);
                    setVisible(false);
                }

            }
            catch (Exception E){
                E.printStackTrace();
            }
        }

        public static void main(String[] args) {
            new Pin("");
        }
    }
}
