package com.wangqiang.snake;

import jdk.nashorn.internal.ir.CallNode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


/**
 * @version : V1.0
 * @ClassName: GamePanel
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2020/2/12 下午4:34
 */
public class GamePanel extends JPanel implements KeyListener, ActionListener {

    //定义蛇的数据结构
    int length;//蛇的长度
    int[] snakeX = new int[600];
    int[] snakeY = new int[500];

    //定义蛇移动的方向
    String direction;

    //食物的坐标
    int foodX,foodY;
    Random random = new Random();

    //当前游戏状态：开始 停止
    boolean isStart = false;

    //游戏失败
    boolean isFail = false;

    //积分成绩
    int score;

    //定时器
    Timer timer = new Timer(100,this);

    //构造器
    public GamePanel(){
        init();
        this.setFocusable(true);//获得焦点事件
        this.addKeyListener(this);//获得键盘监听器
        timer.start();//游戏一开始就开启定时器
    }

    //初试化方法
    public void init(){
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100;//头的坐标
        snakeX[1] = 75;snakeY[1] = 100;//第一个身体的坐标
        snakeX[2] = 50;snakeY[2] = 100;//第二个身体的坐标
        direction = "R";

        //把食物随机分布在界面上
        foodX = 25 + 25*random.nextInt(34);
        foodY = 75 + 25*random.nextInt(24);
        score = 0;
    }


    //绘制面板
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);
        //绘制静态面板
        Data.header.paintIcon(this,g,25,10);//头部广告栏画上去
        g.fillRect(25,75,850,600);

        //画积分
        g.setColor(Color.white);
        g.setFont(new Font("微软雅黑",Font.BOLD,15));
        g.drawString("长度"+length,780,35);
        g.drawString("分数"+score,780,60);

        //画食物
        Data.food.paintIcon(this,g,foodX,foodY);

        // 把小蛇画上去
        if(direction.equals("R")){
            Data.right.paintIcon(this,g,snakeX[0],snakeY[0]); // 蛇头初试化向右
        }else if(direction.equals("L")){
            Data.left.paintIcon(this,g,snakeX[0],snakeY[0]); // 蛇头初试化向左
        }else if(direction.equals("U")){
            Data.up.paintIcon(this,g,snakeX[0],snakeY[0]); // 蛇头初试化向上
        }else if(direction.equals("D")){
            Data.down.paintIcon(this,g,snakeX[0],snakeY[0]); // 蛇头初试化向下
        }

        for(int i = 1; i < length ; i++){
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);  //身体的坐标
        }



        //游戏状态
        if (isStart == false){
            g.setColor(Color.white);
            //设置字体
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("按下空格开始游戏",300,300);
        }

        if (isFail == true){
            g.setColor(Color.red);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("游戏失败",300,300);
        }

    }



    //键盘的监听事件
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_SPACE){
            if (isFail){
                //重新开始
                isFail = false;
                init();

            }else {
                isStart = !isStart;
            }
            repaint();
        }
        //小蛇移动
        if (keyCode == KeyEvent.VK_UP){
            direction = "U";
        }else if(keyCode == KeyEvent.VK_DOWN){
            direction = "D";
        }else if(keyCode == KeyEvent.VK_LEFT){
            direction = "L";
        }else if(keyCode == KeyEvent.VK_RIGHT){
            direction = "R";
        }
    }

    //事件监听 需要通过固定事件来刷新 1秒=10次
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart && isFail == false){
            //吃食物
            if (snakeX[0] == foodX && snakeY[0] == foodY){
                //长度+1
                length++;
                //分数+10
                score = score + 10;
                //食物刷新
                foodX = 25 + 25*random.nextInt(34);  //  850/25=34
                foodY = 75 + 25*random.nextInt(24);  //  650/25=24
            }
            //移动
            for (int i = length -1; i >0; i--){ //后一节的位置移到前一节
                snakeX[i] = snakeX[i -1];
                snakeY[i] = snakeY[i -1];
            }
            //走向
            if (direction.equals("R")){
                snakeX[0] = snakeX[0] + 25;
                if(snakeX[0] > 850){  //边界判断
                    snakeX[0] = 25;
                }
            }else if(direction.equals("L")){
                snakeX[0] = snakeX[0] - 25;
                if(snakeX[0] < 25){
                    snakeX[0] = 850;
                }
            }else if(direction.equals("D")){
                snakeY[0] = snakeY[0] + 25;
                if(snakeY[0] > 650){
                    snakeY[0] = 75;
                }
            }else if(direction.equals("U")){
                snakeY[0] = snakeY[0] - 25;
                if(snakeY[0] < 75){
                    snakeY[0] = 650;
                }
            }

            //失败判定，撞到自己
            for (int i = 1;i < length; i++){
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]){
                    isFail = true;
                }
            }

            repaint();  //重画页面
        }
        timer.start();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }


}
