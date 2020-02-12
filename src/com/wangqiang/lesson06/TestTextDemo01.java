package com.wangqiang.lesson06;

import javax.swing.*;
import java.awt.*;

/**
 * @version : V1.0
 * @ClassName: TestTextDemo01
 * @Description: 文本框
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午4:18
 */
public class TestTextDemo01 extends JFrame {
    public TestTextDemo01(){
        Container contentPane = this.getContentPane();

        JTextField textField = new JTextField("hello");
        JTextField textField2 = new JTextField("world");

        contentPane.add(textField,BorderLayout.SOUTH);
        contentPane.add(textField2,BorderLayout.NORTH);


        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new TestTextDemo01();
    }
}
