package lab_01;
import java.util.Scanner;

public class Text_07 {
    public static void main(String[] args) {
        int n=(int)(Math.random()*100);
        //���ܴӿ���̨������
        Scanner input=new Scanner(System.in);

        while (true){
            System.out.println("������ɼ������");
            //���ܶ���n
            int guess=input.nextInt();

            if (guess !=n) {
                if (guess > n) {

                    System.out.println("�´���");
                } else if (guess < n) {

                    System.out.println("��С��");
                }
            }
            else{

                System.out.println("�¶���");
                break;
            }
        }
    }
}
