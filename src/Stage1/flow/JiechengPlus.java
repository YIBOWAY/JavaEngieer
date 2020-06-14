package Stage1.flow;

public class JiechengPlus {
    public static void main(String[] args) {
        int s = 1,sum=0;//太大的值，用长整型存储
        for (int i=1;i<=4;i++){
            s=1;//重置s的值
            for (int j=1;j<=i;j++){
                s=s*j;//存放阶乘计算结果
            }
            sum=sum+s;
        }
        System.out.println("1!+2!+3!+4!="+sum);
    }
}
