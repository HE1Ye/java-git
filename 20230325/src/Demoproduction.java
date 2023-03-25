public class Demoproduction {
    public static void main(String[] args) {
    demoClass(50,320);

}
    public static void demoClass(int size,int num) {
        Production[] arr = new Production[size];
        for (int i = 0; i < size; i++) {
            Production production = new Production();
            production.setIntroduction("美轮美奂");
            production.setName("卫衣");
            production.setPrice((1 + i) * 10);
            production.setStore("淘宝");
            arr[i] = production;
        }
        int len = arr.length;
        int flag = len / 2 - 1;
        int count = 0;
        int i = 0, j = len - 1;
        boolean open = true;
        while (open) {
            count += 1;
            flag = (i + j) / 2;
            if (arr[flag].getPrice() == num) {
                System.out.println("数字位于" + (flag + 1) + "位");
                System.out.println("查找了" + (count + 1) + "次");
                break;
            }
            if (arr[flag].getPrice() > num) {
                j = flag - 1;
            } else {
                i = flag + 1;
            }


        }
    }
}