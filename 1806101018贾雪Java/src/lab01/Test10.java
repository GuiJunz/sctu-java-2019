package lab01;
import java.util.Scanner;
public class Test10 {
    public static void main(String[] args){
        System.out.println("请输入一个数：");
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();

        boolean flag=true;//是素数
        for (int i = 2; i <x ; i++) {
            if (x%i==0){
                flag=false;//不是素数
            }
        }
        if (flag){
            System.out.println(x+"是素数");
        }
        else {
            System.out.println(x+"不是素数");
        }
    }
}
