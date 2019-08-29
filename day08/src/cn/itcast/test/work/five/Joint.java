package cn.itcast.test.work.five;
/*
## 题目5（练习）

定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。

要求：

​	1、如果传递的参数为空，返回null

​	2、如果传递的数组元素个数为0，返回[]

​	3、如果数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
 */
public class Joint {
    public static void main(String[] args) {

        int[] a = null;

        System.out.println( arrayToString(a));
    }

    public static String arrayToString(int[] arr){

        StringBuilder sb = new StringBuilder();

        if(arr== null){
            return null;
        }else if(arr.length == 0){
            return sb.append("[]").toString();
        }else {
            //拼接字符串
            sb.append("[");
            for (int i = 0; i < arr.length; i++) {
                if(i == arr.length-1){
                    sb.append(arr[i]).append("]");
                }else {
                    sb.append(arr[i]).append(", ");
                }
            }
            return sb.toString();
        }
    }
}
