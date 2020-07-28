package main.java.java面试全解析;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class P5 {

    @Test
    public void escapeLoop() {
        boolean flag = true;
        for (int i = 0; i < 100 && flag; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println("J:" + j);
                if (j == 10) {
                    // 跳出多重循环
                    flag = false;
                    break;
                }
            }
        }
//        assertEquals(2, numberOfSubarrays.numberOfSubarrays(nums, 3));
    }

    @Test
    public void maxValue() {
        final int iMax = Integer.MAX_VALUE;
        System.out.println("整数包装类的最大值：" + iMax); // 输出 2147483647
        System.out.println("整数包装类的最大值+1：" + (iMax + 1)); // 输出 -2147483648，整数在内存中使用的是补码的形式表示，最高位是符号位 0 表示正数，1 表示负数，当执行 +1 时，最高位就变成了 1，结果就成了 -2147483648
    }

    @Test
    public void setTest() {
        Set<Short> set = new HashSet<>();
        for (short i = 0; i < 5; i++) {
            set.add(i);
            System.out.println(set.size());
            short s = 1;
            set.remove((short)(i - s)); // short + short 的运算，也会自动转为int，必须要cast
        }
        System.out.println(set.size());

    }

    @Test
    public void numType() {
        float f = 3.4f;
        double d = 3.4;

        Integer i = 33;
        System.out.println(i.getClass()); // 输出：class java.lang.Integer
        System.out.println(i.hashCode()); // a hash code value for this object, equal to the primitive int value represented by this Integer object.

        System.out.println(3 * 0.1); // 0.30000000000000004

    }

    @Test
    public void string() {
        String s1 = "hi," + "lao" + "wang";
        String s2 = "hi,";
        s2 += "lao";
        s2 += "wang";
        String s3 = "hi,laowang";
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        // 题目解析：String s1 = "hi," + "lao" + "wang" 代码会被 JVM 优化为：String s1 = "hi,laowang"，这样就和 s3 完全相同，s1 创建的时候会把字符"hi,laowang"放入常量池，s3 创建的时候，常量池中已经存在对应的缓存，会直接把引用返回给 s3，所以 s1==s3 就为 true，而 s2 使用了 += 其引用地址就和其他两个不同。
    }

}