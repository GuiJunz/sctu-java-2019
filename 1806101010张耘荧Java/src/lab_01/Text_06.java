package lab_01;
import java.util.Scanner;

public class Text_06 {
    public static void main(String[] args) {
        //���ܴӿ���̨������
        Scanner input=new Scanner(System.in);
        System.out.println("������ɼ��ȼ���");
        //���ܶ���grade
        String grade=input.next();

        String str="";
        char ch = grade.charAt(0);
        input.close();
        if (ch == 'A'){
            str="�ɼ���85�����ϣ�����85��";
        }
        else if (ch =='B'){
            str="�ɼ���85-70�����ڣ�����70��";
        }
        else if (ch =='C'){
            str="�ɼ���70-60�����ڣ�����60��";
        }
        else if (ch =='D'){
            str="�ɼ���60������";
        }
        System.out.println(str);

    }
}
