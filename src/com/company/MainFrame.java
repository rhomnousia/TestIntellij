package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Johan on 12/7/13.
 */
public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private JButton jButton;
    private Toolbar toolbar;

    public MainFrame() {
        super("Time Tracker");

        setLayout(new BorderLayout());
        jButton = new JButton("Click Me!");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.appendText("Hello");
            }
        });

        add(textPanel);
        add(toolbar);
        add(jButton, BorderLayout.SOUTH);

        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
