package Lab02.Test13;

public class Test {
    public static void main(String[] args) {
        int n=6;
        double []data=new double[n];
        for(int i=0;i<n;i++){
            data[i]=i;
        }
        ComputerAverage g=new Gymnastics(data); //上转型对象
        System.out.println(g.average(data));

        for(int i=0;i<n;i++){
            data[i]=i;
        }
        ComputerAverage s=new School(data);  //上转型对象
        System.out.println(s.average(data));
    }
}
