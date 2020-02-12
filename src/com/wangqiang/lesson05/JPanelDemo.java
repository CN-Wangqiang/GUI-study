package com.wangqiang.lesson05;

import javax.swing.*;
import java.awt.*;

/**
 * @version : V1.0
 * @ClassName: JPanel
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午3:27
 */
public class JPanelDemo extends JFrame {
    public JPanelDemo() {
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,1,10,10));

        JPanel panel = new JPanel(new GridLayout(2,1));

        panel.add(new JButton("1"));
        panel.add(new JButton("1"));
        panel.add(new JButton("1"));

        container.add(panel);

        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new JPanelDemo();
    }
}
