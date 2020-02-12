package com.wangqiang.lesson01;

import java.awt.*;

/**
 * @version : V1.0
 * @ClassName: TestFlowLayout
 * @Description: 流式布局
 * @Auther: wangqiang
 * @Date: 2020/2/11 下午4:59
 */
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        frame.setLayout(new FlowLayout());

        frame.setSize(200,200);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);


    }
}
