package cn.itcast.test.inclass;

import java.util.Scanner;
/*要求：
    用户登录重点步骤
      1.定义一组用户名和密码
      2.定义一个次数为3的循环
      3.在循环内接收键盘录入的用户名和密码，用于和已经定义好的进行比较
            如果用户名和密码相同，提示登录成功、并结束循环
            如果用户名和密码不相同，则提示剩余的机会

 */
public class StringTest04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userName = "赖冠霖";
        String passWord = "123";
        int count = 2;

        while(true){
            System.out.println("请输入用户名");
            String user = sc.nextLine();
            System.out.println("请输入密码");
            String psw = sc.nextLine();
            if(user.equals(userName) && passWord.equals(psw)){
                System.out.println("登录成功");
                break;
            }else{
                if(count == 0){
                    System.out.println("您的账户已经被锁定，请于管理员联系。");
                    break;
                }else{
                    System.out.println("请输入错误，现在剩余"+count+"次机会");
                    count--;
                }
            }

        }
    }
}
