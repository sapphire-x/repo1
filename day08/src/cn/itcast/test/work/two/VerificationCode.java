package cn.itcast.test.work.two;

import java.util.Random;
import java.util.Scanner;

/*
## 题目2（应用）

在登录注册页面中，除了用户名和密码外，通常也会包含验证码。
验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
在判断验证码时一般不区分大小写。
请编写程序模拟验证码的判断过程，如果输入正确，给出提示，结束程序。
如果输入错误，给出提示，验证码刷新，重新输入，直至正确为止。

生成4位随机验证码的功能在之前的题目中已经完成，可以直接使用。
《定义方法，获取一个包含4个字符的验证码，每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。》

运行效果如下：

~~~java
生成的验证码为：BkhD
请输入验证码
abcd
输入错误，请重新输入...
生成的验证码为：n1wX
请输入验证码
aaaa
输入错误，请重新输入...
生成的验证码为：Fm1a
请输入验证码
fm1a
输入正确
~~~
 */
public class VerificationCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            //获取验证码
//            String getCode = getRandomCode();
            String getCode = createVerification();
            System.out.println(getCode);

            System.out.println("请输入验证码：");
            String code = sc.nextLine();
            if (code.equals(getCode)) {
                System.out.println("输入正确");
                break;
            } else {
                System.out.println("输入错误，请重新输入。");
            }
        }


    }



    /**
     * 生成4位随机验证码的功能在之前的题目中已经完成，可以直接使用。
     * 《定义方法，获取一个包含4个字符的验证码，每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。》
     */
    public static String createVerification(){

        //数据准备
        StringBuilder sb = new StringBuilder();
        for(char i = 'a';i<='z';i++){
            sb.append(i);
        }
        for(char i = 'A';i<='Z';i++){
            sb.append(i);
        }
        for(char i = '0';i<='9';i++){
            sb.append(i);
        }

        //生成随机数
        Random rand = new Random();
        //StringBuilder sb1 = new StringBuilder();
        String code1  = "";
        for(int i = 0;i<4;i++){
            int index = rand.nextInt(sb.length());

            code1 +=  sb.charAt(index);
          //  sb1.append(ch);
        }

     //   return sb1.toString();
            return code1;


    }

    public static String getRandomCode() {
        // 准备数据
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            sb.append(ch);
        }
        for (char ch = '0'; ch <= '9'; ch++) {
            sb.append(ch);
        }

        // 随机获取四位
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            // 字符串中的字符有索引，随机获取一个索引即相当于随机获取到了该索引的字符
            int index = r.nextInt(sb.length()); // 从索引0（包含）到字符串的长度（不包含）
            code += sb.charAt(index); // 获取该索引上的字符
        }
        // 返回结果
        return code;
    }

}
