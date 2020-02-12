package com.wangqiang.lesson03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @version : V1.0
 * @ClassName: TestKeyListener
 * @Description: AWT键盘监听
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午2:34
 */
public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}

class KeyFrame extends Frame{
    public KeyFrame(){
        setBounds(1,2,300,400);
        setVisible(true);

        //匿名内部类的写法
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //获取键盘的键
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_UP){
                    System.out.println("你输入了上键");
                }

            }
        });

    }
}