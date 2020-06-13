package Stage1.flow;

import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        //从键盘接受数据
        Scanner sc = new Scanner(System.in);
        int n;
        while (true){
            n = sc.nextInt();
            if(n==0){break;}
            System.out.println(n);

        }
    }
}
