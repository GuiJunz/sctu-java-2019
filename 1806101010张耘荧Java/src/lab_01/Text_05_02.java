package lab_01;
import java.util.Scanner;

public class Text_05_02 {
    public static void main(String[] args) {
        //���ܴӿ���̨������
        Scanner input=new Scanner(System.in);
        System.out.println("������ɼ������");
        //���ܶ���n
        int n=input.nextInt();
        String str="";

        switch (n){
            case 1:
                str="������";
                break;
            case 2:
                str="����";
                break;
            case 3:
                str="�е�";
                break;
            case 4:
                str="����";
                break;
            case 5:
                str="����";
                break;

        }
        System.out.println("�ɼ��ȼ�Ϊ"+str);
    }
}
