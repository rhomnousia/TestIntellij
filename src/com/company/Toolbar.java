package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Johan on 12/7/13.
 */
public class Toolbar extends JPanel {

    private JButton button;

    public Toolbar() {
        button = new JButton("hello");
        setLayout(new FlowLayout());
        add(button);

    }
}
