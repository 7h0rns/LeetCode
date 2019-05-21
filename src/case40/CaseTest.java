package case40;

import org.junit.jupiter.api.Test;


/**
 * @author Jing_Xiaowei
 * @create 2019-05-21 18:21
 */
public class CaseTest {

    private static void enter(){
        System.out.println();
    }

    @Test
    public void test1(){
        Case_01.day(20);
        CaseTest.enter();
    }


    @Test
    public void test2(){
        Case_02.fun(101,200);
    }
    @Test
    public void test3(){
        Case_03.fun(100,999);
    }
    @Test
    public void test4(){
        Case_04.fun(90);
    }
    @Test
    public void test05(){
        Case_05.fun(59);
    }



}
