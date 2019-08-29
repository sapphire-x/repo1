package cn.itcast.test.inclass;

import java.util.Scanner;
/* 要求：
   统计字符串各种字符次数重点步骤
      1.键盘录入一个字符串
      2.定义三个统计变量
      3.遍历字符串，拿到每一个字符
      4.判断字符是大写的、小写的、还是数字字符的，
         分别让对应的统计变量自增。
      5.输出统计变量
 */
public class StringTest06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String line = sc.nextLine();

        int numCount = 0;
        int bigCount = 0;
        int smallCount = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if(ch >= '0' && ch <='9'){
                numCount++;
            }else if(ch >='a' && ch<='z'){
               smallCount++;
            }else if(ch>='A' && ch <='Z'){
               bigCount++;
            }
        }

        System.out.println("数字个数为："+numCount);
        System.out.println("大写字母个数为："+bigCount);
        System.out.println("小写字母个数为："+smallCount);


    }


}
