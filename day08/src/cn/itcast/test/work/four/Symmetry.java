package cn.itcast.test.work.four;

import java.util.Scanner;

/*
## 题目4（应用）

请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
例如："abcba"、"上海自来水来自海上"均为对称字符串。


 */
public class Symmetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("请输入：");
        String str = sc.nextLine();

        if(isSymmeetry(str)==true){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }



    }

    //12321
    //使用String
    public static boolean isSymmeetry1(String str){
        for(int i = 0;i<str.length();i++){
            char a = str.charAt(i);
            char b = str.charAt(str.length()-1-i);
            if(a!=b){
               return false;
            }
        }
        return true;
    }

    //使用StringBuilder 更好
    public static boolean isSymmeetry(String str){
        StringBuilder sb = new StringBuilder(str);

        if(str.equals(sb.reverse().toString())){
            return true;
        }else {
            return false;
        }

    }
}
