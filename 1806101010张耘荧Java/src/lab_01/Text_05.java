package lab_01;
import java.util.Scanner;

public class Text_05 {
    public static void main(String[] args) {
        //���ܴӿ���̨������
        Scanner input=new Scanner(System.in);
        System.out.println("������ɼ������");
        //���ܶ���n
        int score=input.nextInt();
        String str="";

        if (score==1){
            str="������";
        }
        else if (score==2){
            str="����";
        }
        else if(score==3){
            str="�е�";
        }
        else if (score==4){
            str="����";
        }
        else if(score==5){
            str="����";
        }
        System.out.println("�ɼ��ȼ���"+str);
    }
}
