package com.wangqiang.lesson01;

import java.awt.*;

/**
 * @version : V1.0
 * @ClassName: AWT布局练习
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2020/2/11 下午5:20
 */
public class ExDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setSize(400,200);
        frame.setLocation(300,400);
        frame.setBackground(Color.pink);
        frame.setLayout(new GridLayout(2,1));


        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));

        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));

        panel1.add(new Button("East-1"),BorderLayout.EAST);
        panel1.add(new Button("West-1"),BorderLayout.WEST);
        panel2.add(new Button("p2-btn-1"));
        panel2.add(new Button("p2-btn-2"));
        panel1.add(panel2,BorderLayout.CENTER);

        panel3.add(new Button("East-2"),BorderLayout.EAST);
        panel3.add(new Button("West-1"),BorderLayout.WEST);
        panel4.add(new Button("p4-btn-1"));
        panel4.add(new Button("p4-btn-2"));
        panel4.add(new Button("p4-btn-3"));
        panel4.add(new Button("p4-btn-4"));
        panel3.add(panel4,BorderLayout.CENTER);

        frame.add(panel1);
        frame.add(panel3);

        frame.setVisible(true);


    }
}
