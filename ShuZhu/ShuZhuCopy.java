import java.util.Arrays;

public class ShuZhuCopy {
    public static void main(String[] args) {
        int []x={12,43,123,53,341,343};
        int []z= Arrays.copyOf(x,4);   //复制数组  可以超过原数组的长度
        System.out.println(Arrays.toString(z));
        int []y=Arrays.copyOfRange(x,1,8);   //选择从那开始
        System.out.println(Arrays.toString(y));

        int []m=new int[5];
        System.arraycopy(x,0,m,0,5);  //不能超过设置的新数组的长度
        System.out.println(Arrays.toString(m));

    }
}
