package Lab_02.Test_035;
//35、 	假定要为某个公司编写雇员工资支付程序，这个公司有各种类型的雇员（Employee），不同类型的雇员按不同的方式支付工资：
//        （1）经理（Manager）——每月获得一份固定的工资
//        （2）销售人员（Salesman）——在基本工资的基础上每月还有销售提成。
//        （3）一般工人（Worker）——则按他每月工作的天数计算工资。
//        根据上述要求试用类的继承和相关机制描述这些功能，并编写一个Java Application程序，演示这些类的用法。
//        （提示：应设计一个雇员类（Employee）描述所有雇员的共图特性，这个类应该提供一个计算工资的抽象方法( )，
//        使得可以通过这个类计算所有雇员的工资。经理、销售人员和一般工人对应的类都应该继承这个类，并重新定义计算工资的方computeSalary法，进而给出它的具体实现。）
public abstract class Employee {
    public abstract int computeSalary();
}
