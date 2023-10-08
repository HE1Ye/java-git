public class exercise1 {
    public static void main(String[] args) {
        int[] arr={1,2};
        System.out.println(twoSum(arr,3)[1]);
    }
    static public int[] twoSum(int[] nums, int target) {
        int a,b;
        int[] arr= new int[2];
        for(a=0;a<nums.length;a++){
            for(b=a+1;b<nums.length;b++){
                if(nums[a]+nums[b]==target){
                    arr[0]=a;
                    arr[1]=b;
                    return arr;
                }
            }
        }
        arr[0]=0;
        return arr;
    }
}
