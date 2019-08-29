package cn.itcast.test.inclass;

public class StringTest09 {
    public static void main(String[] args) {

        //String转换为StringBuilder
        String str = "";
        StringBuilder sb = new StringBuilder(str);

        //StringBuilder的链式拼接 和 反转
        sb.append("赖冠霖").append("李次长");
        sb.reverse();

        //StringBuilder转换为String
        String str2 = sb.toString();

        System.out.println(str2);


    }
}
