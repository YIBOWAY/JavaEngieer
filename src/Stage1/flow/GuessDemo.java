package Stage1.flow;

import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args) {
        //设置要猜的值
        int number = (int)(Math.random()*10);//Math.random()得到的是[0,1)之间的随机数
        int guess;
        System.out.println("猜一个介于1到10之间的数：");
        do {
            System.out.println("请输入您猜测的数：");
            Scanner in = new Scanner(System.in);
            guess = in.nextInt();
            if (guess>number){
                System.out.println("太大了！");
            }else if (guess<number){
                System.out.println("太小了！");
            }
        }while (number!=guess);
        System.out.println("您猜中了，答案为："+number);
    }
}
