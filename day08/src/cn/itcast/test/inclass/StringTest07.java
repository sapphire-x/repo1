package cn.itcast.test.inclass;

/**
 * 字符串拼接重点步骤
 *       1.定义一个数组
 *       2.定义一个方法，方法中将数组元素拼接成字符串并返回
 *       3.输出拼接好的字符串
 */
public class StringTest07 {

    public static void main(String[] args) {
       /* int[] arr = {1,2,3,4,6};


        System.out.println("数组是："+arrayToStringByString(arr));

        System.out.println(arrayToStringByStringBuilder(arr));*/

        int[] arr = new int[]{1,2,3,4,5,6};


    }

    /**
     * 通过String拼接字符串
     * @param arr
     * @return
     */
    public static String arrayToStringByString(int[] arr){
        String str = "";
        str += "[";
        //遍历
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                str = str + arr[i]+"]";
            }else{
                str = str + arr[i] +", ";
            }
        }
        return str;
    }

    public static String arrayToStringByStringBuilder(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(int i = 0;i<arr.length;i++ ){
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
