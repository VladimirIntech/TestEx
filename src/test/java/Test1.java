import org.junit.Test;

public class Test1 extends Web_Driver {
waitT w1 = new waitT();
PageObject po= new PageObject();



    /* Тест на заполнение  красным паттерном*/

    @Test
    public void test() {

//Переход с задержкой в 5 (5*1000млсек)сек между вкладками

        w1.waitTime(2);
        po.pg2();
        w1.waitTime(2);
        po.pg3();
        w1.waitTime(2);
        po.pg4();
        w1.waitTime(2);
        po.pg1();
        w1.waitTime(5);


    }
}
