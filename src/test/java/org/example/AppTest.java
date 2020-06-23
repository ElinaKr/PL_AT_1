package org.example;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertTrue;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */


    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elina\\chromedriver\\chromedriver1.exe");
        Configuration.startMaximized = true;

    }
    @After
    public void After(){
        System.out.println("Тест завершен");
        WebDriverRunner.closeWebDriver();
    }

    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {
        assertTrue( true );
        open("https://test.uxcrowd.ru/");
        Thread.sleep(2000);
        $(By.cssSelector("[id=header-lk-button]")).should(Condition.visible).click();
        Thread.sleep(1000);
        //$(By.xpath("//label[contains(text(), 'Зарегистрироваться')]")).should(Condition.visible).click();
        //Thread.sleep(1000);
        //$(By.xpath("//button[@ng-tr='WHE1.WHE13']")).should(Condition.visible).click();
        //button[contains(text(), 'Стать тестировщиком')]
        //Thread.sleep(1000);
        //$(By.xpath("//input[@type='email']")).should(Condition.visible).click();
        //$(By.xpath("//input[@type='email']")).should(Condition.visible).setValue("purpur@gmail.com");
       // $(By.xpath("//button[@class='lk-enter-btn ng-scope']")).should(Condition.visible).click();
        //Thread.sleep(2000);
        //$(By.xpath("//button[@class='lk-enter-btn ng-scope']")).should(Condition.visible).click(); //button[@class='lk-enter-btn ng-scope']

        $(By.cssSelector("[id=login]")).should(Condition.visible).setValue("purpur.com");
        $(By.cssSelector("[type=password]")).should(Condition.visible).setValue("1235678");
        $(By.xpath("//button[@ng-click='login()']")).should(Condition.visible).click();
        Thread.sleep(2000);

        //label[@ng-tr='WHE.WHE25']
    }
}
