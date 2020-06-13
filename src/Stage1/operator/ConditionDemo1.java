package Stage1.operator;

public class ConditionDemo1 {
    public static void main(String[] args) {
        //例：商品打折，如果两件商品的价格大于100则减20，并且把原件和折后价格分别输出
        //定义两个变量，分别存放两件衣服的价格
        double price1,price2;
        price1 = 80;
        price2 = 55;
        //计算两件商品的总价格
        double sum = price1+ price2;
        System.out.println("商品原价为："+sum);
        if (sum>=100){
            sum-=20;
        }
        System.out.println("折后价格为："+sum);
    }
}
