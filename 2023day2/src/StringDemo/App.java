package StringDemo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean flag=true;
        StringBuffer stu=new StringBuffer();
        while (flag){
            Menu.meNu();
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            switch (a){
                case 1:
                    System.out.println("请输入学生信息");
                    String s=scanner.next();
                    stu.append(addInfomation(s));break;
                case 2:
                    System.out.println("请输入修改学校的信息:");
                    String s1 = scanner.next();
                    updateInfomation(stu,s1);break;
                case 3:
                    System.out.println("请输入要删除的信息");
                    deleteInfomation(stu);
                break;
                default:
                    System.out.println("输入错误");
            }
        }

    }
    //输入信息
    public static String addInfomation(String info){
        String[] arr =info.split("；");

        Student student=new Student();
        student.setName(arr[0]);
        student.setGrade(arr[1]);
        student.setSchool(arr[2]);
        student.setAge(arr[3]);
        student.setSex(arr[4]);
        student.setPhone(arr[5]);
        System.out.println(student.toString());

        return student.toString();
    }
    //修改信息
    public static int updateInfomation(StringBuffer stringBuffer,String s){
        String str =  stringBuffer.toString();
        String[] arr = str.split(",");
        int end = 0;
        end = arr[0].length()+arr[1].length()+arr[2].length()+2;
        int start = end-7;
        stringBuffer.delete(start,end-1);
        System.out.println(stringBuffer);
        stringBuffer.insert(start,s);
        System.out.println(stringBuffer);
        return 0;
    }
    //删除信息
    public static int deleteInfomation(StringBuffer stringBuffer){
        String str =  stringBuffer.toString();
        Scanner scanner=new Scanner(System.in);
        String[] arr = str.split(",");
        System.out.println(stringBuffer);
        Menu.deleteMenu();
        int s2=scanner.nextInt()-1;
        int end = 0;
        for(int x=0;x<=s2;x=x+1){
            end=arr[x].length()+end;
        }
        int start=end-arr[s2].length();
        stringBuffer.delete(start,end+1);
        System.out.println(stringBuffer);
        return 0;
    }
}
