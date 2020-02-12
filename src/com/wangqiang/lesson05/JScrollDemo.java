package com.wangqiang.lesson05;

import javax.swing.*;
import java.awt.*;

/**
 * @version : V1.0
 * @ClassName: JScrollDemo
 * @Description: 带滚动条的面板
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午3:39
 */
public class JScrollDemo extends JFrame {
    public static void main(String[] args) {
        new JScrollDemo();
    }

    public JScrollDemo(){
        Container container = this.getContentPane();

        JTextArea textArea = new JTextArea();
        textArea.setText("Java");

        JScrollPane scrollPane = new JScrollPane(textArea);
        container.add(scrollPane);

        this.setVisible(true);
        this.setBounds(100,100,300,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
