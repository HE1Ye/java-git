public class Demo {
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("购票");
        sBuffer.append("购票人：吴子俊");
        System.out.println(sBuffer);
        sBuffer.insert(0,1);
        System.out.println(sBuffer);

    }
}
