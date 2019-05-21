package case40;

/**
 * @author Jing_Xiaowei
 * @create 2019-05-21 17:04
 *
 * 【程序2】 题目:判断101-200之间有多少个素数，并输出所有素数。
 * 1.程序分析:判断素数的方法:用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。
 */
public class Case_02 {

    public static void fun(int first, int end){
        for (int i = first; i <=end ; i++) {
          if (iszhishu(i) == true){
              System.out.print(i+ " ");
          }
        }
    }
    private static boolean iszhishu(int i){
        int max =(int)Math.sqrt(i);
        for (int j = 2; j <max ; j++) {
            if (i%j == 0){
                return false;
            }
        }
        return true;
    }



}
