package lab_02.text_03;

public class Grade {
    //����
    private int computer;
    private int math;
    private int English;


    //��Ա����
    private int ALL(){
        //�����ܳɼ�
        return this.computer+this.math+this.English;
    }

    private int average(){
        //����ƽ���ɼ�
        return (this.computer+this.math+this.English)/3;
    }

    private int heap(){
        //������߷�
        int n=this.computer;
        if (n<this.math){
            n=this.math;
        }
        else if (n>this.math){
            if (n<this.English){
                n=this.English;
            }
            else{
                n=this.computer;
            }
        }
        return n;
    }

    private int low(){
        //������ͷ�
        int m=this.computer;
        if (m>this.math){
            m=this.math;
        }
        else if (m<this.math){
            if (m>this.English){
                m=this.English;
            }
            else{
                m=this.computer;
            }
        }
        return m;
    }
    private void printInfo(){
        //��ӡ��Ϣ��
        System.out.println("�ܷ��ǣ�"+this.ALL());
        System.out.println("ƽ�����ǣ�"+this.average());
        System.out.println("��߷��ǣ�"+this.heap());
        System.out.println("��ͷ��ǣ�"+this.low());
    }

    public static void main(String[] args) {
        Grade student1=new Grade();
        student1.computer=85;
        student1.math=90;
        student1.English=89;

        student1.printInfo();
        int all= student1.ALL();
        int aver=student1.average();
        int heap=student1.heap();
        int low =student1.low();

    }

}
