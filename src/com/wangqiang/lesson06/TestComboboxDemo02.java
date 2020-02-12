package com.wangqiang.lesson06;

import javax.swing.*;
import java.awt.*;

/**
 * @version : V1.0
 * @ClassName: TestComboboxDemo02
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午4:09
 */
public class TestComboboxDemo02 extends JFrame {
    public TestComboboxDemo02(){
        Container contentPane = this.getContentPane();

        String[] contents = {"1","2","3"};
        JList jList = new JList(contents);

        contentPane.add(jList);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new TestComboboxDemo02();
    }
}
