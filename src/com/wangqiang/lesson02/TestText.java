package com.wangqiang.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @version : V1.0
 * @ClassName: TestText
 * @Description: AWT文本域
 * @Auther: wangqiang
 * @Date: 2020/2/11 下午6:20
 */
public class TestText {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends Frame{
    public MyFrame(){
        TextField textField = new TextField();
        add(textField);
        MyActionListen2 myActionListen2 = new MyActionListen2();
        textField.addActionListener(myActionListen2);

        setVisible(true);
        pack();
    }
}

class MyActionListen2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field= (TextField) e.getSource();
        System.out.println(field.getText());
    }
}