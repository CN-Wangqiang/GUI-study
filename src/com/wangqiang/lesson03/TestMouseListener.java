package com.wangqiang.lesson03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @version : V1.0
 * @ClassName: TestMouseListener
 * @Description: 简易画笔
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午2:01
 */
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}

class MyFrame extends Frame{

    ArrayList points;


    //初始化界面
    public MyFrame(String title)  {
        super(title);
        setBounds(200,200,400,300);
        //添加鼠标监听器
        this.addMouseListener(new MyMouseListener());

        //存鼠标的点击
        points = new ArrayList();

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //画画，监听鼠标的事件
//        super.paint(g);
        Iterator iterator = points.iterator();
        while (iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.pink);
            g.fillOval(point.x,point.y,10,10);
        }

    }

    //添加一个点到界面上
    public void addPoint(Point point){
        points.add(point);
    }


    //适配器模式
    private class MyMouseListener extends MouseAdapter{
        //鼠标 按下 弹起 按住不放
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame frame = (MyFrame) e.getSource();
            //这个点就是鼠标的点
            //把这个点画出来
            frame.addPoint(new Point(e.getX(), e.getY()));

            //每次点击鼠标都需要重新画一遍 刷新
            frame.repaint();
        }
    }
}
