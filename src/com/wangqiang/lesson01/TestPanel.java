package com.wangqiang.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @version : V1.0
 * @ClassName: TestPanel
 * @Description: AWT面板
 * @Auther: wangqiang
 * @Date: 2020/2/11 下午4:26
 */
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();

        frame.setLayout(null);

        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(158, 232, 23));

        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(100,100,100));

        frame.add(panel);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
