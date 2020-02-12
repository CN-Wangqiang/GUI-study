package com.wangqiang.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @version : V1.0
 * @ClassName: ImageIcon
 * @Description: 图片图标
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午3:19
 */
public class ImageIconDemo extends JFrame {
    public ImageIconDemo(){
        JLabel label = new JLabel("ImageIcon");
        URL url = ImageIconDemo.class.getResource("2.jpg");
        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = this.getContentPane();
        container.add(label);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
