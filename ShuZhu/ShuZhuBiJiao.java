import java.util.Arrays;

public class ShuZhuBiJiao {
    public static void main(String[] args) {
        int []x={12,23,34,45,56};
        int []y= Arrays.copyOf(x,x.length);

        boolean b=Arrays.equals(x,y);
        System.out.println("b = " + b);

        //int i=Arrays.compare(x,y);    //比较相同为0   前面大为1  后面大为—1
    }
}
