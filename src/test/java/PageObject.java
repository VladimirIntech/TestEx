import com.sun.glass.events.MouseEvent;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.awt.*;

/*ОПИСАНИЕ ОБЕКТОВ СТРАНИЦФ С ДЕЙСТВИЯМИ    */
public class PageObject extends Web_Driver {

    public PageObject() {
        if (getDriver().getCurrentUrl().contains("blog.csssr.ru"))
            PageFactory.initElements(getDriver(), this);
        else Assert.fail("Не та страница");
    }

    //ВКЛАДКИ
    @FindBy(xpath = ".//a[text()='ВНИКАТЬ В ДЕТАЛИ ПРОЕКТОВ']")
    private WebElement pg1;
    @FindBy(xpath = ".//a[text()='НАХОДИТЬ НЕСОВЕРШЕНСТВА']")
    private WebElement pg2;
    @FindBy(xpath = ".//a[text()='СОПРОВОЖДАТЬ ПРОЕКТЫ']")
    private WebElement pg3;
    @FindBy(xpath = ".//a[text()='РАБОТАТЬ С ФАЙЛАМИ ПРОЕКТОВ']")
    private WebElement pg4;

    //ЧЕКБОКСЫ
    @FindBy(xpath = "//label[@for='attention']")
    private WebElement ch1;
    @FindBy(xpath = "//label[@for='logic']")
    private WebElement ch2;
    @FindBy(xpath = "//label[@for='eye']")
    private WebElement ch3;
    @FindBy(xpath = "//label[@for='beautiful']")
    private WebElement ch4;
    @FindBy(xpath = "//label[@for='tasks']")
    private WebElement ch5;
    @FindBy(xpath = "//label[@for='soft']")
    private WebElement ch6;
    @FindBy(xpath = "//a[text()= 'Софт для быстрого создания скриншотов']]")
    private WebElement ch6_1;
    @FindBy(xpath = "//label[@for='attention2']")
    private WebElement ch7;
    @FindBy(xpath = "//label[@for='responsibility']")
    private WebElement ch8;
    @FindBy(xpath = "//label[@for='parallel']")
    private WebElement ch9;
    @FindBy(xpath = "//label[@for='logic2']")
    private WebElement ch10;
    @FindBy(xpath = "//label[@for='chaos']")
    private WebElement ch11;
    @FindBy(xpath = "//label[@for='beautiful2']")
    private WebElement ch12;

    @FindBy(xpath = "//a[text()='hr@csssr.com']")
    private WebElement ahr1;
    @FindBy(xpath = "//a[text()='vk.com/csssr']")
    private WebElement ahr2;

    public void pg1() {
        pg1.click();
    }

    public void pg2() {
        pg2.click();
    }

    public void pg3() {
        pg3.click();
    }

    public void pg4() {
        pg4.click();


    }

    public void ch1() {
        ch1.click();

    }

    public void ch2() {
        ch2.click();

    }

    public void ch3() {
        ch3.click();

    }

    public void ch4() {
        ch4.click();

    }

    public void ch5() {
        ch5.click();

    }

    public void ch6() {
        ch6.click();

    }

    public void ch6_1() {
        ch6_1.click();

    }

    public void ch7() {
        ch7.click();

    }

    public void ch8() {
        ch8.click();

    }

    public void ch9() {
        ch9.click();

    }

    public void ch10() {
        ch10.click();

    }

    public void ch11() {
        ch11.click();

    }

    public void ch12() {
        ch12.click();

    }


    public void pg1f() {
        //Наведение курсора на объект страницы
        Actions action = new Actions(driver);
action.moveToElement(pg1);

    }
    public void pg2f() {
        //Наведение курсора на объект страницы
        Actions action = new Actions(driver);
        action.moveToElement(pg2);

    }
    public void pg3f() {
        //Наведение курсора на объект страницы
        Actions action = new Actions(driver);
        action.moveToElement(pg3);

    }
    public void pg4f() {
        //Наведение курсора на объект страницы
        Actions action = new Actions(driver);
        action.moveToElement(pg4);

    }
    public void pg5f() {
        //Наведение курсора на объект страницы
        Actions action = new Actions(driver);
        action.moveToElement(ch6_1);

    }
    public void pg6f() {
        //Наведение курсора на объект страницы
        Actions action = new Actions(driver);
        action.moveToElement(ahr1);

    }
    public void pg7f() {
        //Наведение курсора на объект страницы
        Actions action = new Actions(driver);
        action.moveToElement(ahr2);

    }



}
