package com.wangqiang.lesson06;

import javax.swing.*;
import java.awt.*;

/**
 * @version : V1.0
 * @ClassName: TestTextDemo01
 * @Description: 密码框
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午4:18
 */
public class TestTextDemo02 extends JFrame {
    public TestTextDemo02(){
        Container contentPane = this.getContentPane();

        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');

        contentPane.add(passwordField);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TestTextDemo02();
    }
}
