package case40;

/**
 * @author 7h0rns_J1ng
 * @create 2019-05-21 19:17
 *
 * 题目:打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 例如:153是一个 "水仙花 数 "，因为153=1的三次方+5的三次方+3的三次方。
 * 1.程序分析:利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class Case_03 {
    public static void fun(int first,int end){
        for (int i = first; i <=end ; i++) {
            if (isShuiXianHua(i)== true){
                System.out.println(i+" ");
            }
        }
    }




    //判断是否为水仙花数
    private static   boolean  isShuiXianHua(int i){
        int x,y,z;
        x = i% 10;
        y = (i/10)%10;
        z = i/100;
        int sum = x*x*x + y*y*y + z*z*z;
        if (i == sum){
            return true;
        }else {
            return false;
        }
    }
}
