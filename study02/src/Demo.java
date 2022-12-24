public class Demo {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[0] = "1";
        str[1] = "2";
        str[2] = "3";
        str[3] = "4";
        str[4] = "5";
        int b = 0;
        while (createdate(b)) {
            for (String s : str) {

                if (s == "2") {
                    System.out.println("开始执行break");
                    continue;
                } else {
                    System.out.println(s);
                }
            }
            b = b + 2;
            continue;
        }
        System.out.println("for执行结束");
        System.out.println();
    }


    public static Boolean createdate(int b){
        System.out.println("判断");
        if(b>=3){
            System.out.println("off");
            return false;
        }else {
            System.out.println("on");
            return true;
        }
    }
}







