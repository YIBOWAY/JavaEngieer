package Stage1.flow;

public class DoWhileDemo {
    public static void main(String[] args) {
        //求一到5的累加和
        int n = 1;
        int sum = 0;//求累加赋值为0，求累乘赋值为1
        do{
            sum+=n;
            n++;
        }while (n<=5);//do-while循环至少会执行一次
        System.out.println("sum="+sum);
    }
}
