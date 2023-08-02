package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Quiz App");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Be on time: Arrive or login to the quiz platform at the scheduled." + "<br><br>" +
                "2. No cheating: Do not use any unauthorized resourcesor during the quiz." + "<br><br>" +
                "3. Listen to instructions: Pay attention to the quiz instructor's instructions." + "<br><br>" +
                "4. Clear your doubts: If you have any questions  about the quiz related, ask before the quiz begins." + "<br><br>" +
                "5. Stay within the allocated time: Manage your time wisely and attempt all questions within the time limit provided." + "<br><br>" +
                "7. Use approved materials only: Ensure you are using only the permitted writing instruments, calculators, or any other materials specified for the quiz." + "<br><br>" +
                "8. Submitting your answers: Follow the instructions for submitting your answers at the end of the quiz accurately and within the specified timeframe." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
