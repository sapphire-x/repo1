package cn.itcast.test.inclass;

import java.util.Scanner;

/**
 * 字符串反转
 * 键盘接收一个字符串
 * 定义方法，方法中将字符串进行反转并返回
 */
public class StringTest08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要反转的字符串：");
        String r = sc.nextLine();
         System.out.println("反转之后为："+reverse(r));
    }

    /**
     * 反转函数
     * @param s
     * @return
     */
    public static String reverse(String s){
        String result = "";
        for(int i = s.length()-1;i>=0;i--){
            result += s.charAt(i);
        }
        return result;
    }
}
