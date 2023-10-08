
import java.util.Arrays;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        int score[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("依次输入5位同学的成绩");
        for (int i=0;i<score.length;i++)
        {
            score[i]=scanner.nextInt();
        }
        Arrays.sort(score);
        System.out.println("以下是五位同学的成绩，按成绩降序排序");
        for (int i=score.length-1;i>=0;i--)
        {
            System.out.print(score[i]+",");
        }
    }
}
