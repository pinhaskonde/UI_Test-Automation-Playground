import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T1 {

    WebDriver wd = new ChromeDriver();

    @Test
    public void t1(){
//        wd.navigate().to("http://uitestingplayground.com/");
        wd.navigate().to("https://www.google.com/");


        wd.manage().window().maximize();

//        wd.quit();
    }
}
