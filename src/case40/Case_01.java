package case40;

/**
 * @author 7h0rns_J1ng
 * @create 2019-05-21 16:46
 *
 * 题目:古典问题:有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不
 * 死，问每个月的兔子总数为多少?
 * 1.程序分析: 兔子的规律为数列1,1,2,3,5,8,13,21....
 *
 */

public class Case_01 {
    public static void day(int days){
        for (int i = 1; i <=days ; i++) {
            System.out.print(fun(i)+" ");
        }
        System.out.println();
    }

    public static int fun(int x){
        if (x ==1 || x==2){
            return 1;
        }else {
            return fun(x-1)+fun(x-2);
        }
    }

}
