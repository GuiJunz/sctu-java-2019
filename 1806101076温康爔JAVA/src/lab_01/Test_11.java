package lab_01;

import javax.swing.*;

public class Test_11 {
    public static void main(String[] args) {
        loopNumber();
    }
    static  void loopNumber(){
        int number=0,d5,d4,d3,d2,d1;
        String str= JOptionPane.showInputDialog("输入一个1至99999之间的数");
        number=Integer.parseInt(str);
        if(number>=1 || number<=99999) //判断number在1至99999之间的条件
        {
            d5=number/10000;   //计算number的最高位（万位）d5
            d4=number%10000/1000;   //计算number的千位d4
            d3=number%10000%1000/100; //计算number的百位d3
            d2=number%100/10;//计算number的十位d3
            d1=number%10;//计算number的个位d3
            if(d5>=1&&d5<=9)  //判断number是5位数的条件
            {
                System.out.println(number+"是5位数");
                if(d1==d5 &&d2==d4) //判断number是回文数的条件
                {
                    System.out.println(number+"是回文数");
                }
                else
                {
                    System.out.println(number+"不是回文数");
                }
            }
            else if(d5==0&&(d4>=1&&d5<=9))  //判断number是4位数的条件
            {
                System.out.println(number+"是4位数");
                if(d1==d4&&d2==d3) //判断number是回文数的条件码
                {
                    System.out.println(number+"是回文数");
                }
                else
                {
                    System.out.println(number+"不是回文数");
                }
            }
            else if(d5==0&&d4==0&&d3!=0)  //判断number是3位数的条件
            {
                System.out.println(number+"是3位数");
                if(d1==d3) //判断number是回文数的条件
                {
                    System.out.println(number+"是回文数");
                }
                else
                {
                    System.out.println(number+"不是回文数");
                }
            }
            else if(d2!=0)
            {
                System.out.println(number+"是2位数");
                if(d1==d2)
                {
                    System.out.println(number+"是回文数");
                }
                else
                {
                    System.out.println(number+"不是回文数");
                }
            }
            else if(d1!=0)
            {
                System.out.println(number+"是1位数");
                System.out.println(number+"是回文数");
            }
        }
        else
        {
            System.out.printf("\n%d不在1至99999之间",number);
        }
    }
}
