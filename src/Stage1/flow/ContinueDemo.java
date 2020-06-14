package Stage1.flow;
//continue语句的作用是结束当前循环的执行，但是继续下次循环
//break语句是结束整个循环的执行，不会再进行下一次循环
public class ContinueDemo {
    public static void main(String[] args) {
        int k=0;
        for (int i=1;i<5;i++){
            for (int j =1;j<5;j++){
                if (j%2==0){continue;}
                k=k+j;
            }
        }
        System.out.println("k="+k);
    }
}
