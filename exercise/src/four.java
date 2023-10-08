
import java.util.Arrays;

public class four {
    public static void main(String[] args) {
        char[] chars ={'a','c','q','s','d','e','h'};
        System.out.print("输出原始数组");
        for (int i=0;i<chars.length;i++)
        {
            System.out.print(chars[i]+",");
        }
        System.out.println();
        Arrays.sort(chars);
        System.out.print("输出按照顺序排序的字母");
        for (int i=0;i<chars.length;i++)
        {
            System.out.print(chars[i]+",");
        }
        System.out.println();
        System.out.print("输出按照逆序排序的字母");
        for (int i=chars.length-1;i>=0;i--)
        {
            System.out.print(chars[i]+",");
        }

    }
}
