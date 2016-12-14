package testjava.lang;

/**
 * Integer常用方法
 * @auther mynawang
 * @create 2016-12-14 16:31
 */
public class TestInteger {


    /**********************************构造器***********************************/
    public static void getConstructor() {
        // 构造一个新分配的 Integer 对象，它表示指定的 int 值。
        Integer testInteger = new Integer(123);
        // 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值
        Integer testInteger2 = new Integer("123");
    }

    public static void getMethod() {

        String originNum = "01110";
        // 定义传如参数为2进制
        int binary2Num = Integer.parseInt(originNum, 2);
        System.out.println("binary2Num: " + binary2Num);                    // 14

        // 定义传如参数为10进制(默认)
        int binary10Num = Integer.parseInt(originNum);
        System.out.println("binary10Num: " + binary10Num);                  // 1110

        // 与parseInt作用类似，源码调用parseInt
        Integer testInteger = Integer.valueOf(originNum, 2);
        System.out.println("testInteger: " + testInteger);                  // 14

        // 与parseInt作用类似，源码调用parseInt
        Integer testInteger2 = Integer.valueOf(originNum);
        System.out.println("testInteger2: " + testInteger2);                // 1110

        // int转二进制数
        int testInt = 14;
        String toBinaryStr = Integer.toBinaryString(testInt);
        System.out.println("toBinaryStr: " + toBinaryStr);                  // 1110

        // int转八进制
        String toOctalStr = Integer.toOctalString(testInt);
        System.out.println("toOctalStr: " + toOctalStr);                    // 16

        // int转十六进制
        String toHexStr = Integer.toHexString(testInt);
        System.out.println("toHexStr: " + toHexStr);                        // e

        System.out.println("");

        Integer testInteger3 = new Integer(127);
        Integer testInteger4 = new Integer(127);
        // 实例化一个Integer后在堆里会生成各自的内存空间指向堆里的数值127（内存地址不同）
        System.out.println("testInteger3 == testInteger4 ? : "
                + (testInteger3==testInteger4));                            // false
        // equals比较的是两个对象的value，intValue
        System.out.println("testInteger3 equals testInteger4 ? : "
                + (testInteger3.equals(testInteger4)));                     // true
        // intValue比较的是基本数据类型的值，Integer的基本数据类型为int
        System.out.println("testInteger3 intValue = testInteger4 intValue ? : "
                + ((testInteger3.intValue()==testInteger4.intValue())));    // true
        System.out.println("");

        Integer testInteger5 = 127;
        Integer testInteger6 = 127;
        // 自动装箱testInteger5和testInteger6，编译时封装成Integer testInteger5=Integer.valueOf(127)，放入缓冲区【-128，127】
        System.out.println("testInteger5 == testInteger6 ? : "
                + (testInteger5==testInteger6));                            // true
        // equals比较的是两个对象的value，intValue
        System.out.println("testInteger5 equals testInteger6 ? : "
                + (testInteger5.equals(testInteger6)));                     // true
        // intValue比较的是基本数据类型的值，Integer的基本数据类型为int
        System.out.println("testInteger5 intValue = testInteger6 intValue ? : "
                + ((testInteger5.intValue()==testInteger6.intValue())));    // true
        System.out.println("");

        Integer testInteger7 = 128;
        Integer testInteger8 = 128;
        // 自动装箱testInteger5和testInteger6，编译时封装成Integer testInteger7=Integer.valueOf(128)，放在堆中
        System.out.println("testInteger7 == testInteger8 ? : "
                + (testInteger7==testInteger8));                            // false
        // equals比较的是两个对象的value，intValue
        System.out.println("testInteger7 equals testInteger8 ? : "          // true
                + (testInteger7.equals(testInteger8)));
        // intValue比较的是基本数据类型的值，Integer的基本数据类型为int
        System.out.println("testInteger7 intValue = testInteger8 intValue ? : "
                + ((testInteger7.intValue()==testInteger8.intValue())));    // true
        System.out.println("");

        Integer testInteger9 = 127;
        Integer testInteger10 = new Integer(127);
        System.out.println("testInteger9 == testInteger10 ? : "
                + (testInteger9==testInteger10));                            // false
        // equals比较的是两个对象的value，intValue
        System.out.println("testInteger9 equals testInteger10 ? : "          // true
                + (testInteger7.equals(testInteger8)));
        // intValue比较的是基本数据类型的值，Integer的基本数据类型为int
        System.out.println("testInteger9 intValue = testInteger10 intValue ? : "
                + ((testInteger7.intValue()==testInteger8.intValue())));     // true
        System.out.println("");

        Integer testInteger11 = new Integer(128);
        Integer testInteger12 = new Integer(128);
        Integer testInteger13 = new Integer(0);
        // Java的数学计算是在内存栈里操作的，Java会对testInteger12、testInteger13进行拆箱操作，其实比较的是基本类型
        System.out.println("testInteger11 == testInteger12+testInteger13 ? : "
                + (testInteger11==testInteger12+testInteger13));             // true
    }

    public static void main(String[] args) {
        getMethod();
    }
}
