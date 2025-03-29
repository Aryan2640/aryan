
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname,tfname1,tfname2;
    Main(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading =new JLabel("Simple Minds");
        heading.setBounds(750,10,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.BLUE);
        add(heading);


        JLabel name =new JLabel("Enter Your Name:");
        name.setBounds(810,70,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(Color.BLUE);
        add(name);

        tfname=new JTextField();
        tfname.setBounds(735,100,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

        JLabel username =new JLabel("Enter Your username:");
        username.setBounds(810,190,300,20);
        username.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        username.setForeground(Color.BLUE);
        add(username);

        tfname1=new JTextField();
        tfname1.setBounds(735,220,300,25);
        tfname1.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname1);





        JLabel Password =new JLabel("Enter Your password:");
        Password.setBounds(805,310,300,20);
        Password.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        Password.setForeground(Color.BLUE);
        add(Password);


        tfname2=new JTextField();
        tfname2.setBounds(735,340,300,25);
        tfname2.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname2);

        rules=new JButton("Rules");
        rules.setBounds(735,410,120,25);
        rules.setBackground(new Color(30,144,250));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(915,410,120,25);
        back.setBackground(new Color(30,144,250));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(1200,500);
        setLocation(220,220);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource()==rules){
            String name=tfname.getText();
                 setVisible(false);
                 new Rules(name);
        }

        else if (ae.getSource()==back) {
            setVisible(false);
        }

    }

    public static void main(String[] args) {


       new Main();
    }


}