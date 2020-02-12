package com.wangqiang.snake;

import javax.swing.*;

/**
 * @version : V1.0
 * @ClassName: StartGame
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午4:30
 */
public class StartGame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(10,10,900,720);
        jFrame.setResizable(false);//窗口大小不可变
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(new GamePanel());
        jFrame.setVisible(true);
    }
}
