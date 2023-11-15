import java.util.Scanner;

public class ShuZhuSumAvg {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入多少名学生？");
        int len =scanner.nextInt();
        int []sc=new int[len];
        for (int i = 0; i <sc.length ; i++) {
            System.out.println("输入成绩");
            sc[i]=scanner.nextInt();
        }
        int sum=0;
        for (int i : sc) {
            sum+=i;
        }
        System.out.println("总成绩为"+sum);
        System.out.println("平均成绩为"+sum*1.0/sc.length);


        int max=sc[0];
        for (int i = 1; i <sc.length ; i++) {
            if(sc[i]>max){
                max=sc[i];
            }
        }
        System.out.println("最大值为"+max);
    }
}
