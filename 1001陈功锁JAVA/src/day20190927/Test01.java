package day20190927;

/**
 * Created by Administrator on 2019-9-27.
 */
public class Test01 {

    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {

            System.out.println(i);

            if( i == 50){

                try{

                    throw new NullPointerException();
                }catch (NullPointerException e){

                    System.out.println("空指针错误。");
                }finally {

                }
            }
        }



    }
}
