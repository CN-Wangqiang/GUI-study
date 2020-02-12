package com.wangqiang.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @version : V1.0
 * @ClassName: DialogDemo
 * @Description: Swing
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午2:55
 */
public class DialogDemo extends JFrame {

    public DialogDemo(){
        this.setVisible(true);
        this.setBounds(200,200,700,700);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Container container = this.getContentPane();
        //绝对布局，绝对定位
        container.setLayout(null);

        //按钮
        JButton button = new JButton("点击弹出一个对话框");
        button.setBounds(30,30,200,50);

        //点击按钮的时候弹出弹窗
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialogDemo();
            }
        });

        container.add(button);


    }
    public static void main(String[] args) {
        new DialogDemo();
    }
}


//弹窗

class MyDialogDemo extends JDialog{
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        container.add(new Label("Java"));
    }
}