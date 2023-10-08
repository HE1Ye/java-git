
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        double Money[] = new double[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<Money.length;i++)
        {
            System.out.print("请输入第"+(i+1)+"件商品的价格: ");
            Money[i]=scanner.nextDouble();
        }
        double Sum=0;
        for (int i=0;i<Money.length;i++)
        {
            System.out.println("第"+(i+1)+"件商品的价格是"+(Money[i]));
            Sum+=Money[i];
        }
        System.out.println("总共的价格是"+Sum);
    }
}
