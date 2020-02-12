package com.wangqiang.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @version : V1.0
 * @ClassName: TestWindow
 * @Description: AWT窗口监听
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午2:23
 */
public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame{
    public WindowFrame(){
        setBackground(Color.pink);
        setBounds(100,100,200,200);

        setVisible(true);
        addWindowListener(new MyWindowListener());
    }

    class MyWindowListener extends WindowAdapter{

        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("windowOpened");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("windowClosed");
        }


        //激活窗口
        @Override
        public void windowActivated(WindowEvent e) {
            WindowFrame frame = (WindowFrame) e.getSource();
            frame.setTitle("窗口被激活了");
            System.out.println("windowActivated");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            System.exit(0);
        }
    }
}
