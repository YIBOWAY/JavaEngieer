package Stage1.flow;

public class StarDemo2 {
    public static void main(String[] args) {
        // 输出星号组成的梯形
        int max=5;//外重循环行数

        System.out.println("输出星号组成的梯形：");
        for(int line=1;line<=max;line++){
            for(int loop_1=1;loop_1<max-line;loop_1++){
                System.out.print(" ");//不能使用println进行输出,println自带换行
            }
            for(int loop_2=2*line+1;loop_2>0;loop_2--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
