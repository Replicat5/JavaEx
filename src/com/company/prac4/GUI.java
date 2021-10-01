
//Не рабочий код
package com.company.prac4;
import javax.swing.*;
import java.awt.*;


public class GUI extends JFrame{
    private JPanel panel = new JPanel();
    private JButton button1 = new JButton();
    private JButton button2 = new JButton();
    private JLabel lastscorelabel = new JLabel();
    private JLabel resultlabel = new JLabel();
    private JLabel winlabel = new JLabel();

    private int mil = 0, rea = 0;

    GUI(){

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        panel.add(button1);
        panel.add(button2);
        button1.setBounds(30,30,50,50);
        button2.setBounds(30,30,50,50);
        button1.addActionListener(e -> {
            mil++;
            upd("AC Milan");
        });
        button2.addActionListener(e -> {
            rea++;
            upd("Real Madrid");
        });
    }

    void upd(String last){
        lastscorelabel.setText("Last score: " + last);
        resultlabel.setText("Result: "+ mil + " X " + rea);
        String mr = "DRAW";
        if (mil > rea)
            mr = "AC Milan";
        else if (mil < rea)
            mr = "Real Madrid";
        winlabel.setText("Winner: "+ mr);
    }
}