package cn.itcast.test.work.one;

import java.util.Scanner;

/*
## 题目1（训练）

现已知工人（Worker）类，属性包含姓名（name）、工龄（year），请编写该类，提供构造方法和get、set方法。
在测试类中，请查看键盘录入Scanner类的API，创建工人类对象，属性值由键盘录入，打印对象的属性值。输出效果如下：

~~~java
请录入工人姓名：
张三
请录入工人工龄：
5
该工人对象的属性信息如下：
姓名：张三
工龄：5
~~~
 */
public class WorkTest {
    public static void main(String[] args) {
        /*Worker w = new Worker();

        Scanner sc = new Scanner(System.in);
        System.out.println("请录入工人姓名：");
        w.setName(sc.nextLine());

        System.out.println("请录入工人工龄：");
        w.setYear(sc.nextInt());*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入工人姓名：");
        String name = sc.nextLine();

        System.out.println("请录入工人工龄：");
        int year = sc.nextInt();

        Worker w = new Worker(name,year);


        System.out.println("工人信息：");
        System.out.println("姓名是："+w.getName());
        System.out.println("工龄是："+w.getYear());

    }
}
