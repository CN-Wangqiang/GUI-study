package com.wangqiang.lesson03;

import java.awt.*;

/**
 * @version : V1.0
 * @ClassName: TestPaint
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午1:52
 */
public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }

}

class MyPaint extends Frame{

    public void loadFrame(){
        setBounds(200,200,600,400);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        g.setColor(Color.pink);
//        g.drawOval(100,100,100,100);
        g.fillOval(100,100,100,100);

        g.setColor(Color.green);
        g.fillRect(150,200,200,200);

    }
}
