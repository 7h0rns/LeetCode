package case40;



/**
 * @author Jing_Xiaowei
 * @create 2019-05-21 20:43
 *
 * 【程序5】
 * 1.程序分析:(a> b)?a:b这是条件运算符的基本例子。
 * 题目:利用条件运算符的嵌套来完成此题:学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 */
public class Case_05 {
    public static void fun(double num){
        String str;
        str = num>=90?"A":num>=60?"B":"C";
        System.out.println(str);
    }
}
