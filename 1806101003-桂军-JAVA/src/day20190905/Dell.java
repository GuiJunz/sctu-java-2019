package day20190905;

public class Dell {
    String name;
    int money;
    String ab;
    String big;
    void printInfo(){
        System.out.println("我买的电脑多少钱："+this.money);
    }
    public static void main(String[] args) {
        //实例化
        Dell dell= new Dell();

        dell.name="戴尔";
        dell.money=5800;
        dell.ab="轻薄本";
        dell.big="15.6寸";
        dell.printInfo();
    }

}
