package lab_02.text_01;

public class Text_01 {
    public   static class Address{
        //�����Ա����
        String country;
        String province;
        String city;
        String street;
        String zipcode;

        //�����Ա����
        void printInfo(){
            System.out.println("�����ǣ�"+this.country);
        }
    }

    public static void main(String[] args) {
        //ʵ����
        //������һ������������price��������Address
        Address sctu = new Address();
        sctu.country="china";
        sctu.province="�Ĵ�";
        sctu.city="�ɶ�";
        sctu.street="����·";

        sctu.printInfo();

    }

}
