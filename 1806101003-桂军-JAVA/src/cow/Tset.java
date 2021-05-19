package cow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author guijun
 * @version 1.0
 * @date 2020/7/12 15:04
 */
public class Tset {
    public static void main(String[] args) {
        test01();
    }

    static void test01() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 3, 1));
        System.out.println("输出原始数据：");
        nums.forEach(System.out::println);
        nums.add(6);
        nums.add(0, 4);
        nums.remove(1);
        System.out.println("输出修改后的数据：");
        nums.forEach(System.out::println);
    }
}
