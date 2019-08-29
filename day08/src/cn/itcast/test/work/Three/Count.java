package cn.itcast.test.work.Three;

import java.util.Scanner;

/*
## 题目3（训练）

请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。
比如：Hello12345World中字母：10个，数字：5个。
 */
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一串字符：");
        String str = sc.nextLine();

        int numCount = 0;
        int englishCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) <= '9' && str.charAt(i)>= '0'){
                numCount++;
            }else if((str.charAt(i)>='a'&& str.charAt(i)<='z')||(str.charAt(i)>='A'&& str.charAt(i)<='Z')){
                englishCount++;
            }
        }
        System.out.println(str+"中字母："+englishCount+", 数字："+numCount);

        System.out.println( str.toUpperCase());
        System.out.println( str.toLowerCase());
        //或者开始先把里面的大写换成小写字母
        //  str.toUpperCase(); //小写换成大写
        //  str.toLowerCase();//小写换成大写


    }
}
