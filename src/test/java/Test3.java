import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class Test3 extends Web_Driver {
    /* Проверка верстки при разных размерах окна*/
    @Test
    public void test3() {
        waitT w3 = new waitT();
//        Dimension wsize = driver.manage().window().getSize();
//        int he = wsize.getHeight();
//        int wi = wsize.getWidth();
//        he = 999;
//        wi = 999;
        driver.manage().window().setSize(new Dimension(2048, 999));

        w3.waitTime(5);

    }

}
