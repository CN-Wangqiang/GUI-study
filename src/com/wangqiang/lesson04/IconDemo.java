package com.wangqiang.lesson04;

import javax.swing.*;
import java.awt.*;

/**
 * @version : V1.0
 * @ClassName: IconDemo
 * @Description: 图标
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午3:09
 */
public class IconDemo extends JFrame implements Icon {

    private int width;
    private int height;

    public IconDemo() {
    }

    public IconDemo(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void init(){
        IconDemo iconDemo = new IconDemo(15, 15);
        //图标放在标签上，也可以放在按钮上
        JLabel label = new JLabel("Java", iconDemo, SwingConstants.CENTER);
        Container container = getContentPane();
        container.add(label);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new IconDemo().init();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}
