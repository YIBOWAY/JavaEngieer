package Stage1.operator;

public class MathDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int result;//存放结果
        //加法
        result = num1+num2;
        System.out.println(num1+"+"+num2+"="+result);
        //字符串连接
        System.out.println(""+num1+num2);//此时因为前面有了字符串（空字符串），所以后续的运算就是字符串之间的连接，输出结果为105
        //除法
        result = num1/num2;
        System.out.println(num1+"/"+num2+"="+result);
        //分子分母都是整型时，结果为整除后的结果
        System.out.println(13/5);
        System.out.println("13.0/5"+"="+13.0/5);
    }
}
