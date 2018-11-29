import org.junit.Test;

public class Test4 extends Web_Driver {
    /*Проверка изменения цвета ссылок с синего на красный*/
    @Test
    public void test4() {
        waitT w4 = new waitT();
        PageObject po4 = new PageObject();
        po4.pg1f();
        w4.waitTime(2);
        po4.pg2f();
        w4.waitTime(2);
        po4.pg3f();
        w4.waitTime(2);
        po4.pg4f();

        po4.pg2();
        w4.waitTime(1);
        po4.pg5f();
        w4.waitTime(2);
        po4.pg6f();
        w4.waitTime(2);
        po4.pg7f();
        w4.waitTime(5);
    }
}
