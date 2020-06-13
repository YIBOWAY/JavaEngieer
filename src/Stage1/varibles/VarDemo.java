package Stage1.varibles;

public class VarDemo {
    public static void main(String[] args) {
        //定义两个整型变量x,y
//        int x=3, y=5;
        int x,y;
        x=3;y=5;
        System.out.println("x="+x);
        System.out.println("y="+y);
        //关于换行的问题
        System.out.print(x+"\t"+y+'\n');
//        System.out.println();//代表一个换行
        System.out.print(x+","+y);
        System.out.println("\n\'"+x+"\'");
        //定义一个汉字的字符
        char ch = '慕';
//        char 中文 = '中';不建议中文作为变量名
        System.out.println(ch);
//        System.out.println(中文);
        //用科学计数法表示浮点型数据
        double d = 1.23E5;//表示1.23*10的五次方
        float f = 1.23e5f;
        double d1 = .2;//表示0.2
        System.out.println("d="+d);
        System.out.println("d1="+d1);
        System.out.println("f="+f);
        long var = 190000000;
        System.out.println(var);


    }
}
