package com.wangqiang.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @version : V1.0
 * @ClassName: TestMonitor
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2020/2/11 下午6:13
 */
public class TestMonitor {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button start = new Button("start");
        Button stop = new Button("stop");

        start.setActionCommand("start");
        stop.setActionCommand("stop");

        MyMonitor myMonitor = new MyMonitor();

        start.addActionListener(myMonitor);
        stop.addActionListener(myMonitor);

        frame.add(start,BorderLayout.NORTH);
        frame.add(stop,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);


    }
}

class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand()+"按钮被点击");
    }
}
