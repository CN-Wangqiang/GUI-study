package com.wangqiang.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @version : V1.0
 * @ClassName: JButtonDemo01
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午3:49
 */
public class JButtonDemo01  extends JFrame {
    public JButtonDemo01(){
        Container container = this.getContentPane();
        URL url = JButtonDemo01.class.getResource("2.jpg");
        ImageIcon icon = new ImageIcon(url);

        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("图片按钮");

        container.add(button);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonDemo01();
    }
}
