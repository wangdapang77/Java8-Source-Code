package testjava.lang;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * String常用方法
 * @auther mynawang
 * @create 2016-12-14 16:36
 */
public class TestString {

    /**********************************构造器***********************************/
    public static void getConstructor() {
        String testStr0 = "mynawang";

        String testStr1 = new String("mynawang");

        char test2[] = {'m','y','n','a','w','a','n','g'};
        // char数组
        String testStr2 = new String(test2);

        char test3[] = {'a','m','y','n','a','w','a','n','g'};
        // char数组、起始索引、截取长度
        String testStr3 = new String(test3, 1, 8);

        int[] test4 = {65, 66, 109, 121, 110, 97, 119, 97, 110, 103};
        // 字母对应的ASCII编码数组、起始索引、截取长度
        String testStr4 = new String(test4, 2, 8);

        byte test5[] = {'a','m','y','n','a','w','a','n','g'};
        try {
            // byte数组、起始索引、截取长度、解析字符类型
            String testStr5 = new String(test5, 1, 8, "GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        byte test6[] = {'a','m','y','n','a','w','a','n','g'};
        // byte数组、起始索引、截取长度、字符集
        String testStr6 = new String(test6, 1, 8, Charset.defaultCharset());

        byte test7[] = {'m','y','n','a','w','a','n','g'};
        // byte数组、解析字符类型
        try {
            String testStr7 = new String(test7,"GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        byte test8[] = {'m','y','n','a','w','a','n','g'};
        // byte数组、字符集
        String testStr8 = new String(test8, Charset.defaultCharset());

        byte test9[] = {'a','m','y','n','a','w','a','n','g'};
        // byte数组、起始索引、截取长度
        String testStr9 = new String(test9, 1, 8);

        byte test10[] = {'m','y','n','a','w','a','n','g'};
        // byte数组
        String testStr10 = new String(test10);

        StringBuffer stringBuffer11 = new StringBuffer("mynawang");
        // StringBuffer
        String testStr11 = new String(stringBuffer11);

        StringBuilder stringBuilder12 = new StringBuilder("mynawang");
        // StringBuilder
        String testStr12 = new String(stringBuilder12);
        System.out.println(testStr12);
    }

    /**********************************常用方法***********************************/
    public  static void getMethod() {

        String testStr1 = "mynawang";
        // 获取字符串长度
        int testStr1Length = testStr1.length();
        System.out.println("length: " + testStr1Length);

        // 是否为空（字符串长度为0）
        boolean isEmpty = testStr1.isEmpty();
        System.out.println("isEmpty: " + isEmpty);

        // 第3位字符是什么
        char charAtVal = testStr1.charAt(2);
        System.out.println("charAt: " + charAtVal);

        // 第3位字符所对应的ASCII码是什么
        int codePointAtVal = testStr1.codePointAt(2);
        System.out.println("codePointAtVal: " + codePointAtVal);

        // 第3位字符前1位所对应的ASCII码是什么
        int codePointBeforeVal = testStr1.codePointBefore(2);
        System.out.println("codePointBeforeVal: " + codePointBeforeVal);

        // 从索引第1位索引到第6位索引所包含的字符个数
        int codePointCountVal = testStr1.codePointCount(0, 6);
        System.out.println("codePointCountVal: " + codePointCountVal);

        // 查找n首次出现在字符串的索引值
        int indexOfVal = testStr1.indexOf("n");
        System.out.println("indexOfVal: " + indexOfVal);

        // 查找n最后一次出现的索引值
        int lastIndexOfVal = testStr1.lastIndexOf("n");
        System.out.println("lastIndexOfVal: " + lastIndexOfVal);
        // ""的位置和length相同
        int nullLastIndexOfVal = testStr1.lastIndexOf("");
        System.out.println("lastIndexOfVal: " + nullLastIndexOfVal);

        // 字符串截取包括索引位到最后1位
        String subStringVal = testStr1.substring(2);
        System.out.println("subStringVal: " + subStringVal);

        // 字符串截取包括索引位到索引第5位
        String subStringVal2 = testStr1.substring(2, 5);
        System.out.println("subStringVal2: " + subStringVal2);

        // 去掉前后空格
        String testStr2 = " mynawang ";
        System.out.println("testStr2: " + testStr2);
        String trimVal = testStr2.trim();
        System.out.println("trimVal: " + trimVal);

        // 字符串替换
        String replaceVal = testStr1.replace("myna", "MYNA");
        System.out.println("replaceVal: " + replaceVal);

        // 判断字符串以什么开始，以什么结尾
        boolean startsWithVal = testStr1.startsWith("myna");
        boolean endWithVal = testStr1.endsWith("g");
        System.out.println("startsWithVal: " + startsWithVal);
        System.out.println("endWithVal: " + endWithVal);

        // 判断字符是否相等
        String testStr3 = "mynawang";
        boolean equalsVal = testStr1.equals(testStr3);
        System.out.println("equalsVal： " + equalsVal);

        // 判断字符是否相等(忽略字符串内大小写)
        String testStr4 = "MYNAWANG";
        boolean equalsIgnoreCaseVal = testStr1.equalsIgnoreCase(testStr4);
        System.out.println("equalsIgnoreCaseVal: " + equalsIgnoreCaseVal);

        // 小写转大写（数字非字符不受影响）
        String toUpperCaseVal = testStr1.toUpperCase();
        System.out.println("toUpperCaseVal: " + toUpperCaseVal);

        // 大写转小写（数字非字符不受影响）
        String toLowerCaseVal = testStr4.toLowerCase();
        System.out.println("toLowerCaseVal: " + toLowerCaseVal);

        String testConcat = testStr4.concat("--testConcat");
        System.out.println("testConcat: " + testConcat);


    }



    public static void main(String[] args) {
        getConstructor();

        getMethod();
    }

}
