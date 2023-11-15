

public class ShuZhuXuanZhe {
    public static void main(String[] args) {
       /* int []sum={1,4,2,6,8,3};
        for (int z = 0; z <sum.length-1 ; z++) {
            int mixsum=z;
            for (int i = z+1; i <sum.length ; i++) {
                if(sum[mixsum]>sum[i]){
                    mixsum=i;
                }
            }
            if(mixsum!=z){
                int temp=sum[z];
                sum[z]=sum[mixsum];
                sum[mixsum]=temp;
            }
            for (int i : sum) {
                System.out.print(i);
            }
            System.out.println();

        }*/      //固定数组的选择排序
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("要输入多少数字");
        int len=scanner.nextInt();

       int[]sum =new int[len];
        for (int i = 0; i <len ; i++) {
            System.out.println("输入数字");
            sum[i]=scanner.nextInt();
        }

        System.out.println("数组里面数字为");
        for (int i : sum) {
            System.out.print(i+"\t");
        }
        System.out.println();

        for (int z = 0; z <sum.length-1 ; z++) {   //第几轮循环

            int mix=z;

            for (int i = z+1; i <sum.length ; i++) {
                if(sum[mix]>sum[i]){
                    mix=i;
                }

            }
            if(mix!=z){
                int temp=sum[z];
                sum[z]=sum[mix];
                sum[mix]=temp;
            }
            System.out.println("第"+(z+1)+"轮循环");
            for (int i : sum) {
                System.out.print(i+"\t");
            }
            System.out.println();

        }
*/          //自定义数组的选择排序
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("要输入多少数字");
        int len = scanner.nextInt();

        int[] sum = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("输入数字");
            sum[i] = scanner.nextInt();
        }

        System.out.println("数组里面数字为");
        for (int i : sum) {
            System.out.print(i + "\t");
        }
        System.out.println();


        for (int i = 0; i < sum.length - 1; i++) {

            for (int j = 0; j < sum.length - 1 - i; j++) {
                if (sum[j] > sum[j + 1]) {
                    int temp = sum[j];
                    sum[j] = sum[j + 1];
                    sum[j + 1] = temp;
                }

            }

        }
        for (int i1 : sum) {
            System.out.print(i1+"\t");
        }
*/      //自定义数组的冒泡排序
        /*int []x={11,231,32,1,42};
        Arrays.sort(x);        //快速排序
        for (int i : x) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println(Arrays.toString(x));     //输出数组
        int []z=new int[5];
        Arrays.fill(z,150);        //给数组赋值
        Arrays.fill(z,1,3,20 );   //包含1 不包含3
        System.out.println(Arrays.toString(z));
*/         //fill shour  tostring


     /*   int []x={11,231,32,1,42};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        int i = Arrays.binarySearch(x, 32);    //二分查找
        System.out.println(i);   //二分查找*/  //二分查找（需要排序）   负数要么就是没有，要么就是没排序
    }
}

