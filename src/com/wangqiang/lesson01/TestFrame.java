package com.wangqiang.lesson01;

import java.awt.*;

/**
 * @version : V1.0
 * @ClassName: TestFrame
 * @Description: AWT窗口
 * @Auther: wangqiang
 * @Date: 2020/2/11 下午4:08
 */
public class TestFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("我的第一个Java图像界面窗口");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setBackground(Color.BLACK);
        frame.setLocation(200,200);
        frame.setResizable(false);
    }
}
