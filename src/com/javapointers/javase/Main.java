package com.javapointers.javase;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main implements ActionListener{

    JFrame frame;
    JLabel label;

    public Main() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout(10,10));
        frame.setLocationRelativeTo(null);

        GridBagLayout numlay = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;

        JPanel panel = new JPanel();
        panel.setLayout(numlay);

        label = new JLabel("0", SwingConstants.CENTER);
        c.gridx = 1;
        c.gridy =0;
        c.gridwidth = 1;
        panel.add(label, c);

        JButton plus = new JButton("+");
        c.gridx = 0;
        c.gridy = 1;
        plus.setActionCommand("+");
        plus.addActionListener(this);
        panel.add(plus,c);

        JButton minus = new JButton("-");
        c.gridx = 1;
        c.gridy = 1;
        minus.setActionCommand("-");
        minus.addActionListener(this);
        panel.add(minus,c);

        JButton times = new JButton("*");
        c.gridx = 2;
        c.gridy = 1;
        times.setActionCommand("*");
        times.addActionListener(this);
        panel.add(times,c);

        JButton seven = new JButton("7");
        c.gridx = 0;
        c.gridy = 2;
        seven.setActionCommand("7");
        seven.addActionListener(this);
        panel.add(seven,c);

        JButton eight = new JButton("8");
        c.gridx = 1;
        c.gridy = 2;
        eight.setActionCommand("8");
        eight.addActionListener(this);
        panel.add(eight,c);

        JButton nine = new JButton("9");
        c.gridx = 2;
        c.gridy = 2;
        nine.setActionCommand("9");
        nine.addActionListener(this);
        panel.add(nine,c);

        JButton four = new JButton("4");
        c.gridx = 0;
        c.gridy = 3;
        four.setActionCommand("4");
        four.addActionListener(this);
        panel.add(four,c);

        JButton five = new JButton("5");
        c.gridx = 1;
        c.gridy = 3;
        five.setActionCommand("5");
        five.addActionListener(this);
        panel.add(five,c);

        JButton six = new JButton("6");
        c.gridx = 2;
        c.gridy = 3;
        six.setActionCommand("6");
        six.addActionListener(this);
        panel.add(six,c);

        JButton one = new JButton("1");
        c.gridx = 0;
        c.gridy = 4;
        one.setActionCommand("1");
        one.addActionListener(this);
        panel.add(one,c);

        JButton two = new JButton("2");
        c.gridx = 1;
        c.gridy = 4;
        two.setActionCommand("2");
        two.addActionListener(this);
        panel.add(two,c);

        JButton three = new JButton("3");
        c.gridx = 2;
        c.gridy = 4;
        three.setActionCommand("3");
        three.addActionListener(this);
        panel.add(three,c);

        JButton divide = new JButton(":");
        c.gridx = 0;
        c.gridy = 5;
        divide.setActionCommand("/");
        divide.addActionListener(this);
        panel.add(divide,c);

        JButton zero = new JButton("0");
        c.gridx = 1;
        c.gridy = 5;
        zero.setActionCommand("0");
        zero.addActionListener(this);
        panel.add(zero,c);

        JButton point = new JButton(".");
        c.gridx = 2;
        c.gridy = 5;
        point.setActionCommand(".");
        point.addActionListener(this);
        panel.add(point,c);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        Main Main = new Main();
    }
}
