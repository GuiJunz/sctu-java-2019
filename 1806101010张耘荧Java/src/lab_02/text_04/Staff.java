package lab_02.text_04;

public class Staff {
    private String name;
    private String number;
    private int money;
    private int growth;


    private Staff(String name,String number,int money,int growth){
        this.name=name;
        this.number=number;
        this.money=money;
        this.growth=growth;
    }

    private void print(){
        System.out.println("������"+name);
        System.out.println("��ţ�"+number);
        System.out.println("��������;"+money);
        System.out.println("���������"+growth);
        System.out.println("�ܹ��ʣ�"+(money+growth));
    }

    public static void main(String[] args) {
        Staff staff=new Staff("����","0001",2000,100);

        staff.print();
    }
}
