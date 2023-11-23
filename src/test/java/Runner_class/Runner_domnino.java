package Runner_class;


import Baseclass.Base_domino;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Dell\\IdeaProjects\\Domino_pizza\\src\\test\\java\\Domino.feature",
        glue = "Stepup_definition",
        dryRun = false
)


public class Runner_domnino extends Base_domino {
@BeforeClass
    public static void start(){

    driver=new ChromeDriver();
    }


@AfterClass
public static void close(){
    driver.close();
}
}
