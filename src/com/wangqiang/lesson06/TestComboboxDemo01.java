package com.wangqiang.lesson06;

import javax.swing.*;
import java.awt.*;

/**
 * @version : V1.0
 * @ClassName: TestComboboxDemo01
 * @Description: 下拉框
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午4:05
 */
public class TestComboboxDemo01 extends JFrame {
    public TestComboboxDemo01(){
        Container contentPane = this.getContentPane();

        JComboBox status = new JComboBox();
        status.addItem(null);
        status.addItem("正在热映");
        status.addItem("已下架");
        status.addItem("即将上映");


        contentPane.add(status);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TestComboboxDemo01();
    }
}
