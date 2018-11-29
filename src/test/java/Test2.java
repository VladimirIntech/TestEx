import org.junit.Test;

/*ПРОВЕРКА НАЖАТИЯ ЧЕКБОКСОВ */

public class Test2 extends Web_Driver {
    @Test
    public void test2() {
        PageObject q = new PageObject();
        waitT w2 = new waitT();

        //НАЖАТ ЧЕКБОКС ВНИМАТЕЛЬНОСТЬ

        q.ch1();
        w2.waitTime(1);
        q.ch1();
        w2.waitTime(1);
        //НАЖАТ ЧЕКБОКС Умение рассуждать логически
        q.ch2();
        w2.waitTime(1);
        q.ch2();
        w2.waitTime(1);


        //ПЕРЕХОД НА ВКЛАДКУ НАХОДИТЬ НЕ СОВЕРШЕНСТВА
        q.pg2();
        w2.waitTime(1);
        //НАЖАТ ЧЕКБОКС Идеальный глазомер
        q.ch3();
        w2.waitTime(1);
        q.ch3();
        w2.waitTime(1);
        //НАЖАТ ЧЕКБОКС Чувство прекрасного
        q.ch4();
        w2.waitTime(1);
        q.ch4();
        w2.waitTime(1);
        //НАЖАТ ЧЕКБОКС Умение четко формулировать задачи
        q.ch5();
        w2.waitTime(1);
        q.ch5();
        w2.waitTime(1);
        //НАЖАТ ЧЕКБОКС Умение четко формулировать задачи
        q.ch6();
        w2.waitTime(1);
        q.ch6();
        w2.waitTime(1);


        //ПЕРЕХОД НА ВКЛАДКУ Сопровождать проекты
        q.pg3();
        w2.waitTime(1);
        //НАЖАТ ЧЕКБОКС Внимательность
        q.ch7();
        w2.waitTime(1);
        q.ch7();
        w2.waitTime(1);
        //НАЖАТ ЧЕКБОКС Ответственность
        q.ch8();
        w2.waitTime(1);
        q.ch8();
        w2.waitTime(1);
        //НАЖАТ ЧЕКБОКС Умение вести несколько дел параллельно
        q.ch9();
        w2.waitTime(1);
        q.ch9();
        w2.waitTime(1);
        //НАЖАТ ЧЕКБОКС Умение рассуждать логически
        q.ch10();
        w2.waitTime(1);
        q.ch10();
        w2.waitTime(1);


        //ПЕРЕХОД НА ВКЛАДКУ Сопровождать проекты
        q.pg4();
        w2.waitTime(1);
        //НАЖАТ ЧЕКБОКС Умение упорядочивать хаос
        q.ch11();
        w2.waitTime(1);
        q.ch11();
        w2.waitTime(1);
        //НАЖАТ ЧЕКБОКС Чувство прекрасного
        q.ch12();
        w2.waitTime(1);
        q.ch12();
        w2.waitTime(1);


        //Просматриваем все вкладки на наличие не нажатых чекбоксов


    }
}
