package lab_02.text_02;

public class Circle {
    //1.����
    private double radius;


    //2.��Ա����
    //����Բ��������ܳ�
    private double calArea(){
        return 3.14*this.radius*this.radius;
    }

    private double calLength(){
        return 2*3.14*this.radius;
    }

    private void print(){
        //��ȡǰ�涨��ĳ�Ա����
        System.out.println("Բ��������ܳ��ǣ�"+this.calArea()+"��"+this.calLength());
    }

    public static void main(String[] args) {

        Circle c1=new Circle();
        c1.radius=1;

        double area = c1.calArea();
        double length = c1.calLength();
        c1.print();
    }


}
