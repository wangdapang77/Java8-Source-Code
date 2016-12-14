package testjava.lang;

/**
 * Enum常用方法
 * @auther mynawang
 * @create 2016-12-14 16:07
 */
public class TestEnum {

    enum programmer {
        ARCHITECT, PROJECTMANAGER, TESTENGINEER
    }

    public  static void getMethod() {
        // 获取名称
        System.out.println(programmer.ARCHITECT.name());

        // 获取在枚举中的序列顺序
        System.out.println(programmer.ARCHITECT.ordinal());
        System.out.println(programmer.PROJECTMANAGER.ordinal());

        // 获取名称
        System.out.println(programmer.ARCHITECT.toString());

        // 前者序列减去后者序列
        System.out.println(programmer.ARCHITECT.compareTo(programmer.PROJECTMANAGER));

        // 获取hash值
        System.out.println(programmer.ARCHITECT.hashCode());

        // 获取与此枚举常量的枚举类型相对应的 Class 对象
        System.out.println(programmer.ARCHITECT.getDeclaringClass());

    }

    public static void main(String[] args) {
        getMethod();
    }

}
