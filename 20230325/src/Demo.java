public class Demo {

    public static void main(String[] args) {
        demoClass02(66);
    }
    public static void demoClass(int size){
        Student[] arr= new Student[size];
        for(int i=0;i<size;i++){
            Student student=new Student();
            student.setAge(12);
            student.setSex("男");
            student.setName("wuzijun"+(i+1));
            student.setSchool("西安工程大学");
            System.out.println(student.toString());
            arr[i]=student;
        }
        for (Student student:arr){
            System.out.println(student.toString());
        }


    }
    public static void demoClass01(int num){
        int[] arr={1,2,3,4,5,6,7,8};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("该数字在第"+(i+1)+"位");
            }
        }
    }
    public static void demoClass02(int num){
        int[] arr={11,22,33,44,55,66,77,88,99,100,110,120,130,140,150};
        int len= arr.length;
        int flag=len/2-1;
        int count=0;
        int i=0,j=len-1;
        boolean open=true;
        while (open){
            count +=1;
            flag=(i+j)/2;
            if (arr[flag]==num){
                System.out.println("数字位于"+(flag+1)+"位");
                System.out.println("查找了"+(count+1)+"次");
                break;
            }
            if (arr[flag]>num){
                j=flag-1;
            }else {
                i=flag+1;
            }
        }
    }
}
