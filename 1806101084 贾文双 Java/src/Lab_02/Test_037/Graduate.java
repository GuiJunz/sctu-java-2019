package Lab_02.Test_037;

public class Graduate extends Student{
    public Graduate(String name,int age,int[] score) {
        super(name,age,score);
    }
    public void pass(){
        int sum= 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        if(sum/3>80){
            System.out.println("通过");
        }else {
            System.out.println("不通过");
        }
    }
}
