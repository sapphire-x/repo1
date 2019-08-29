package cn.itcast.test.inclass;
/*
比较字符串内容巩固练习
 */
public class StringTest03 {
    public static void main(String[] args) {
        String s = new String("abc");
        String s1 = "abc";
        String s2 = "Abc";

        //比较内容
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        //比较忽略大小写
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.equalsIgnoreCase(s2));

        //s s1 是引用类型，比较s和s1的地址
        System.out.println(s==s1);

    }
}
