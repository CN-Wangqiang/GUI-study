package com.wangqiang.lesson04;

import javax.swing.*;
import java.awt.*;

/**
 * @version : V1.0
 * @ClassName: JFrameDemo
 * @Description: 面板
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午2:41
 */
public class JFrameDemo {

    //init();初试化

    public void init(){
        JFrame frame = new JFrame("这是一个Frame窗口");
        frame.setVisible(true);
        frame.setBounds(100,100,300,300);

        JLabel label = new JLabel("Java");
        frame.add(label);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        Container container = frame.getContentPane();
        container.setBackground(Color.pink);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameDemo().init();
    }
}
