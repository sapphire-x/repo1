package cn.itcast.test.inclass;

public class StringTest02 {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("str1: "+str1);

        char[] c = {'a','b','c'};
        String str2 = new String(c);
        System.out.println("str2: "+str2);

        byte[] b = {97,98,99};
        String str3 = new String(b);
        System.out.println("Str3："+str3);

        String str4 = "abc";
        System.out.println("str4："+str4);
    }
}
