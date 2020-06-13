package Stage1.flow;

public class forDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int n=1;n<=5;n++){//局部变量只在定义它的大括号内有效
            sum+=n;
            //if(n==5)break;
        }
        System.out.println("sum="+sum);
    }
}
