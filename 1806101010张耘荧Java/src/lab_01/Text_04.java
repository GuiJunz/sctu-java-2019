package lab_01;
import java.util.Scanner;


public class Text_04 {
    public static void main(String[] args) {
        //���ܴӿ���̨������
        Scanner input=new Scanner(System.in);
        System.out.println("������һ������n��ʹ�����1+������+n,n=");
        //���ܶ���n
        int n=input.nextInt();
        int sum1=0;

        //forѭ��
        for (int i = 1; i <=n; i++) {
            sum1=sum1+i;
        }
        System.out.println("forѭ�����Ľ��"+sum1);

        //whileѭ��
        int j=1;
        int sum2=0;
        while (j<=n){
            sum2=sum2+j;
            j++;
        }
        System.out.println("whileѭ�����Ľ��"+sum2);

        //do while ѭ��
        int x=1;
        int sum3=0;
        do{
            sum3=sum3+x;
            x++;
        }
        while (x<=n);
        System.out.println("do whileѭ�����Ľ��"+sum3);
    }
}
